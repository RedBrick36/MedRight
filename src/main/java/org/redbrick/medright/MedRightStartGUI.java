/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;

/**
 *
 * @author RedBrick
 */
public class MedRightStartGUI extends javax.swing.JFrame {

private static final long serialVersionUID = 1L;

/**
 * Creates new form MedRightTopLevel
 *
 * @throws java.lang.ClassNotFoundException
 * @throws java.lang.InstantiationException
 * @throws java.lang.IllegalAccessException
 */
public MedRightStartGUI () throws ClassNotFoundException, InstantiationException, IllegalAccessException {
  this.initComponents ();

}

public void closeMedStartGUI () {

  WindowEvent winClosingEvent = new WindowEvent (this, WindowEvent.WINDOW_CLOS­ING);
  Toolkit.getDefaultToolkit ().getSystemEve­ntQueue ().postEvent (winClosingEvent);
}

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    entityMedRight = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("org.redbrick_MedRight_jar_1.0-SNAPSHOTPU").createEntityManager();
    pillScrollPane = new javax.swing.JScrollPane();
    pillTable = new javax.swing.JTable();
    Treatments = new javax.swing.JTabbedPane();
    pills = new javax.swing.JPanel();
    pillsPane = new javax.swing.JScrollPane();
    pillsTable = new javax.swing.JTable();
    liquids = new javax.swing.JPanel();
    liquidsScrollPane = new javax.swing.JScrollPane();
    liquidsTable = new javax.swing.JTable();
    injections = new javax.swing.JPanel();
    injectionsScrollPane1 = new javax.swing.JScrollPane();
    injectionsTable = new javax.swing.JTable();
    topicals = new javax.swing.JPanel();
    topicalsScrollPanel = new javax.swing.JScrollPane();
    topicalsTable = new javax.swing.JTable();
    supplements = new javax.swing.JPanel();
    supplementsScrollPanel = new javax.swing.JScrollPane();
    SupplementsTable = new javax.swing.JTable();
    iteminfo = new javax.swing.JPanel();
    iteminfoScrollPanel = new javax.swing.JScrollPane();
    iteminfoJTree = new javax.swing.JTree();
    iteminfoScrollPane = new javax.swing.JScrollPane();
    schedule = new javax.swing.JPanel();
    scheduleScrollPane = new javax.swing.JScrollPane();
    scheduleTable = new javax.swing.JTable();
    toggleTookAM = new javax.swing.JToggleButton();
    toggleTookMM = new javax.swing.JToggleButton();
    toggleTookNoon = new javax.swing.JToggleButton();
    toggleTookMidAft = new javax.swing.JToggleButton();
    toggleTookAft = new javax.swing.JToggleButton();
    toggleTookEve = new javax.swing.JToggleButton();
    toggleTookBedtime = new javax.swing.JToggleButton();
    toggleTookNight = new javax.swing.JToggleButton();
    jProgressBar1 = new javax.swing.JProgressBar();
    Tools = new javax.swing.JPanel();
    jPasswordField1 = new javax.swing.JPasswordField();
    btnConfigureTime = new javax.swing.JButton();
    btnCrud = new javax.swing.JButton();
    btnSubmit = new javax.swing.JButton();
    btnBackup = new javax.swing.JButton();
    btnRestore = new javax.swing.JButton();
    btnDeleteAllData = new javax.swing.JButton();
    btnChangePW = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTextArea2 = new javax.swing.JTextArea();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane4 = new javax.swing.JScrollPane();
    jTextArea4 = new javax.swing.JTextArea();
    banner = new javax.swing.JLabel();
    version = new javax.swing.JLabel();
    creator = new javax.swing.JLabel();
    btnAddNewSchedule = new javax.swing.JButton();
    TimeToNextSPanel = new javax.swing.JScrollPane();
    TimeToNextTArea = new javax.swing.JTextArea();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    exitMenuItem = new javax.swing.JMenuItem();
    helpMenu = new javax.swing.JMenu();
    contentsMenuItem = new javax.swing.JMenuItem();
    aboutMenuItem = new javax.swing.JMenuItem();

    pillTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Name", "Size", "Dose", "Condition"
      }
    ) {
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    pillTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    pillTable.setCellSelectionEnabled(true);
    pillTable.setShowGrid(true);
    pillScrollPane.setViewportView(pillTable);

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("MedRight© Treatment Tracker");
    setBounds(new java.awt.Rectangle(0, 23, 761, 540));
    setMinimumSize(new java.awt.Dimension(761, 540));
    setName("mainframe"); // NOI18N
    setSize(new java.awt.Dimension(761, 500));

    Treatments.setToolTipText("");

    pills.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    pills.setToolTipText("");

    pillsTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Name", "Dose", "Measure", "Condition"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    pillsPane.setViewportView(pillsTable);

    org.jdesktop.layout.GroupLayout pillsLayout = new org.jdesktop.layout.GroupLayout(pills);
    pills.setLayout(pillsLayout);
    pillsLayout.setHorizontalGroup(
      pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 1016, Short.MAX_VALUE)
      .add(pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(pillsPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE))
    );
    pillsLayout.setVerticalGroup(
      pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(0, 581, Short.MAX_VALUE)
      .add(pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(pillsPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
    );

    Treatments.addTab("Pills", pills);

    liquids.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    liquidsTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Name", "Dose", "Measure", "Condition"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    liquidsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    liquidsScrollPane.setViewportView(liquidsTable);

    org.jdesktop.layout.GroupLayout liquidsLayout = new org.jdesktop.layout.GroupLayout(liquids);
    liquids.setLayout(liquidsLayout);
    liquidsLayout.setHorizontalGroup(
      liquidsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(liquidsScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
    );
    liquidsLayout.setVerticalGroup(
      liquidsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(liquidsScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
    );

    Treatments.addTab("Liquids", liquids);

    injections.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    injectionsTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Name", "Dose", "Measure", "Condition"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    injectionsScrollPane1.setViewportView(injectionsTable);

    org.jdesktop.layout.GroupLayout injectionsLayout = new org.jdesktop.layout.GroupLayout(injections);
    injections.setLayout(injectionsLayout);
    injectionsLayout.setHorizontalGroup(
      injectionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(injectionsScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
    );
    injectionsLayout.setVerticalGroup(
      injectionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(injectionsScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
    );

    Treatments.addTab("Injections", injections);

    topicals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    topicalsTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Name", "Dose", "Measure", "Condition"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    topicalsScrollPanel.setViewportView(topicalsTable);

    org.jdesktop.layout.GroupLayout topicalsLayout = new org.jdesktop.layout.GroupLayout(topicals);
    topicals.setLayout(topicalsLayout);
    topicalsLayout.setHorizontalGroup(
      topicalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(topicalsScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
    );
    topicalsLayout.setVerticalGroup(
      topicalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(topicalsScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
    );

    Treatments.addTab("Topicals", topicals);

    supplements.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    SupplementsTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Name", "Dose", "Measure", "Condition"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    supplementsScrollPanel.setViewportView(SupplementsTable);

    org.jdesktop.layout.GroupLayout supplementsLayout = new org.jdesktop.layout.GroupLayout(supplements);
    supplements.setLayout(supplementsLayout);
    supplementsLayout.setHorizontalGroup(
      supplementsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(supplementsScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
    );
    supplementsLayout.setVerticalGroup(
      supplementsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(supplementsScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
    );

    Treatments.addTab("Supplements", supplements);

    iteminfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Treatments");
    javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pills");
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Liquids");
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Injections");
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Topicals");
    treeNode1.add(treeNode2);
    treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Fitness");
    treeNode1.add(treeNode2);
    iteminfoJTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
    iteminfoJTree.setAutoscrolls(true);
    iteminfoJTree.setMinimumSize(new java.awt.Dimension(78, 72));
    iteminfoJTree.setSize(new java.awt.Dimension(78, 72));
    iteminfoScrollPanel.setViewportView(iteminfoJTree);

    org.jdesktop.layout.GroupLayout iteminfoLayout = new org.jdesktop.layout.GroupLayout(iteminfo);
    iteminfo.setLayout(iteminfoLayout);
    iteminfoLayout.setHorizontalGroup(
      iteminfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(iteminfoLayout.createSequentialGroup()
        .add(iteminfoScrollPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(iteminfoScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE))
    );
    iteminfoLayout.setVerticalGroup(
      iteminfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(iteminfoScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, iteminfoScrollPane)
    );

    Treatments.addTab("Treatment Info", iteminfo);

    schedule.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    schedule.setPreferredSize(new java.awt.Dimension(722, 340));

    scheduleTable.setAutoCreateRowSorter(true);
    scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null}
      },
      new String [] {
        "A.M.", "Mid Morning", "Noon", "Mid Afternoon", "Afternoon", "Evening", "Bedtime", "Middle of Night"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    scheduleTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    scheduleTable.setColumnSelectionAllowed(true);
    scheduleTable.setEnabled(false);
    scheduleScrollPane.setViewportView(scheduleTable);

    toggleTookAM.setText("Took AM");
    toggleTookAM.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookAM.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAM.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAM.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAM.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAMActionPerformed(evt);
      }
    });

    toggleTookMM.setText("Took MM");
    toggleTookMM.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookMM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookMM.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookMM.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookMM.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookMM.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookMMActionPerformed(evt);
      }
    });

    toggleTookNoon.setText(" Took Noon ");
    toggleTookNoon.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookNoon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookNoon.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookNoon.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookNoon.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookNoon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookNoonActionPerformed(evt);
      }
    });

    toggleTookMidAft.setText(" Took MidAft ");
    toggleTookMidAft.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookMidAft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookMidAft.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookMidAft.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookMidAft.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookMidAft.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookMidAftActionPerformed(evt);
      }
    });

    toggleTookAft.setText("Took Aft");
    toggleTookAft.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookAft.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAft.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAft.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAft.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAftActionPerformed(evt);
      }
    });

    toggleTookEve.setText("Took Eve");
    toggleTookEve.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookEve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookEve.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookEve.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookEve.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookEve.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookEveActionPerformed(evt);
      }
    });

    toggleTookBedtime.setText(" Took Bedtime ");
    toggleTookBedtime.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookBedtime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookBedtime.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookBedtime.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookBedtime.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookBedtime.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookBedtimeActionPerformed(evt);
      }
    });

    toggleTookNight.setText("  Took Night ");
    toggleTookNight.setAutoscrolls(true);
    toggleTookNight.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookNight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    toggleTookNight.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    toggleTookNight.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookNight.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookNight.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookNight.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookNightActionPerformed(evt);
      }
    });

    org.jdesktop.layout.GroupLayout scheduleLayout = new org.jdesktop.layout.GroupLayout(schedule);
    schedule.setLayout(scheduleLayout);
    scheduleLayout.setHorizontalGroup(
      scheduleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(scheduleScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
      .add(scheduleLayout.createSequentialGroup()
        .addContainerGap()
        .add(scheduleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(scheduleLayout.createSequentialGroup()
            .add(jProgressBar1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
          .add(scheduleLayout.createSequentialGroup()
            .add(12, 12, 12)
            .add(toggleTookAM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(56, 56, 56)
            .add(toggleTookMM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(47, 47, 47)
            .add(toggleTookNoon, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(35, 35, 35)
            .add(toggleTookMidAft, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(46, 46, 46)
            .add(toggleTookAft, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(57, 57, 57)
            .add(toggleTookEve, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(39, 39, 39)
            .add(toggleTookBedtime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(30, 30, 30)
            .add(toggleTookNight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    scheduleLayout.setVerticalGroup(
      scheduleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(scheduleLayout.createSequentialGroup()
        .add(jProgressBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(13, 13, 13)
        .add(scheduleScrollPane)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(scheduleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(toggleTookAM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookMM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookNoon, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookMidAft, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookAft, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookEve, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookBedtime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookNight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(14, 14, 14))
    );

    toggleTookNight.getAccessibleContext().setAccessibleName("TookMON"); // NOI18N

    Treatments.addTab("Todays Schedule", schedule);

    Tools.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jPasswordField1.setAutoscrolls(false);
    jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEtchedBorder()));
    jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jPasswordField1ActionPerformed(evt);
      }
    });

    btnConfigureTime.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    btnConfigureTime.setForeground(new java.awt.Color(255, 51, 0));
    btnConfigureTime.setText("  Configure Time Frames  ");
    btnConfigureTime.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    btnCrud.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    btnCrud.setForeground(new java.awt.Color(255, 51, 0));
    btnCrud.setText("  Edit the Database  ");
    btnCrud.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    btnSubmit.setText("  Submit  ");
    btnSubmit.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
    btnSubmit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSubmitActionPerformed(evt);
      }
    });

    btnBackup.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    btnBackup.setForeground(new java.awt.Color(255, 51, 0));
    btnBackup.setText("  Backup Database  ");
    btnBackup.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    btnRestore.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    btnRestore.setForeground(new java.awt.Color(255, 51, 0));
    btnRestore.setText("  Restore Database  ");
    btnRestore.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    btnDeleteAllData.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    btnDeleteAllData.setForeground(new java.awt.Color(255, 51, 0));
    btnDeleteAllData.setText("  Delete All Data  ");
    btnDeleteAllData.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    btnChangePW.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    btnChangePW.setForeground(new java.awt.Color(255, 51, 0));
    btnChangePW.setText(" Change Password  ");
    btnChangePW.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
    jTextArea2.setColumns(20);
    jTextArea2.setForeground(new java.awt.Color(0, 153, 0));
    jTextArea2.setLineWrap(true);
    jTextArea2.setRows(3);
    jTextArea2.setText("     Buttons will unlock and turn                        GREEN\n     when the correct password\n            has been entered.");
    jTextArea2.setWrapStyleWord(true);
    jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jTextArea2.setCaretColor(new java.awt.Color(51, 255, 51));
    jTextArea2.setDisabledTextColor(new java.awt.Color(51, 255, 51));
    jTextArea2.setFocusable(false);
    jScrollPane2.setViewportView(jTextArea2);

    jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    jLabel2.setText("Your Password is Required to Unlock these Tools");

    jTextArea4.setColumns(20);
    jTextArea4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jTextArea4.setLineWrap(true);
    jTextArea4.setRows(2);
    jTextArea4.setText("      Use of Delete\n        All Data is\n    Non-Reversible!");
    jTextArea4.setWrapStyleWord(true);
    jTextArea4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), javax.swing.BorderFactory.createTitledBorder(null, "WARNING!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18)))); // NOI18N
    jTextArea4.setFocusable(false);
    jScrollPane4.setViewportView(jTextArea4);

    org.jdesktop.layout.GroupLayout ToolsLayout = new org.jdesktop.layout.GroupLayout(Tools);
    Tools.setLayout(ToolsLayout);
    ToolsLayout.setHorizontalGroup(
      ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(ToolsLayout.createSequentialGroup()
        .add(68, 68, 68)
        .add(ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
          .add(org.jdesktop.layout.GroupLayout.LEADING, btnCrud)
          .add(btnConfigureTime)
          .add(org.jdesktop.layout.GroupLayout.LEADING, btnBackup)
          .add(org.jdesktop.layout.GroupLayout.LEADING, ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
            .add(btnChangePW)
            .add(btnRestore)))
        .add(ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(ToolsLayout.createSequentialGroup()
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 76, Short.MAX_VALUE)
            .add(ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 219, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(448, 448, 448))
          .add(ToolsLayout.createSequentialGroup()
            .add(ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(ToolsLayout.createSequentialGroup()
                .add(150, 150, 150)
                .add(btnSubmit))
              .add(ToolsLayout.createSequentialGroup()
                .add(111, 111, 111)
                .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
            .add(0, 0, Short.MAX_VALUE))))
      .add(ToolsLayout.createSequentialGroup()
        .add(ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(ToolsLayout.createSequentialGroup()
            .add(213, 213, 213)
            .add(jLabel2))
          .add(ToolsLayout.createSequentialGroup()
            .add(396, 396, 396)
            .add(btnDeleteAllData)))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    ToolsLayout.setVerticalGroup(
      ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(ToolsLayout.createSequentialGroup()
        .addContainerGap()
        .add(jLabel2)
        .add(18, 18, 18)
        .add(ToolsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(ToolsLayout.createSequentialGroup()
            .add(21, 21, 21)
            .add(btnConfigureTime)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(btnCrud)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(btnBackup)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(btnRestore)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(btnChangePW))
          .add(ToolsLayout.createSequentialGroup()
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(20, 20, 20)
            .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(btnSubmit)
            .add(16, 16, 16)
            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .add(24, 24, 24)
        .add(btnDeleteAllData)
        .add(200, 200, 200))
    );

    Treatments.addTab("Tools", Tools);

    banner.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    banner.setText("MedRight© Treatement Tracker");
    banner.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    version.setText("Ver 0.1");

    creator.setText("RedBrick.Org, 2015");

    btnAddNewSchedule.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    btnAddNewSchedule.setText("  Add New Schedule  ");
    btnAddNewSchedule.setBorder(new javax.swing.border.MatteBorder(null));
    btnAddNewSchedule.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnAddNewSchedule.setIconTextGap(6);
    btnAddNewSchedule.setMargin(new java.awt.Insets(4, 14, 4, 14));
    btnAddNewSchedule.setMaximumSize(new java.awt.Dimension(147, 25));
    btnAddNewSchedule.setMinimumSize(new java.awt.Dimension(147, 25));
    btnAddNewSchedule.setPreferredSize(new java.awt.Dimension(147, 25));
    btnAddNewSchedule.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnAddNewScheduleActionPerformed(evt);
      }
    });

    TimeToNextTArea.setColumns(2);
    TimeToNextTArea.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    TimeToNextTArea.setRows(1);
    TimeToNextTArea.setAutoscrolls(false);
    TimeToNextTArea.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "Time to Next Treatment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 18)))); // NOI18N
    TimeToNextTArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    TimeToNextTArea.setFocusable(false);
    TimeToNextTArea.setMinimumSize(new java.awt.Dimension(232, 60));
    TimeToNextSPanel.setViewportView(TimeToNextTArea);

    menuBar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

    fileMenu.setMnemonic('f');
    fileMenu.setText("File");
    fileMenu.setAlignmentX(2.5F);
    fileMenu.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
    fileMenu.setIconTextGap(6);
    fileMenu.setMargin(new java.awt.Insets(4, 4, 4, 4));

    exitMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Exit");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(exitMenuItem);

    menuBar.add(fileMenu);

    helpMenu.setMnemonic('h');
    helpMenu.setText("Help");
    helpMenu.setAlignmentX(1.5F);
    helpMenu.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
    helpMenu.setIconTextGap(6);

    contentsMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    contentsMenuItem.setMnemonic('c');
    contentsMenuItem.setText("Contents");
    helpMenu.add(contentsMenuItem);

    aboutMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    aboutMenuItem.setMnemonic('a');
    aboutMenuItem.setText("About");
    helpMenu.add(aboutMenuItem);

    menuBar.add(helpMenu);

    setJMenuBar(menuBar);

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(Treatments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1027, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .add(layout.createSequentialGroup()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(35, 35, 35)
            .add(version)
            .add(37, 37, 37)
            .add(creator))
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(banner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 294, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(TimeToNextSPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 274, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(136, 136, 136)
        .add(btnAddNewSchedule, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(67, 67, 67))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
          .add(layout.createSequentialGroup()
            .add(banner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(18, 18, 18)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
              .add(version, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(creator))
            .add(10, 10, 10))
          .add(layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
              .add(org.jdesktop.layout.GroupLayout.LEADING, TimeToNextSPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(btnAddNewSchedule, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(14, 14, 14)))
        .add(Treatments)
        .add(20, 20, 20))
    );

    Treatments.getAccessibleContext().setAccessibleName("treatmentsJTabbedPane");

    getAccessibleContext().setAccessibleName("medrightMainGUI");
    getAccessibleContext().setAccessibleDescription("");

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void toggleTookAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAMActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAMActionPerformed

    private void toggleTookMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookMMActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookMMActionPerformed

    private void toggleTookNoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookNoonActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookNoonActionPerformed

    private void toggleTookMidAftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookMidAftActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookMidAftActionPerformed

    private void toggleTookAftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAftActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAftActionPerformed

    private void toggleTookEveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookEveActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookEveActionPerformed

    private void toggleTookBedtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookBedtimeActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookBedtimeActionPerformed

    private void btnAddNewScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewScheduleActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewScheduleActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
  System.exit (0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void toggleTookNightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookNightActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookNightActionPerformed

  private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
  // TODO add your handling code here:
  }//GEN-LAST:event_btnSubmitActionPerformed

  private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
  // TODO add your handling code here:
  }//GEN-LAST:event_jPasswordField1ActionPerformed

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
    for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels () ) {
      if ( "Metal".equals (info.getName ()) ) {
        javax.swing.UIManager.setLookAndFeel (info.getClassName ());
        break;

      }
    }
  }
  catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex ) {
    java.util.logging.Logger.getLogger (
        MedRightStartGUI.class.getName ()).
        log (java.util.logging.Level.SEVERE,
             null,
             ex);
  }
  //</editor-fold>
  //</editor-fold>

  //</editor-fold>
  //</editor-fold>

  /*
   * Create and display the form
   */
  java.awt.EventQueue.invokeLater (new Runnable () {
  @Override
  public void run () {
    try {
      new MedRightStartGUI ().setVisible (true);

    }
    catch ( ClassNotFoundException | InstantiationException | IllegalAccessException ex ) {
      Logger.getLogger (MedRightStartGUI.class.getName ()).log (Level.SEVERE, null, ex);
    }

  }

  });
}
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTable SupplementsTable;
  private javax.swing.JScrollPane TimeToNextSPanel;
  private javax.swing.JTextArea TimeToNextTArea;
  private javax.swing.JPanel Tools;
  private javax.swing.JTabbedPane Treatments;
  private javax.swing.JMenuItem aboutMenuItem;
  private javax.swing.JLabel banner;
  private javax.swing.JButton btnAddNewSchedule;
  private javax.swing.JButton btnBackup;
  private javax.swing.JButton btnChangePW;
  private javax.swing.JButton btnConfigureTime;
  private javax.swing.JButton btnCrud;
  private javax.swing.JButton btnDeleteAllData;
  private javax.swing.JButton btnRestore;
  private javax.swing.JButton btnSubmit;
  private javax.swing.JMenuItem contentsMenuItem;
  private javax.swing.JLabel creator;
  private javax.persistence.EntityManager entityMedRight;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JMenu helpMenu;
  private javax.swing.JPanel injections;
  private javax.swing.JScrollPane injectionsScrollPane1;
  private javax.swing.JTable injectionsTable;
  private javax.swing.JPanel iteminfo;
  private javax.swing.JTree iteminfoJTree;
  private javax.swing.JScrollPane iteminfoScrollPane;
  private javax.swing.JScrollPane iteminfoScrollPanel;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPasswordField jPasswordField1;
  private javax.swing.JProgressBar jProgressBar1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JTextArea jTextArea2;
  private javax.swing.JTextArea jTextArea4;
  private javax.swing.JPanel liquids;
  private javax.swing.JScrollPane liquidsScrollPane;
  private javax.swing.JTable liquidsTable;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JScrollPane pillScrollPane;
  private javax.swing.JTable pillTable;
  private javax.swing.JPanel pills;
  private javax.swing.JScrollPane pillsPane;
  private javax.swing.JTable pillsTable;
  private javax.swing.JPanel schedule;
  private javax.swing.JScrollPane scheduleScrollPane;
  private javax.swing.JTable scheduleTable;
  private javax.swing.JPanel supplements;
  private javax.swing.JScrollPane supplementsScrollPanel;
  private javax.swing.JToggleButton toggleTookAM;
  private javax.swing.JToggleButton toggleTookAft;
  private javax.swing.JToggleButton toggleTookBedtime;
  private javax.swing.JToggleButton toggleTookEve;
  private javax.swing.JToggleButton toggleTookMM;
  private javax.swing.JToggleButton toggleTookMidAft;
  private javax.swing.JToggleButton toggleTookNight;
  private javax.swing.JToggleButton toggleTookNoon;
  private javax.swing.JPanel topicals;
  private javax.swing.JScrollPane topicalsScrollPanel;
  private javax.swing.JTable topicalsTable;
  private javax.swing.JLabel version;
  // End of variables declaration//GEN-END:variables
}
