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
//private final Connection conn;
//private Connection connection;
//private PreparedStatement ps;
//private ResultSet rs;
//private String check;
//private String access = "treatements";
// private String entityMedRightStartGUI;

/**
 * Creates new form MedRightTopLevel
 *
 * @throws java.lang.ClassNotFoundException
 * @throws java.lang.InstantiationException
 * @throws java.lang.IllegalAccessException
 */
public MedRightStartGUI () throws ClassNotFoundException, InstantiationException, IllegalAccessException {
  this.initComponents ();
  // conn = DatabaseOps.createDatabaseConnection (access);
  //  entityMedRightStartGUI = java.beans.Beans.isDesignTime() ? entityMedRightStartGUI : javax.persistence.Persistence.createEntityManagerFactory(entityMedRightStartGUI).createEntityManager();
}

public void closeMedStartGUI () {

  WindowEvent winClosingEvent = new WindowEvent (this, WindowEvent.WINDOW_CLOS­ING);
  Toolkit.getDefaultToolkit ().getSystemEve­ntQueue ().postEvent (winClosingEvent);
}

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    entityMedRight = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("treatments;create=truePU").createEntityManager();
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
    toggleTookAM2 = new javax.swing.JToggleButton();
    toggleTookAM3 = new javax.swing.JToggleButton();
    toggleTookAM4 = new javax.swing.JToggleButton();
    toggleTookAM5 = new javax.swing.JToggleButton();
    toggleTookAM6 = new javax.swing.JToggleButton();
    toggleTookAM7 = new javax.swing.JToggleButton();
    toggleTookAM8 = new javax.swing.JToggleButton();
    jProgressBar1 = new javax.swing.JProgressBar();
    Actions = new javax.swing.JPanel();
    jPasswordField1 = new javax.swing.JPasswordField();
    configureTime = new javax.swing.JButton();
    crud = new javax.swing.JButton();
    submit = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTextArea2 = new javax.swing.JTextArea();
    jLabel2 = new javax.swing.JLabel();
    jScrollPane4 = new javax.swing.JScrollPane();
    jTextArea4 = new javax.swing.JTextArea();
    banner = new javax.swing.JLabel();
    version = new javax.swing.JLabel();
    creator = new javax.swing.JLabel();
    jbAddNewSchedule = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
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

    toggleTookAM2.setText("Took MM");
    toggleTookAM2.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAM2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookAM2.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAM2.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAM2.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAM2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAM2ActionPerformed(evt);
      }
    });

    toggleTookAM3.setText(" Took Noon ");
    toggleTookAM3.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAM3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookAM3.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAM3.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAM3.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAM3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAM3ActionPerformed(evt);
      }
    });

    toggleTookAM4.setText(" Took MidAft ");
    toggleTookAM4.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAM4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookAM4.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAM4.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAM4.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAM4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAM4ActionPerformed(evt);
      }
    });

    toggleTookAM5.setText("Took Aft");
    toggleTookAM5.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAM5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookAM5.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAM5.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAM5.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAM5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAM5ActionPerformed(evt);
      }
    });

    toggleTookAM6.setText("Took Eve");
    toggleTookAM6.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAM6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookAM6.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAM6.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAM6.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAM6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAM6ActionPerformed(evt);
      }
    });

    toggleTookAM7.setText(" Took Bedtime ");
    toggleTookAM7.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAM7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    toggleTookAM7.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAM7.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAM7.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAM7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAM7ActionPerformed(evt);
      }
    });

    toggleTookAM8.setText("  Took Night ");
    toggleTookAM8.setAutoscrolls(true);
    toggleTookAM8.setBorder(new javax.swing.border.MatteBorder(null));
    toggleTookAM8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    toggleTookAM8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
    toggleTookAM8.setMaximumSize(new java.awt.Dimension(45, 18));
    toggleTookAM8.setMinimumSize(new java.awt.Dimension(45, 18));
    toggleTookAM8.setPreferredSize(new java.awt.Dimension(45, 18));
    toggleTookAM8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        toggleTookAM8ActionPerformed(evt);
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
            .add(toggleTookAM2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(47, 47, 47)
            .add(toggleTookAM3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(35, 35, 35)
            .add(toggleTookAM4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 95, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(46, 46, 46)
            .add(toggleTookAM5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(57, 57, 57)
            .add(toggleTookAM6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(39, 39, 39)
            .add(toggleTookAM7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(30, 30, 30)
            .add(toggleTookAM8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
          .add(toggleTookAM2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookAM3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookAM4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookAM5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookAM6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookAM7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(toggleTookAM8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(14, 14, 14))
    );

    toggleTookAM8.getAccessibleContext().setAccessibleName("TookMON"); // NOI18N

    Treatments.addTab("Todays Schedule", schedule);

    Actions.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
    jPasswordField1.setAutoscrolls(false);
    jPasswordField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEtchedBorder()));
    jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jPasswordField1ActionPerformed(evt);
      }
    });

    configureTime.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    configureTime.setForeground(new java.awt.Color(255, 51, 0));
    configureTime.setText("  Configure Time Frames  ");
    configureTime.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    crud.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    crud.setForeground(new java.awt.Color(255, 51, 0));
    crud.setText("  Edit the Database  ");
    crud.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    submit.setText("  Submit  ");
    submit.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
    submit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        submitActionPerformed(evt);
      }
    });

    jButton1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 51, 0));
    jButton1.setText("  Backup Database  ");
    jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    jButton2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    jButton2.setForeground(new java.awt.Color(255, 51, 0));
    jButton2.setText("  Restore Database  ");
    jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    jButton3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    jButton3.setForeground(new java.awt.Color(255, 51, 0));
    jButton3.setText("  Delete All Data  ");
    jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    jButton4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
    jButton4.setForeground(new java.awt.Color(255, 51, 0));
    jButton4.setText(" Change Password  ");
    jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

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

    org.jdesktop.layout.GroupLayout ActionsLayout = new org.jdesktop.layout.GroupLayout(Actions);
    Actions.setLayout(ActionsLayout);
    ActionsLayout.setHorizontalGroup(
      ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(ActionsLayout.createSequentialGroup()
        .add(68, 68, 68)
        .add(ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
          .add(org.jdesktop.layout.GroupLayout.LEADING, crud)
          .add(configureTime)
          .add(org.jdesktop.layout.GroupLayout.LEADING, jButton1)
          .add(org.jdesktop.layout.GroupLayout.LEADING, ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
            .add(jButton4)
            .add(jButton2)))
        .add(ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(ActionsLayout.createSequentialGroup()
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 76, Short.MAX_VALUE)
            .add(ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(ActionsLayout.createSequentialGroup()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(457, 457, 457))
              .add(ActionsLayout.createSequentialGroup()
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 219, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(346, 346, 346))))
          .add(ActionsLayout.createSequentialGroup()
            .add(ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(ActionsLayout.createSequentialGroup()
                .add(150, 150, 150)
                .add(submit))
              .add(ActionsLayout.createSequentialGroup()
                .add(111, 111, 111)
                .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
            .add(0, 0, Short.MAX_VALUE))))
      .add(ActionsLayout.createSequentialGroup()
        .add(ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(ActionsLayout.createSequentialGroup()
            .add(213, 213, 213)
            .add(jLabel2))
          .add(ActionsLayout.createSequentialGroup()
            .add(396, 396, 396)
            .add(jButton3)))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    ActionsLayout.setVerticalGroup(
      ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(ActionsLayout.createSequentialGroup()
        .addContainerGap()
        .add(jLabel2)
        .add(18, 18, 18)
        .add(ActionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(ActionsLayout.createSequentialGroup()
            .add(21, 21, 21)
            .add(configureTime)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(crud)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(jButton1)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(jButton2)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(jButton4))
          .add(ActionsLayout.createSequentialGroup()
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(20, 20, 20)
            .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(submit)
            .add(16, 16, 16)
            .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .add(24, 24, 24)
        .add(jButton3)
        .add(200, 200, 200))
    );

    Treatments.addTab("Tools", Actions);

    banner.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    banner.setText("MedRight© Treatement Tracker");
    banner.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

    version.setText("Ver 0.1");

    creator.setText("RedBrick.Org, 2015");

    jbAddNewSchedule.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jbAddNewSchedule.setText("  Add New Schedule  ");
    jbAddNewSchedule.setBorder(new javax.swing.border.MatteBorder(null));
    jbAddNewSchedule.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jbAddNewSchedule.setIconTextGap(6);
    jbAddNewSchedule.setMargin(new java.awt.Insets(4, 14, 4, 14));
    jbAddNewSchedule.setMaximumSize(new java.awt.Dimension(147, 25));
    jbAddNewSchedule.setMinimumSize(new java.awt.Dimension(147, 25));
    jbAddNewSchedule.setPreferredSize(new java.awt.Dimension(147, 25));
    jbAddNewSchedule.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbAddNewScheduleActionPerformed(evt);
      }
    });

    jTextArea1.setColumns(2);
    jTextArea1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
    jTextArea1.setRows(1);
    jTextArea1.setAutoscrolls(false);
    jTextArea1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder(null, "Time to Next Treatment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 18)))); // NOI18N
    jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    jTextArea1.setFocusable(false);
    jTextArea1.setMinimumSize(new java.awt.Dimension(232, 60));
    jScrollPane1.setViewportView(jTextArea1);

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
        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 274, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .add(136, 136, 136)
        .add(jbAddNewSchedule, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
              .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(jbAddNewSchedule, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
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

    private void toggleTookAM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAM2ActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAM2ActionPerformed

    private void toggleTookAM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAM3ActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAM3ActionPerformed

    private void toggleTookAM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAM4ActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAM4ActionPerformed

    private void toggleTookAM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAM5ActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAM5ActionPerformed

    private void toggleTookAM6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAM6ActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAM6ActionPerformed

    private void toggleTookAM7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAM7ActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAM7ActionPerformed

    private void jbAddNewScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddNewScheduleActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_jbAddNewScheduleActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
  System.exit (0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void toggleTookAM8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleTookAM8ActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_toggleTookAM8ActionPerformed

  private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
  // TODO add your handling code here:
  }//GEN-LAST:event_submitActionPerformed

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
  private javax.swing.JPanel Actions;
  private javax.swing.JTable SupplementsTable;
  private javax.swing.JTabbedPane Treatments;
  private javax.swing.JMenuItem aboutMenuItem;
  private javax.swing.JLabel banner;
  private javax.swing.JButton configureTime;
  private javax.swing.JMenuItem contentsMenuItem;
  private javax.swing.JLabel creator;
  private javax.swing.JButton crud;
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
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPasswordField jPasswordField1;
  private javax.swing.JProgressBar jProgressBar1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JTextArea jTextArea2;
  private javax.swing.JTextArea jTextArea4;
  private javax.swing.JButton jbAddNewSchedule;
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
  private javax.swing.JButton submit;
  private javax.swing.JPanel supplements;
  private javax.swing.JScrollPane supplementsScrollPanel;
  private javax.swing.JToggleButton toggleTookAM;
  private javax.swing.JToggleButton toggleTookAM2;
  private javax.swing.JToggleButton toggleTookAM3;
  private javax.swing.JToggleButton toggleTookAM4;
  private javax.swing.JToggleButton toggleTookAM5;
  private javax.swing.JToggleButton toggleTookAM6;
  private javax.swing.JToggleButton toggleTookAM7;
  private javax.swing.JToggleButton toggleTookAM8;
  private javax.swing.JPanel topicals;
  private javax.swing.JScrollPane topicalsScrollPanel;
  private javax.swing.JTable topicalsTable;
  private javax.swing.JLabel version;
  // End of variables declaration//GEN-END:variables
}
