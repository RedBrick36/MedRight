/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import static org.redbrick.medright.DatabaseOps.createDatabaseConnection;

/**
 *
 * @author RedBrick
 */
public class SecurityCheck
    extends javax.swing.JFrame {

private static final long serialVersionUID = 1L;
private String[] args;
private Connection conn;
private Connection connection;
private PreparedStatement ps;
private ResultSet rs;
private SecurityCheck sc;
private String secCheck;

/**
 * Creates new form SecurityCheck
 *
 * @throws java.lang.ClassNotFoundException
 * @throws java.lang.InstantiationException
 * @throws java.lang.IllegalAccessException
 * @throws java.sql.SQLException
 */
public SecurityCheck () throws ClassNotFoundException,
    InstantiationException, IllegalAccessException,
    SQLException {
  this.initComponents ();

}

public void securityCheckClose () {

  WindowEvent winClosingEvent = new WindowEvent (this, WindowEvent.WINDOW_CLOS­ING);
  Toolkit.getDefaultToolkit ().getSystemEve­ntQueue ().postEvent (winClosingEvent);
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

    jPasswordField = new javax.swing.JPasswordField();
    btnSubmit = new javax.swing.JButton();
    Password = new javax.swing.JLabel();
    jTextFieldUserName = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    UserName = new javax.swing.JLabel();
    menuBar = new javax.swing.JMenuBar();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setAlwaysOnTop(true);
    setBounds(new java.awt.Rectangle(200, 300, 0, 0));
    setLocation(new java.awt.Point(100, 200));
    setName("secCheckFrame"); // NOI18N
    addPropertyChangeListener(new java.beans.PropertyChangeListener() {
      public void propertyChange(java.beans.PropertyChangeEvent evt) {
        formPropertyChange(evt);
      }
    });

    jPasswordField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jPasswordField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jPasswordFieldActionPerformed(evt);
      }
    });

    btnSubmit.setText("Submit");
    btnSubmit.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
    btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnSubmitMouseClicked(evt);
      }
    });
    btnSubmit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSubmitActionPerformed(evt);
      }
    });

    Password.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
    Password.setText("Password");

    jTextFieldUserName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldUserNameActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jLabel1.setText("Please Enter Your Username and Password");

    UserName.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
    UserName.setText("UserName");

    menuBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
    setJMenuBar(menuBar);

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(48, 48, 48)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
              .add(btnSubmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(108, 108, 108))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1))
          .add(layout.createSequentialGroup()
            .add(32, 32, 32)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
              .add(UserName)
              .add(Password))
            .add(18, 18, 18)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
              .add(jTextFieldUserName)
              .add(jPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(58, 58, 58)))
        .addContainerGap(48, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(16, 16, 16)
        .add(jLabel1)
        .add(25, 25, 25)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jTextFieldUserName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(UserName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(Password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(18, 18, 18)
        .add(btnSubmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(16, Short.MAX_VALUE))
    );

    getAccessibleContext().setAccessibleName("secCheckFrame");
    getAccessibleContext().setAccessibleDescription("");

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked

  }//GEN-LAST:event_btnSubmitMouseClicked

  private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
  // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldUserNameActionPerformed

  private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
  // TODO add your handling code here:
  }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

  try {
    this.secCheck = "login";
    this.conn = createDatabaseConnection (this.secCheck);
    String query = "SELECT * FROM APP.USERS where UserName =? and Password=?";
    String reset = "";
    //   do {
    //     try {
    this.ps = this.conn.prepareStatement (query);
    this.ps.setString (1, this.jTextFieldUserName.getText ());
    this.jPasswordField.selectAll ();
    this.ps.setString (2, this.jPasswordField.getSelectedText ());
    this.rs = this.ps.executeQuery ();
    if ( this.rs.next () ) {
      JOptionPane.showMessageDialog (null, "Authenticated!");
      this.conn.close ();
      org.redbrick.medright.MedRightStartGUI.main (this.args);
      this.dispose ();
    }
    else {

      JOptionPane.showMessageDialog (null,
                                     "Username or Password is Incorrecct ",
                                     "Access Denied! ",
                                     JOptionPane.ERROR_MESSAGE);
    }
  }
  catch ( ClassNotFoundException |
          InstantiationException |
          IllegalAccessException |
          SQLException ex ) {
    Logger.getLogger (SecurityCheck.class
        .getName ()).
        log (Level.SEVERE,
             null,
             ex);

  }
    }//GEN-LAST:event_btnSubmitActionPerformed

  private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
  // TODO add your handling code here:
  }//GEN-LAST:event_formPropertyChange

/**
 * @param args the command line arguments
 */
public static void main (String args[]) {
  /*
   * Set the Nimbus look and feel
   */
  //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
   * If Nimbus (introduced in Java SE 6) is not available, stay
   * with the default look and feel.
   * For details see
   * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
   */
  try {
    for ( javax.swing.UIManager.LookAndFeelInfo info
          : javax.swing.UIManager.
        getInstalledLookAndFeels () ) {
      if ( "Metal".equals (info.getName ()) ) {
        javax.swing.UIManager.setLookAndFeel (info.
            getClassName ());
        break;

      }
    }
  }
  catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
    java.util.logging.Logger.getLogger (SecurityCheck.class
        .
        getName ()).
        log (java.util.logging.Level.SEVERE,
             null,
             ex);
  }
  //</editor-fold>

  //</editor-fold>

  /*
   * Create and display the form
   */
  java.awt.EventQueue.invokeLater (new Runnable () {
  @Override
  public void run () {
    try {
      new SecurityCheck ().setVisible (true);

    }
    catch ( ClassNotFoundException |
            InstantiationException |
            IllegalAccessException |
            SQLException ex ) {
      Logger.getLogger (SecurityCheck.class
          .getName ()).
          log (Level.SEVERE,
               null,
               ex);
    }
  }
  });
}
  // Variables declaration - do not modify//GEN-BEGIN:variables
  javax.swing.JLabel Password;
  javax.swing.JLabel UserName;
  javax.swing.JButton btnSubmit;
  javax.swing.JLabel jLabel1;
  javax.swing.JPasswordField jPasswordField;
  javax.swing.JTextField jTextFieldUserName;
  javax.swing.JMenuBar menuBar;
  // End of variables declaration//GEN-END:variables
}
