/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.redbrick.medright.exceptions.*;

/**
 *
 * @author RedBrick
 */
public class TreatmentsJpaController implements Serializable {

  public TreatmentsJpaController (EntityManagerFactory emf) {
    this.emf = emf;
  }
  private EntityManagerFactory emf = null;

  public EntityManager getEntityManager () {
    return emf.createEntityManager ();
  }

  public void create (Treatments treatments) throws PreexistingEntityException, Exception {
    EntityManager em = null;
    try {
      em = getEntityManager ();
      em.getTransaction ().begin ();
      em.persist (treatments);
      em.getTransaction ().commit ();
    }
    catch ( Exception ex ) {
      if ( findTreatments (treatments.getUuid ()) != null ) {
        throw new PreexistingEntityException ("Treatments " + treatments + " already exists.", ex);
      }
      throw ex;
    }
    finally {
      if ( em != null ) {
        em.close ();
      }
    }
  }

  public void edit (Treatments treatments) throws NonexistentEntityException, Exception {
    EntityManager em = null;
    try {
      em = getEntityManager ();
      em.getTransaction ().begin ();
      treatments = em.merge (treatments);
      em.getTransaction ().commit ();
    }
    catch ( Exception ex ) {
      String msg = ex.getLocalizedMessage ();
      if ( msg == null || msg.length () == 0 ) {
        Integer id = treatments.getUuid ();
        if ( findTreatments (id) == null ) {
          throw new NonexistentEntityException ("The treatments with id " + id + " no longer exists.");
        }
      }
      throw ex;
    }
    finally {
      if ( em != null ) {
        em.close ();
      }
    }
  }

  public void destroy (Integer id) throws NonexistentEntityException {
    EntityManager em = null;
    try {
      em = getEntityManager ();
      em.getTransaction ().begin ();
      Treatments treatments;
      try {
        treatments = em.getReference (Treatments.class, id);
        treatments.getUuid ();
      }
      catch ( EntityNotFoundException enfe ) {
        throw new NonexistentEntityException ("The treatments with id " + id + " no longer exists.", enfe);
      }
      em.remove (treatments);
      em.getTransaction ().commit ();
    }
    finally {
      if ( em != null ) {
        em.close ();
      }
    }
  }

  public List<Treatments> findTreatmentsEntities () {
    return findTreatmentsEntities (true, -1, -1);
  }

  public List<Treatments> findTreatmentsEntities (int maxResults, int firstResult) {
    return findTreatmentsEntities (false, maxResults, firstResult);
  }

  private List<Treatments> findTreatmentsEntities (boolean all, int maxResults, int firstResult) {
    EntityManager em = getEntityManager ();
    try {
      CriteriaQuery cq = em.getCriteriaBuilder ().createQuery ();
      cq.select (cq.from (Treatments.class));
      Query q = em.createQuery (cq);
      if ( !all ) {
        q.setMaxResults (maxResults);
        q.setFirstResult (firstResult);
      }
      return q.getResultList ();
    }
    finally {
      em.close ();
    }
  }

  public Treatments findTreatments (Integer id) {
    EntityManager em = getEntityManager ();
    try {
      return em.find (Treatments.class, id);
    }
    finally {
      em.close ();
    }
  }

  public int getTreatmentsCount () {
    EntityManager em = getEntityManager ();
    try {
      CriteriaQuery cq = em.getCriteriaBuilder ().createQuery ();
      Root<Treatments> rt = cq.from (Treatments.class);
      cq.select (em.getCriteriaBuilder ().count (rt));
      Query q = em.createQuery (cq);
      return ( (Long) q.getSingleResult () ).intValue ();
    }
    finally {
      em.close ();
    }
  }
}
