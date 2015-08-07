/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright.holding;
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
    jlScheduleCreator = new javax.swing.JLabel();
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
    jcbSize = new javax.swing.JComboBox();
    Reminders = new javax.swing.JCheckBox();
    Next = new javax.swing.JButton();
    Save = new javax.swing.JButton();
    Help = new javax.swing.JButton();
    jftfName = new javax.swing.JFormattedTextField();
    jftfDose = new javax.swing.JFormattedTextField();
    jftfCondition = new javax.swing.JFormattedTextField();
    jlMeasure = new javax.swing.JLabel();
    jComboBox1 = new javax.swing.JComboBox();
    Done = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jCheckBox1 = new javax.swing.JCheckBox();
    jCheckBox2 = new javax.swing.JCheckBox();
    jCheckBox3 = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jlScheduleCreator.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    jlScheduleCreator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jlScheduleCreator.setText("Treatment Schedule Creator");
    jlScheduleCreator.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    jcbSchedType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select  --", "Pill", "Liquid", "Injection", "Topical", "Fitness" }));
    jcbSchedType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
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
    jlCondition.setText("Condition/Reason");

    jlDose.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jlDose.setText("  Amount  ");

    jcbSize.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jcbSize.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select --", "Grams", "Milligrams", "Milliliters", "CC's", "Ounces", "Teaspoons", "Tablespoons", "Cups", "Application", " " }));
    jcbSize.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 1, true));
    jcbSize.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbSizeActionPerformed(evt);
      }
    });

    Reminders.setText(" Create Reminder");
    Reminders.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        RemindersActionPerformed(evt);
      }
    });

    Next.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Next.setForeground(new java.awt.Color(255, 153, 153));
    Next.setText("  New  ");
    Next.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Next.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        NextActionPerformed(evt);
      }
    });

    Save.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Save.setForeground(new java.awt.Color(51, 204, 0));
    Save.setText("  Save  ");
    Save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Save.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        SaveActionPerformed(evt);
      }
    });

    Help.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Help.setForeground(new java.awt.Color(0, 255, 255));
    Help.setText("  Help  ");
    Help.setToolTipText("");
    Help.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    Help.setIconTextGap(5);
    Help.setMargin(new java.awt.Insets(3, 14, 3, 14));
    Help.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        HelpActionPerformed(evt);
      }
    });

    jftfName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jftfName.setMinimumSize(new java.awt.Dimension(4, 21));
    jftfName.setPreferredSize(new java.awt.Dimension(4, 21));
    jftfName.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jftfNameActionPerformed(evt);
      }
    });

    jftfDose.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jftfDose.setMinimumSize(new java.awt.Dimension(4, 21));
    jftfDose.setPreferredSize(new java.awt.Dimension(4, 21));
    jftfDose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jftfDoseActionPerformed(evt);
      }
    });

    jftfCondition.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jftfCondition.setMinimumSize(new java.awt.Dimension(4, 21));
    jftfCondition.setPreferredSize(new java.awt.Dimension(4, 21));
    jftfCondition.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jftfConditionActionPerformed(evt);
      }
    });

    jlMeasure.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    jlMeasure.setText("  Measure  ");

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "15", "30", "45", "60" }));

    Done.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    Done.setForeground(new java.awt.Color(204, 0, 0));
    Done.setText("  Exit  ");
    Done.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    Done.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        DoneActionPerformed(evt);
      }
    });

    jLabel1.setText("Reminder Lead Time Min's");

    jCheckBox1.setText("Middle of Night");

    jCheckBox2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jCheckBox2.setForeground(new java.awt.Color(102, 102, 255));
    jCheckBox2.setText("All Days");

    jCheckBox3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
    jCheckBox3.setForeground(new java.awt.Color(102, 102, 255));
    jCheckBox3.setText("All Times");

    javax.swing.GroupLayout SchedCreateLayout = new javax.swing.GroupLayout(SchedCreate);
    SchedCreate.setLayout(SchedCreateLayout);
    SchedCreateLayout.setHorizontalGroup(
      SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(SchedCreateLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(SchedCreateLayout.createSequentialGroup()
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedCreateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jCheckBox1)
                  .addGroup(SchedCreateLayout.createSequentialGroup()
                    .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jlSchedType)
                      .addComponent(jcbSchedType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(51, 51, 51)
                    .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(Saturday)
                      .addComponent(Monday))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(Sunday)
                      .addGroup(SchedCreateLayout.createSequentialGroup()
                        .addComponent(Tuesday)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addGroup(SchedCreateLayout.createSequentialGroup()
                            .addComponent(jCheckBox2)
                            .addGap(18, 18, 18)
                            .addComponent(jCheckBox3))
                          .addGroup(SchedCreateLayout.createSequentialGroup()
                            .addComponent(Wednesday)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Thursday)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Friday))))))
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
                    .addComponent(Bedtime))))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedCreateLayout.createSequentialGroup()
                .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(SchedCreateLayout.createSequentialGroup()
                    .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(SchedCreateLayout.createSequentialGroup()
                        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(jftfDose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jlDose))
                        .addGap(10, 10, 10)
                        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(jlMeasure)
                          .addComponent(jcbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(jlCondition)
                          .addComponent(jftfCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                      .addComponent(Help))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                    .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedCreateLayout.createSequentialGroup()
                        .addComponent(Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Done)
                        .addGap(12, 12, 12)
                        .addComponent(Next))
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedCreateLayout.createSequentialGroup()
                        .addComponent(Reminders)
                        .addGap(22, 22, 22))
                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SchedCreateLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                      .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                  .addGroup(SchedCreateLayout.createSequentialGroup()
                    .addComponent(jftfName, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
              .addGroup(SchedCreateLayout.createSequentialGroup()
                .addComponent(jlScheduleCreator, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap(12, Short.MAX_VALUE))
          .addGroup(SchedCreateLayout.createSequentialGroup()
            .addComponent(jlName)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    SchedCreateLayout.setVerticalGroup(
      SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(SchedCreateLayout.createSequentialGroup()
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jlScheduleCreator, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jCheckBox2)
          .addComponent(jCheckBox3))
        .addGap(30, 30, 30)
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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(AM)
          .addComponent(MidMorn)
          .addComponent(Noon)
          .addComponent(MidAft)
          .addComponent(Afternoon)
          .addComponent(Evening)
          .addComponent(Bedtime))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jCheckBox1)
        .addGap(13, 13, 13)
        .addComponent(jlName)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jftfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Reminders))
        .addGap(6, 6, 6)
        .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(SchedCreateLayout.createSequentialGroup()
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jlDose, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jlCondition)
              .addComponent(jlMeasure))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jftfDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jftfCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jcbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(30, 30, 30)
            .addGroup(SchedCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(Save)
              .addComponent(Next)
              .addComponent(Help)
              .addComponent(Done)))
          .addGroup(SchedCreateLayout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(14, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(SchedCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(9, 9, 9))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(14, 14, 14)
        .addComponent(SchedCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jcbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSizeActionPerformed

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
  private javax.swing.JCheckBox Monday;
  private javax.swing.JButton Next;
  private javax.swing.JCheckBox Noon;
  private javax.swing.JCheckBox Reminders;
  private javax.swing.JCheckBox Saturday;
  private javax.swing.JButton Save;
  private javax.swing.JPanel SchedCreate;
  private javax.swing.JCheckBox Sunday;
  private javax.swing.JCheckBox Thursday;
  private javax.swing.JCheckBox Tuesday;
  private javax.swing.JCheckBox Wednesday;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JCheckBox jCheckBox2;
  private javax.swing.JCheckBox jCheckBox3;
  private javax.swing.JComboBox jComboBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JComboBox jcbSchedType;
  private javax.swing.JComboBox jcbSize;
  private javax.swing.JFormattedTextField jftfCondition;
  private javax.swing.JFormattedTextField jftfDose;
  private javax.swing.JFormattedTextField jftfName;
  private javax.swing.JLabel jlCondition;
  private javax.swing.JLabel jlDose;
  private javax.swing.JLabel jlMeasure;
  private javax.swing.JLabel jlName;
  private javax.swing.JLabel jlSchedType;
  private javax.swing.JLabel jlScheduleCreator;
  // End of variables declaration//GEN-END:variables
}
