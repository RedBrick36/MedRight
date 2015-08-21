/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author RedBrick
 */
public class SecurityCheck extends javax.swing.JFrame {

  private static final long serialVersionUID = 1L;
  private String[] args;
  private final boolean success;

  private Connection connection = null;

  /**
   * Creates new form SecurityCheck
   *
   * @throws java.lang.ClassNotFoundException
   * @throws java.lang.InstantiationException
   * @throws java.lang.IllegalAccessException
   * @throws java.sql.SQLException
   */
  public SecurityCheck () throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
    initComponents ();
    connection = Login.createDatabaseConnection ();
    success = Login.createTableIfNecessary ();
  }

  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings ("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    openMenuItem = new javax.swing.JMenuItem();
    saveMenuItem = new javax.swing.JMenuItem();
    saveAsMenuItem = new javax.swing.JMenuItem();
    exitMenuItem = new javax.swing.JMenuItem();
    editMenu = new javax.swing.JMenu();
    cutMenuItem = new javax.swing.JMenuItem();
    copyMenuItem = new javax.swing.JMenuItem();
    pasteMenuItem = new javax.swing.JMenuItem();
    deleteMenuItem = new javax.swing.JMenuItem();
    helpMenu = new javax.swing.JMenu();
    contentsMenuItem = new javax.swing.JMenuItem();
    aboutMenuItem = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    fileMenu.setMnemonic('f');
    fileMenu.setText("File");

    openMenuItem.setMnemonic('o');
    openMenuItem.setText("Open");
    fileMenu.add(openMenuItem);

    saveMenuItem.setMnemonic('s');
    saveMenuItem.setText("Save");
    fileMenu.add(saveMenuItem);

    saveAsMenuItem.setMnemonic('a');
    saveAsMenuItem.setText("Save As ...");
    saveAsMenuItem.setDisplayedMnemonicIndex(5);
    fileMenu.add(saveAsMenuItem);

    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Exit");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(exitMenuItem);

    menuBar.add(fileMenu);

    editMenu.setMnemonic('e');
    editMenu.setText("Edit");

    cutMenuItem.setMnemonic('t');
    cutMenuItem.setText("Cut");
    editMenu.add(cutMenuItem);

    copyMenuItem.setMnemonic('y');
    copyMenuItem.setText("Copy");
    editMenu.add(copyMenuItem);

    pasteMenuItem.setMnemonic('p');
    pasteMenuItem.setText("Paste");
    editMenu.add(pasteMenuItem);

    deleteMenuItem.setMnemonic('d');
    deleteMenuItem.setText("Delete");
    editMenu.add(deleteMenuItem);

    menuBar.add(editMenu);

    helpMenu.setMnemonic('h');
    helpMenu.setText("Help");

    contentsMenuItem.setMnemonic('c');
    contentsMenuItem.setText("Contents");
    helpMenu.add(contentsMenuItem);

    aboutMenuItem.setMnemonic('a');
    aboutMenuItem.setText("About");
    helpMenu.add(aboutMenuItem);

    menuBar.add(helpMenu);

    setJMenuBar(menuBar);

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 279, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit ( 0 );
    }//GEN-LAST:event_exitMenuItemActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main (String args[]) {
    /*
     * Set the Nimbus look and feel
     */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels () ) {
        if ( "Metal".equals ( info.getName () ) ) {
          javax.swing.UIManager.setLookAndFeel ( info.getClassName () );
          break;
        }
      }
    } catch ( ClassNotFoundException ex ) {
      java.util.logging.Logger.getLogger ( SecurityCheck.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
    } catch ( InstantiationException ex ) {
      java.util.logging.Logger.getLogger ( SecurityCheck.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
    } catch ( IllegalAccessException ex ) {
      java.util.logging.Logger.getLogger ( SecurityCheck.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
    } catch ( javax.swing.UnsupportedLookAndFeelException ex ) {
      java.util.logging.Logger.getLogger ( SecurityCheck.class.getName () ).log ( java.util.logging.Level.SEVERE, null, ex );
    }
    //</editor-fold>

    /*
     * Create and display the form
     */
    java.awt.EventQueue.invokeLater ( new Runnable () {
      @Override
      public void run () {
        try {
          new SecurityCheck ().setVisible ( true );
        } catch ( ClassNotFoundException ex ) {
          Logger.getLogger ( SecurityCheck.class.getName () ).log ( Level.SEVERE, null, ex );
        } catch ( InstantiationException ex ) {
          Logger.getLogger ( SecurityCheck.class.getName () ).log ( Level.SEVERE, null, ex );
        } catch ( IllegalAccessException ex ) {
          Logger.getLogger ( SecurityCheck.class.getName () ).log ( Level.SEVERE, null, ex );
        } catch ( SQLException ex ) {
          Logger.getLogger ( SecurityCheck.class.getName () ).log ( Level.SEVERE, null, ex );
        }
      }
    } );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem aboutMenuItem;
  private javax.swing.JMenuItem contentsMenuItem;
  private javax.swing.JMenuItem copyMenuItem;
  private javax.swing.JMenuItem cutMenuItem;
  private javax.swing.JMenuItem deleteMenuItem;
  private javax.swing.JMenu editMenu;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JMenu helpMenu;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenuItem openMenuItem;
  private javax.swing.JMenuItem pasteMenuItem;
  private javax.swing.JMenuItem saveAsMenuItem;
  private javax.swing.JMenuItem saveMenuItem;
  // End of variables declaration//GEN-END:variables

}
