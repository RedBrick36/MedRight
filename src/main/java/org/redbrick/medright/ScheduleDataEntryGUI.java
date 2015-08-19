/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author RedBrick
 */
public class ScheduleDataEntryGUI extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form ScheduleDataEntry
     */
    public ScheduleDataEntryGUI() {
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

    SchedCreate = new javax.swing.JPanel();
    jcbSchedType = new javax.swing.JComboBox();
    jlSchedType = new javax.swing.JLabel();
    Monday = new javax.swing.JCheckBox();
    Tuesday = new javax.swing.JCheckBox();
    Wednesday = new javax.swing.JCheckBox();
    Thursday = new javax.swing.JCheckBox();
    Friday = new javax.swing.JCheckBox();
    Saturday = new javax.swing.JCheckBox();
    Sunday = new javax.swing.JCheckBox();
    AM = new javax.swing.JCheckBox();
    MidMorn = new javax.swing.JCheckBox();
    Noon = new javax.swing.JCheckBox();
    MidAft = new javax.swing.JCheckBox();
    Afternoon = new javax.swing.JCheckBox();
    Evening = new javax.swing.JCheckBox();
    Bedtime = new javax.swing.JCheckBox();
    jlName = new javax.swing.JLabel();
    jlCondition = new javax.swing.JLabel();
    jlDose = new javax.swing.JLabel();
    jcbMeasure = new javax.swing.JComboBox();
    Reminders = new javax.swing.JCheckBox();
    Next = new javax.swing.JButton();
    Save = new javax.swing.JButton();
    Help = new javax.swing.JButton();
    jftfName = new javax.swing.JFormattedTextField();
    jftfDose = new javax.swing.JFormattedTextField();
    jftfCondition = new javax.swing.JFormattedTextField();
    jlMeasure = new javax.swing.JLabel();
    leadTime = new javax.swing.JComboBox();
    Done = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    MidOfNight = new javax.swing.JCheckBox();
    allDays = new javax.swing.JCheckBox();
    allTimes = new javax.swing.JCheckBox();
    asNeeded = new javax.swing.JCheckBox();
    OTF = new javax.swing.JComboBox();
    jLabel2 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Treatement Schedule Creator");
    setResizable(false);

    SchedCreate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Treatment Schedule Creator", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Dialog", 1, 18))); // NOI18N
    SchedCreate.setName("Treatment Schedule Creator"); // NOI18N

    jcbSchedType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select  --", "Pill", "Liquid", "Injection", "Topical", "Supplements" }));
    jcbSchedType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 204), 1, true));
    jcbSchedType.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbSchedTypeActionPerformed(evt);
      }
    });

    jlSchedType.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jlSchedType.setText("Treatment Type");

    Monday.setText("Monday");
    Monday.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        MondayActionPerformed(evt);
      }
    });

    Tuesday.setText("Tuesday");
    Tuesday.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TuesdayActionPerformed(evt);
      }
    });

    Wednesday.setText("Wednesday");
    Wednesday.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        WednesdayActionPerformed(evt);
      }
    });

    Thursday.setText("Thursday");
    Thursday.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        ThursdayActionPerformed(evt);
      }
    });

    Friday.setText("Friday");
    Friday.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        FridayActionPerformed(evt);
      }
    });

    Saturday.setText("Saturday");
    Saturday.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SaturdayActionPerformed(evt);
      }
    });

    Sunday.setText("Sunday");
    Sunday.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SundayActionPerformed(evt);
      }
    });

    AM.setText("A.M.");
    AM.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AMActionPerformed(evt);
      }
    });

    MidMorn.setText("Mid-Morning");
    MidMorn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        MidMornActionPerformed(evt);
      }
    });

    Noon.setText("Noon");
    Noon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NoonActionPerformed(evt);
      }
    });

    MidAft.setText("Mid-Afternoon");
    MidAft.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        MidAftActionPerformed(evt);
      }
    });

    Afternoon.setText("Afternoon");
    Afternoon.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AfternoonActionPerformed(evt);
      }
    });

    Evening.setText("Evening");
    Evening.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        EveningActionPerformed(evt);
      }
    });

    Bedtime.setText("Bedtime");
    Bedtime.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BedtimeActionPerformed(evt);
      }
    });

    jlName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jlName.setText(" Name of Medication, Treatment or Supplement");

    jlCondition.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jlCondition.setText("Condition");

    jlDose.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jlDose.setText("Dose");

    jcbMeasure.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jcbMeasure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select --", "Grams", "Milligrams", "Micrograms", "I.U.", "USP", "Milliliters", "CC's", "Ounces", "Teaspoons", "Tablespoons", "Cups", "Tablet(s)", "Application" }));
    jcbMeasure.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 204), 1, true));
    jcbMeasure.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbMeasureActionPerformed(evt);
      }
    });

    Reminders.setText(" Create Reminder");
    Reminders.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        RemindersActionPerformed(evt);
      }
    });

    Next.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Next.setText("  New  ");
    Next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Next.setMaximumSize(new java.awt.Dimension(51, 25));
    Next.setMinimumSize(new java.awt.Dimension(51, 25));
    Next.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NextActionPerformed(evt);
      }
    });

    Save.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Save.setText("  Save  ");
    Save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Save.setMaximumSize(new java.awt.Dimension(51, 25));
    Save.setMinimumSize(new java.awt.Dimension(51, 25));
    Save.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SaveActionPerformed(evt);
      }
    });

    Help.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Help.setText("  Help  ");
    Help.setToolTipText("");
    Help.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    Help.setIconTextGap(5);
    Help.setMargin(new java.awt.Insets(3, 14, 3, 14));
    Help.setMaximumSize(new java.awt.Dimension(51, 25));
    Help.setMinimumSize(new java.awt.Dimension(51, 25));
    Help.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        HelpActionPerformed(evt);
      }
    });

    jftfName.setMinimumSize(new java.awt.Dimension(4, 21));
    jftfName.setPreferredSize(new java.awt.Dimension(4, 21));
    jftfName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jftfNameActionPerformed(evt);
      }
    });

    jftfDose.setMinimumSize(new java.awt.Dimension(4, 21));
    jftfDose.setPreferredSize(new java.awt.Dimension(4, 21));
    jftfDose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jftfDoseActionPerformed(evt);
      }
    });

    jftfCondition.setMinimumSize(new java.awt.Dimension(4, 21));
    jftfCondition.setPreferredSize(new java.awt.Dimension(4, 21));
    jftfCondition.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jftfConditionActionPerformed(evt);
      }
    });

    jlMeasure.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jlMeasure.setText("  Measure  ");

    leadTime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45", "60" }));

    Done.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Done.setText("  Exit  ");
    Done.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Done.setMaximumSize(new java.awt.Dimension(51, 25));
    Done.setMinimumSize(new java.awt.Dimension(51, 25));
    Done.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DoneActionPerformed(evt);
      }
    });

    jLabel1.setText("Reminder Lead Time Min's");

    MidOfNight.setText("Middle of Night");

    allDays.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    allDays.setText("All Days ");
    allDays.setBorder(null);
    allDays.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        allDaysActionPerformed(evt);
      }
    });

    allTimes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    allTimes.setText("All Times ");
    allTimes.setBorder(null);
    allTimes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        allTimesActionPerformed(evt);
      }
    });

    asNeeded.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    asNeeded.setText("As Needed ");
    asNeeded.setBorder(null);
    asNeeded.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        asNeededActionPerformed(evt);
      }
    });

    OTF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Weekly", "Every Other Week", "Monthly" }));

    jLabel2.setText("Additional Time-Frames");

    javax.swing.GroupLayout SchedCreateLayout = new javax.swing.GroupLayout(SchedCreate);
    SchedCreate.setLayout(SchedCreateLayout);
    SchedCreateLayout.setHorizontalGroup(
      SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(SchedCreateLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(SchedCreateLayout.createSequentialGroup()
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(SchedCreateLayout.createSequentialGroup()
                .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(SchedCreateLayout.createSequentialGroup()
                    .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel2)
                      .addGroup(SchedCreateLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(OTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(SchedCreateLayout.createSequentialGroup()
                    .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jlName)
                      .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jftfName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SchedCreateLayout.createSequentialGroup()
                          .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftfDose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SchedCreateLayout.createSequentialGroup()
                              .addGap(29, 29, 29)
                              .addComponent(jlDose)))
                          .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SchedCreateLayout.createSequentialGroup()
                              .addGap(26, 26, 26)
                              .addComponent(jlMeasure))
                            .addGroup(SchedCreateLayout.createSequentialGroup()
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jcbMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                          .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SchedCreateLayout.createSequentialGroup()
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jftfCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SchedCreateLayout.createSequentialGroup()
                              .addGap(42, 42, 42)
                              .addComponent(jlCondition))))))
                    .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(SchedCreateLayout.createSequentialGroup()
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(Done, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedCreateLayout.createSequentialGroup()
                        .addComponent(leadTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                      .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(SchedCreateLayout.createSequentialGroup()
                      .addGap(5, 5, 5)
                      .addComponent(Reminders)
                      .addGap(27, 27, 27)))))
              .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
            .addContainerGap())
          .addGroup(SchedCreateLayout.createSequentialGroup()
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(SchedCreateLayout.createSequentialGroup()
                .addComponent(AM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MidMorn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Noon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MidAft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Afternoon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Evening)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bedtime))
              .addComponent(MidOfNight)
              .addGroup(SchedCreateLayout.createSequentialGroup()
                .addComponent(allDays)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(allTimes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(asNeeded))
              .addGroup(SchedCreateLayout.createSequentialGroup()
                .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jlSchedType)
                  .addComponent(jcbSchedType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(Saturday)
                  .addComponent(Monday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(Sunday)
                  .addGroup(SchedCreateLayout.createSequentialGroup()
                    .addComponent(Tuesday)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(Wednesday)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(Thursday)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(Friday)))))
            .addGap(0, 12, Short.MAX_VALUE))))
    );
    SchedCreateLayout.setVerticalGroup(
      SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(SchedCreateLayout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(allTimes)
          .addComponent(asNeeded)
          .addComponent(allDays))
        .addGap(20, 20, 20)
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jcbSchedType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Monday)
          .addComponent(Tuesday)
          .addComponent(Wednesday)
          .addComponent(Thursday)
          .addComponent(Friday))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jlSchedType)
          .addComponent(Saturday)
          .addComponent(Sunday))
        .addGap(20, 20, 20)
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(AM)
          .addComponent(MidMorn)
          .addComponent(Noon)
          .addComponent(MidAft)
          .addComponent(Afternoon)
          .addComponent(Evening)
          .addComponent(Bedtime))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(MidOfNight)
        .addGap(4, 4, 4)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(SchedCreateLayout.createSequentialGroup()
            .addComponent(jlName)
            .addGap(8, 8, 8)
            .addComponent(jftfName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(7, 7, 7)
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jlDose, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jlCondition)
              .addComponent(jlMeasure))
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jftfDose, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jftfCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jcbMeasure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedCreateLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Done, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Help, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))))
          .addGroup(SchedCreateLayout.createSequentialGroup()
            .addComponent(Reminders)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(leadTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(SchedCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(SchedCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void RemindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemindersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemindersActionPerformed

    private void TuesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TuesdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TuesdayActionPerformed

    private void MondayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MondayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MondayActionPerformed

    private void WednesdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WednesdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WednesdayActionPerformed

    private void ThursdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThursdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThursdayActionPerformed

    private void FridayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FridayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FridayActionPerformed

    private void SaturdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaturdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaturdayActionPerformed

    private void SundayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SundayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SundayActionPerformed

    private void AMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMActionPerformed

    private void MidMornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MidMornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MidMornActionPerformed

    private void NoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoonActionPerformed

    private void MidAftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MidAftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MidAftActionPerformed

    private void AfternoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfternoonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AfternoonActionPerformed

    private void EveningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EveningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EveningActionPerformed

    private void BedtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BedtimeActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HelpActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
      /*
       * This is the main code for the entire GUI
       * For each schedule we will use an instance of the Treatment class to assign all values via 
       * listeners. Once the user presses Save or New the state of the instance will be pulled
       * and used to construct a sql command. Once the command has been sent the object will be
       * destroyed and another created.
       * 
       * INSERT INTO example:
       * 
       * INSERT INTO treatments (uuid, `type`, `name`, dose, measure, reminder, monday, tuesday, wednesday,       thursday, friday, saturday, sunday, am, midam, noon, midaft, afternoon, evening, bedtime, midofnight, allDays, allTimes, asNecessary, leadTime) VALUES (102, 'pill', 'linsinopril', 20.0, 'milligrams', 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 00)
    * 
    * 
       */
    }//GEN-LAST:event_SaveActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoneActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextActionPerformed

    private void jftfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfNameActionPerformed

    private void jftfDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfDoseActionPerformed

    private void jftfConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfConditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfConditionActionPerformed

    private void jcbSchedTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSchedTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSchedTypeActionPerformed

    private void jcbMeasureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMeasureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMeasureActionPerformed

  private void allDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDaysActionPerformed
    if (allDays.isSelected ()){
      Monday.setSelected (true);
      Tuesday.setSelected (true);
      Wednesday.setSelected (true);
      Thursday.setSelected (true);
      Friday.setSelected (true);
      Saturday.setSelected (true);
      Sunday.setSelected (true);
    }
   
    else {
      Monday.setSelected (false);
      Tuesday.setSelected (false);
      Wednesday.setSelected (false);
      Thursday.setSelected (false);
      Friday.setSelected (false);
      Saturday.setSelected (false);
      Sunday.setSelected (false);
              
      }  
  }//GEN-LAST:event_allDaysActionPerformed

  private void allTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allTimesActionPerformed
    if (allTimes.isSelected ()){
      AM.setSelected (true);
      MidMorn.setSelected(true);
      Noon.setSelected (true);
      MidAft.setSelected(true);
      Afternoon.setSelected (true);
      Evening.setSelected(true);
      Bedtime.setSelected (true);
      MidOfNight.setSelected(true); 
    }
    else {
      AM.setSelected (false);
      MidMorn.setSelected(false);
      Noon.setSelected (false);
      MidAft.setSelected(false);
      Afternoon.setSelected (false);
      Evening.setSelected(false);
      Bedtime.setSelected (false);
      MidOfNight.setSelected(false);
    }           
  }//GEN-LAST:event_allTimesActionPerformed

  private void asNeededActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asNeededActionPerformed
    if (asNeeded.isSelected ()){
      Reminders.setSelected (false);
      Reminders.setEnabled (false);
      leadTime.setEnabled (false);
      allTimes.setSelected(false);
      allDays.setSelected ( false);
      AM.setEnabled (false);
      MidMorn.setEnabled (false);
      Noon.setEnabled (false);
      MidAft.setEnabled (false);
      Afternoon.setEnabled (false);
      Evening.setEnabled (false);
      Bedtime.setEnabled (false);
      MidOfNight.setEnabled (false);
      Monday.setEnabled (false);
      Tuesday.setEnabled (false);
      Wednesday.setEnabled (false);
      Thursday.setEnabled (false);
      Friday.setEnabled (false);
      Saturday.setEnabled (false);
      Sunday.setEnabled (false);
      AM.setSelected (false);
      MidMorn.setSelected (false);
      Noon.setSelected (false);
      MidAft.setSelected (false);
      Afternoon.setSelected (false);
      Evening.setSelected (false);
      Bedtime.setSelected (false);
      MidOfNight.setSelected (false);
      Monday.setSelected (false);
      Tuesday.setSelected (false);
      Wednesday.setSelected (false);
      Thursday.setSelected (false);
      Friday.setSelected (false);
      Saturday.setSelected (false);
      Sunday.setSelected (false);
      
      
    }
    else {
      Reminders.setSelected (false);
      Reminders.setEnabled (true);
      leadTime.setEnabled (true);
            AM.setEnabled (true);
      MidMorn.setEnabled (true);
      Noon.setEnabled (true);
      MidAft.setEnabled (true);
      Afternoon.setEnabled (true);
      Evening.setEnabled (true);
      Bedtime.setEnabled (true);
      MidOfNight.setEnabled (true);
      Monday.setEnabled (true);
      Tuesday.setEnabled (true);
      Wednesday.setEnabled (true);
      Thursday.setEnabled (true);
      Friday.setEnabled (true);
      Saturday.setEnabled (true);
      Sunday.setEnabled (true);
    }
  }//GEN-LAST:event_asNeededActionPerformed

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
      UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//      for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels () ) {
//        if ("Metal".equals ( info.getName () ) ) {
//          javax.swing.UIManager.setLookAndFeel ( info.getClassName () );
//          break;
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScheduleDataEntryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleDataEntryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleDataEntryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleDataEntryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleDataEntryGUI().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JCheckBox AM;
  private javax.swing.JCheckBox Afternoon;
  private javax.swing.JCheckBox Bedtime;
  private javax.swing.JButton Done;
  private javax.swing.JCheckBox Evening;
  private javax.swing.JCheckBox Friday;
  private javax.swing.JButton Help;
  private javax.swing.JCheckBox MidAft;
  private javax.swing.JCheckBox MidMorn;
  private javax.swing.JCheckBox MidOfNight;
  private javax.swing.JCheckBox Monday;
  private javax.swing.JButton Next;
  private javax.swing.JCheckBox Noon;
  private javax.swing.JComboBox OTF;
  private javax.swing.JCheckBox Reminders;
  private javax.swing.JCheckBox Saturday;
  private javax.swing.JButton Save;
  private javax.swing.JPanel SchedCreate;
  private javax.swing.JCheckBox Sunday;
  private javax.swing.JCheckBox Thursday;
  private javax.swing.JCheckBox Tuesday;
  private javax.swing.JCheckBox Wednesday;
  private javax.swing.JCheckBox allDays;
  private javax.swing.JCheckBox allTimes;
  private javax.swing.JCheckBox asNeeded;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JComboBox jcbMeasure;
  private javax.swing.JComboBox jcbSchedType;
  private javax.swing.JFormattedTextField jftfCondition;
  private javax.swing.JFormattedTextField jftfDose;
  private javax.swing.JFormattedTextField jftfName;
  private javax.swing.JLabel jlCondition;
  private javax.swing.JLabel jlDose;
  private javax.swing.JLabel jlMeasure;
  private javax.swing.JLabel jlName;
  private javax.swing.JLabel jlSchedType;
  private javax.swing.JComboBox leadTime;
  // End of variables declaration//GEN-END:variables
}
