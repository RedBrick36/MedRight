/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

/**
 *
 * @author RedBrick
 */
public class MedRightStartGUI extends javax.swing.JFrame {

    /**
     * Creates new form MedRightTopLevel
     */
    public MedRightStartGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityMedRight = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory(null).createEntityManager();
        pillScrollPane = new javax.swing.JScrollPane();
        pillTable = new javax.swing.JTable();
        MainPane = new javax.swing.JTabbedPane();
        pills = new javax.swing.JPanel();
        liquids = new javax.swing.JPanel();
        liquidsScrollPane = new javax.swing.JScrollPane();
        liquidsTable = new javax.swing.JTable();
        topicals = new javax.swing.JPanel();
        topicalsScrollPane = new javax.swing.JScrollPane();
        topicalsTable = new javax.swing.JTable();
        calendar = new javax.swing.JPanel();
        iteminfo = new javax.swing.JPanel();
        iteminfoScrollPanel = new javax.swing.JScrollPane();
        iteminfoJTree = new javax.swing.JTree();
        iteminfoScrollPane = new javax.swing.JScrollPane();
        schedule = new javax.swing.JPanel();
        scheduleScrollPane = new javax.swing.JScrollPane();
        scheduleTable = new javax.swing.JTable();
        scheduleLable1 = new javax.swing.JLabel();
        toggleTookAM = new javax.swing.JToggleButton();
        toggleTookAM2 = new javax.swing.JToggleButton();
        toggleTookAM3 = new javax.swing.JToggleButton();
        toggleTookAM4 = new javax.swing.JToggleButton();
        toggleTookAM5 = new javax.swing.JToggleButton();
        toggleTookAM6 = new javax.swing.JToggleButton();
        toggleTookAM7 = new javax.swing.JToggleButton();
        banner = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        creator = new javax.swing.JLabel();
        jbAddNewSchedule = new javax.swing.JButton();
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
        setTitle("MedRight© Regiment Tracker");
        setBounds(new java.awt.Rectangle(0, 23, 761, 540));
        setMaximumSize(new java.awt.Dimension(761, 540));
        setMinimumSize(new java.awt.Dimension(761, 540));
        setName("mainframe"); // NOI18N
        setPreferredSize(new java.awt.Dimension(761, 500));
        setSize(new java.awt.Dimension(761, 500));

        MainPane.setForeground(new java.awt.Color(204, 255, 204));
        MainPane.setToolTipText("");

        pills.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pills.setToolTipText("");

        org.jdesktop.layout.GroupLayout pillsLayout = new org.jdesktop.layout.GroupLayout(pills);
        pills.setLayout(pillsLayout);
        pillsLayout.setHorizontalGroup(
            pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 726, Short.MAX_VALUE)
        );
        pillsLayout.setVerticalGroup(
            pillsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 366, Short.MAX_VALUE)
        );

        MainPane.addTab("Pills", pills);

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
        liquidsTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        liquidsScrollPane.setViewportView(liquidsTable);

        org.jdesktop.layout.GroupLayout liquidsLayout = new org.jdesktop.layout.GroupLayout(liquids);
        liquids.setLayout(liquidsLayout);
        liquidsLayout.setHorizontalGroup(
            liquidsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(liquidsScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        liquidsLayout.setVerticalGroup(
            liquidsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(liquidsScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        MainPane.addTab("Liquids", liquids);

        topicals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        topicalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Container Size", "Condition"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        topicalsScrollPane.setViewportView(topicalsTable);

        org.jdesktop.layout.GroupLayout topicalsLayout = new org.jdesktop.layout.GroupLayout(topicals);
        topicals.setLayout(topicalsLayout);
        topicalsLayout.setHorizontalGroup(
            topicalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topicalsScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        topicalsLayout.setVerticalGroup(
            topicalsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(topicalsScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        MainPane.addTab("Topicals", topicals);

        calendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.layout.GroupLayout calendarLayout = new org.jdesktop.layout.GroupLayout(calendar);
        calendar.setLayout(calendarLayout);
        calendarLayout.setHorizontalGroup(
            calendarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 726, Short.MAX_VALUE)
        );
        calendarLayout.setVerticalGroup(
            calendarLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 366, Short.MAX_VALUE)
        );

        MainPane.addTab("Calendar", calendar);

        iteminfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Treatments");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Pills");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Liquids");
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
                .add(iteminfoScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
        );
        iteminfoLayout.setVerticalGroup(
            iteminfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(iteminfoScrollPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, iteminfoScrollPane)
        );

        MainPane.addTab("Item Info", iteminfo);

        schedule.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        schedule.setPreferredSize(new java.awt.Dimension(722, 340));

        scheduleTable.setAutoCreateRowSorter(true);
        scheduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "A.M.", "Mid Morning", "Noon", "Mid Afternoon", "Afternoon", "Evening", "Bedtime"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scheduleTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        scheduleTable.setColumnSelectionAllowed(true);
        scheduleTable.setEnabled(false);
        scheduleScrollPane.setViewportView(scheduleTable);

        scheduleLable1.setText("Treatments that are on your schedule for today.");

        toggleTookAM.setForeground(new java.awt.Color(153, 153, 255));
        toggleTookAM.setText("Took AM");
        toggleTookAM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toggleTookAM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleTookAM.setMaximumSize(new java.awt.Dimension(45, 18));
        toggleTookAM.setMinimumSize(new java.awt.Dimension(45, 18));
        toggleTookAM.setPreferredSize(new java.awt.Dimension(45, 18));
        toggleTookAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleTookAMActionPerformed(evt);
            }
        });

        toggleTookAM2.setForeground(new java.awt.Color(153, 153, 255));
        toggleTookAM2.setText("Took MM");
        toggleTookAM2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toggleTookAM2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleTookAM2.setMaximumSize(new java.awt.Dimension(45, 18));
        toggleTookAM2.setMinimumSize(new java.awt.Dimension(45, 18));
        toggleTookAM2.setPreferredSize(new java.awt.Dimension(45, 18));
        toggleTookAM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleTookAM2ActionPerformed(evt);
            }
        });

        toggleTookAM3.setForeground(new java.awt.Color(153, 153, 255));
        toggleTookAM3.setText("Took Noon");
        toggleTookAM3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toggleTookAM3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleTookAM3.setMaximumSize(new java.awt.Dimension(45, 18));
        toggleTookAM3.setMinimumSize(new java.awt.Dimension(45, 18));
        toggleTookAM3.setPreferredSize(new java.awt.Dimension(45, 18));
        toggleTookAM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleTookAM3ActionPerformed(evt);
            }
        });

        toggleTookAM4.setForeground(new java.awt.Color(153, 153, 255));
        toggleTookAM4.setText("Took MidAft");
        toggleTookAM4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toggleTookAM4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleTookAM4.setMaximumSize(new java.awt.Dimension(45, 18));
        toggleTookAM4.setMinimumSize(new java.awt.Dimension(45, 18));
        toggleTookAM4.setPreferredSize(new java.awt.Dimension(45, 18));
        toggleTookAM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleTookAM4ActionPerformed(evt);
            }
        });

        toggleTookAM5.setForeground(new java.awt.Color(153, 153, 255));
        toggleTookAM5.setText("Took Aft");
        toggleTookAM5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toggleTookAM5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleTookAM5.setMaximumSize(new java.awt.Dimension(45, 18));
        toggleTookAM5.setMinimumSize(new java.awt.Dimension(45, 18));
        toggleTookAM5.setPreferredSize(new java.awt.Dimension(45, 18));
        toggleTookAM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleTookAM5ActionPerformed(evt);
            }
        });

        toggleTookAM6.setForeground(new java.awt.Color(153, 153, 255));
        toggleTookAM6.setText("Took Eve");
        toggleTookAM6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toggleTookAM6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleTookAM6.setMaximumSize(new java.awt.Dimension(45, 18));
        toggleTookAM6.setMinimumSize(new java.awt.Dimension(45, 18));
        toggleTookAM6.setPreferredSize(new java.awt.Dimension(45, 18));
        toggleTookAM6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleTookAM6ActionPerformed(evt);
            }
        });

        toggleTookAM7.setForeground(new java.awt.Color(153, 153, 255));
        toggleTookAM7.setText("Took Bedtime");
        toggleTookAM7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        toggleTookAM7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toggleTookAM7.setMaximumSize(new java.awt.Dimension(45, 18));
        toggleTookAM7.setMinimumSize(new java.awt.Dimension(45, 18));
        toggleTookAM7.setPreferredSize(new java.awt.Dimension(45, 18));
        toggleTookAM7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleTookAM7ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout scheduleLayout = new org.jdesktop.layout.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(scheduleScrollPane)
            .add(scheduleLayout.createSequentialGroup()
                .addContainerGap()
                .add(scheduleLable1)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(scheduleLayout.createSequentialGroup()
                .add(toggleTookAM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(toggleTookAM2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(toggleTookAM3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(toggleTookAM4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(toggleTookAM5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(toggleTookAM6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(toggleTookAM7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(scheduleLayout.createSequentialGroup()
                .add(7, 7, 7)
                .add(scheduleLable1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scheduleScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 275, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(scheduleLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(toggleTookAM, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(toggleTookAM2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(toggleTookAM3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(toggleTookAM4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(toggleTookAM5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(toggleTookAM6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(toggleTookAM7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6))
        );

        MainPane.addTab("Todays Schedule", schedule);

        banner.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        banner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banner.setText("MedRight© Schedule Tracker");
        banner.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        version.setText("Ver 0.1");

        creator.setText("RedBrick.Org, 2015");

        jbAddNewSchedule.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbAddNewSchedule.setForeground(new java.awt.Color(204, 255, 204));
        jbAddNewSchedule.setText("  Add New Schedule  ");
        jbAddNewSchedule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        menuBar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");
        fileMenu.setAlignmentX(2.5F);
        fileMenu.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        fileMenu.setIconTextGap(6);
        fileMenu.setMargin(new java.awt.Insets(4, 4, 4, 4));

        openMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

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

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");
        editMenu.setAlignmentX(1.5F);
        editMenu.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        editMenu.setIconTextGap(6);

        cutMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(copyMenuItem);

        pasteMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

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
                .add(banner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 294, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jbAddNewSchedule, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(104, 104, 104))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(MainPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(35, 35, 35)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(creator)
                            .add(version))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(banner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jbAddNewSchedule, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(version, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(creator)
                .add(24, 24, 24)
                .add(MainPane)
                .add(20, 20, 20))
        );

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
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copyMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MedRightStartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedRightStartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedRightStartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedRightStartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedRightStartGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane MainPane;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JLabel banner;
    private javax.swing.JPanel calendar;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JLabel creator;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.persistence.EntityManager entityMedRight;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel iteminfo;
    private javax.swing.JTree iteminfoJTree;
    private javax.swing.JScrollPane iteminfoScrollPane;
    private javax.swing.JScrollPane iteminfoScrollPanel;
    private javax.swing.JButton jbAddNewSchedule;
    private javax.swing.JPanel liquids;
    private javax.swing.JScrollPane liquidsScrollPane;
    private javax.swing.JTable liquidsTable;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JScrollPane pillScrollPane;
    private javax.swing.JTable pillTable;
    private javax.swing.JPanel pills;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JPanel schedule;
    private javax.swing.JLabel scheduleLable1;
    private javax.swing.JScrollPane scheduleScrollPane;
    private javax.swing.JTable scheduleTable;
    private javax.swing.JToggleButton toggleTookAM;
    private javax.swing.JToggleButton toggleTookAM2;
    private javax.swing.JToggleButton toggleTookAM3;
    private javax.swing.JToggleButton toggleTookAM4;
    private javax.swing.JToggleButton toggleTookAM5;
    private javax.swing.JToggleButton toggleTookAM6;
    private javax.swing.JToggleButton toggleTookAM7;
    private javax.swing.JPanel topicals;
    private javax.swing.JScrollPane topicalsScrollPane;
    private javax.swing.JTable topicalsTable;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
