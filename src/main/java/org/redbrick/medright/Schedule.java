package org.redbrick.medright;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeSupport;

public class Schedule {

// Provide basic attributes for all Schedule's    
public static final String PROP_TYPE = "PROP_TYPE";
public static final String PROP_NAME = "PROP_NAME";
public static final String PROP_CONDITION = "PROP_CONDITION";
public static final String PROP_DOSE = "PROP_DOSE";
public static final String PROP_DOSEMEASURE = "PROP_DOSEMEASURE";
// Provide boolean's for the Reminder & Calender Event triggers
public static final String PROP_REMINDER = "PROP_REMINDER";
public static final String PROP_CALENDAREVENT = "PROP_CALENDAREVENT";
// Provide boolean's for the Days Taken checkboxes
public static final String PROP_MONDAY = "PROP_MONDAY";
public static final String PROP_TUESDAY = "PROP_TUESDAY";
public static final String PROP_WEDNESDAY = "PROP_WEDNESDAY";
public static final String PROP_THURSDAY = "PROP_THURSDAY";
public static final String PROP_FRIDAY = "PROP_FRIDAY";
public static final String PROP_SATURDAY = "PROP_SATURDAY";
public static final String PROP_SUNDAY = "PROP_SUNDAY";
// Provide boolean's for the Time Taken checkboxes
public static final String PROP_AM = "PROP_AM";
public static final String PROP_MIDAM = "PROP_MIDAM";
public static final String PROP_NOON = "PROP_NOON";
public static final String PROP_MIDAFT = "PROP_MIDAFT";
public static final String PROP_AFTERNOON = "PROP_AFTERNOON";
public static final String PROP_EVENING = "PROP_EVENING";
public static final String PROP_BEDTIME = "PROP_BEDTIME";

// Define the methods to take all of the variable values and write them to a database for retreival and display in the main GUI.
    private String Type;
    private String Name;
    private String Condition;
    private double Dose;
    private String doseMeasure;
    private boolean Reminder;
    private boolean calendarEvent;
    private boolean Monday;
    private boolean Tuesday;
    private boolean Wednesday;
    private boolean Thursday;
    private boolean Friday;
    private boolean Saturday;
    private boolean Sunday;
    private boolean AM;
    private boolean midAM;
    private boolean Noon;
    private boolean midAft;
    private boolean Afternoon;
    private boolean Evening;
    private boolean Bedtime;
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    private final transient VetoableChangeSupport vetoableChangeSupport = new java.beans.VetoableChangeSupport(this);

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     * @throws java.beans.PropertyVetoException
     */
    public void setType(String Type) throws PropertyVetoException {
        java.lang.String oldType = this.Type;
        vetoableChangeSupport.fireVetoableChange(PROP_TYPE, oldType, Type);
        this.Type = Type;
        propertyChangeSupport.firePropertyChange(PROP_TYPE, oldType, Type);
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     * @throws java.beans.PropertyVetoException
     */
    public void setName(String Name) throws PropertyVetoException {
        java.lang.String oldName = this.Name;
        vetoableChangeSupport.fireVetoableChange(PROP_NAME, oldName, Name);
        this.Name = Name;
        propertyChangeSupport.firePropertyChange(PROP_NAME, oldName, Name);
    }

    /**
     * @return the Condition
     */
    public String getCondition() {
        return Condition;
    }

    /**
     * @param Condition the Condition to set
     * @throws java.beans.PropertyVetoException
     */
    public void setCondition(String Condition) throws PropertyVetoException {
        java.lang.String oldCondition = this.Condition;
        vetoableChangeSupport.fireVetoableChange(PROP_CONDITION, oldCondition, Condition);
        this.Condition = Condition;
        propertyChangeSupport.firePropertyChange(PROP_CONDITION, oldCondition, Condition);
    }

    /**
     * @return the Dose
     */
    public double getDose() {
        return Dose;
    }

    /**
     * @param Dose the Dose to set
     * @throws java.beans.PropertyVetoException
     */
    public void setDose(double Dose) throws PropertyVetoException {
        double oldDose = this.Dose;
        vetoableChangeSupport.fireVetoableChange(PROP_DOSE, oldDose, Dose);
        this.Dose = Dose;
        propertyChangeSupport.firePropertyChange(PROP_DOSE, oldDose, Dose);
    }

    /**
     * @return the doseMeasure
     */
    public String getDoseMeasure() {
        return doseMeasure;
    }

    /**
     * @param doseMeasure the doseMeasure to set
     * @throws java.beans.PropertyVetoException
     */
    public void setDoseMeasure(String doseMeasure) throws PropertyVetoException {
        java.lang.String oldDoseMeasure = this.doseMeasure;
        vetoableChangeSupport.fireVetoableChange(PROP_DOSEMEASURE, oldDoseMeasure, doseMeasure);
        this.doseMeasure = doseMeasure;
        propertyChangeSupport.firePropertyChange(PROP_DOSEMEASURE, oldDoseMeasure, doseMeasure);
    }

    /**
     * @return the Reminder
     */
    public boolean isReminder() {
        return Reminder;
    }

    /**
     * @param Reminder the Reminder to set
     * @throws java.beans.PropertyVetoException
     */
    public void setReminder(boolean Reminder) throws PropertyVetoException {
        boolean oldReminder = this.Reminder;
        vetoableChangeSupport.fireVetoableChange(PROP_REMINDER, oldReminder, Reminder);
        this.Reminder = Reminder;
        propertyChangeSupport.firePropertyChange(PROP_REMINDER, oldReminder, Reminder);
    }

    /**
     * @return the calendarEvent
     */
    public boolean isCalendarEvent() {
        return calendarEvent;
    }

    /**
     * @param calendarEvent the calendarEvent to set
     * @throws java.beans.PropertyVetoException
     */
    public void setCalendarEvent(boolean calendarEvent) throws PropertyVetoException {
        boolean oldCalendarEvent = this.calendarEvent;
        vetoableChangeSupport.fireVetoableChange(PROP_CALENDAREVENT, oldCalendarEvent, calendarEvent);
        this.calendarEvent = calendarEvent;
        propertyChangeSupport.firePropertyChange(PROP_CALENDAREVENT, oldCalendarEvent, calendarEvent);
    }

    /**
     * @return the Monday
     */
    public boolean isMonday() {
        return Monday;
    }

    /**
     * @param Monday the Monday to set
     * @throws java.beans.PropertyVetoException
     */
    public void setMonday(boolean Monday) throws PropertyVetoException {
        boolean oldMonday = this.Monday;
        vetoableChangeSupport.fireVetoableChange(PROP_MONDAY, oldMonday, Monday);
        this.Monday = Monday;
        propertyChangeSupport.firePropertyChange(PROP_MONDAY, oldMonday, Monday);
    }

    /**
     * @return the Tuesday
     */
    public boolean isTuesday() {
        return Tuesday;
    }

    /**
     * @param Tuesday the Tuesday to set
     * @throws java.beans.PropertyVetoException
     */
    public void setTuesday(boolean Tuesday) throws PropertyVetoException {
        boolean oldTuesday = this.Tuesday;
        vetoableChangeSupport.fireVetoableChange(PROP_TUESDAY, oldTuesday, Tuesday);
        this.Tuesday = Tuesday;
        propertyChangeSupport.firePropertyChange(PROP_TUESDAY, oldTuesday, Tuesday);
    }

    /**
     * @return the Wednesday
     */
    public boolean isWednesday() {
        return Wednesday;
    }

    /**
     * @param Wednesday the Wednesday to set
     * @throws java.beans.PropertyVetoException
     */
    public void setWednesday(boolean Wednesday) throws PropertyVetoException {
        boolean oldWednesday = this.Wednesday;
        vetoableChangeSupport.fireVetoableChange(PROP_WEDNESDAY, oldWednesday, Wednesday);
        this.Wednesday = Wednesday;
        propertyChangeSupport.firePropertyChange(PROP_WEDNESDAY, oldWednesday, Wednesday);
    }

    /**
     * @return the Thursday
     */
    public boolean isThursday() {
        return Thursday;
    }

    /**
     * @param Thursday the Thursday to set
     * @throws java.beans.PropertyVetoException
     */
    public void setThursday(boolean Thursday) throws PropertyVetoException {
        boolean oldThursday = this.Thursday;
        vetoableChangeSupport.fireVetoableChange(PROP_THURSDAY, oldThursday, Thursday);
        this.Thursday = Thursday;
        propertyChangeSupport.firePropertyChange(PROP_THURSDAY, oldThursday, Thursday);
    }

    /**
     * @return the Friday
     */
    public boolean isFriday() {
        return Friday;
    }

    /**
     * @param Friday the Friday to set
     * @throws java.beans.PropertyVetoException
     */
    public void setFriday(boolean Friday) throws PropertyVetoException {
        boolean oldFriday = this.Friday;
        vetoableChangeSupport.fireVetoableChange(PROP_FRIDAY, oldFriday, Friday);
        this.Friday = Friday;
        propertyChangeSupport.firePropertyChange(PROP_FRIDAY, oldFriday, Friday);
    }

    /**
     * @return the Saturday
     */
    public boolean isSaturday() {
        return Saturday;
    }

    /**
     * @param Saturday the Saturday to set
     * @throws java.beans.PropertyVetoException
     */
    public void setSaturday(boolean Saturday) throws PropertyVetoException {
        boolean oldSaturday = this.Saturday;
        vetoableChangeSupport.fireVetoableChange(PROP_SATURDAY, oldSaturday, Saturday);
        this.Saturday = Saturday;
        propertyChangeSupport.firePropertyChange(PROP_SATURDAY, oldSaturday, Saturday);
    }

    /**
     * @return the Sunday
     */
    public boolean isSunday() {
        return Sunday;
    }

    /**
     * @param Sunday the Sunday to set
     * @throws java.beans.PropertyVetoException
     */
    public void setSunday(boolean Sunday) throws PropertyVetoException {
        boolean oldSunday = this.Sunday;
        vetoableChangeSupport.fireVetoableChange(PROP_SUNDAY, oldSunday, Sunday);
        this.Sunday = Sunday;
        propertyChangeSupport.firePropertyChange(PROP_SUNDAY, oldSunday, Sunday);
    }

    /**
     * @return the AM
     */
    public boolean isAM() {
        return AM;
    }

    /**
     * @param AM the AM to set
     * @throws java.beans.PropertyVetoException
     */
    public void setAM(boolean AM) throws PropertyVetoException {
        boolean oldAM = this.AM;
        vetoableChangeSupport.fireVetoableChange(PROP_AM, oldAM, AM);
        this.AM = AM;
        propertyChangeSupport.firePropertyChange(PROP_AM, oldAM, AM);
    }

    /**
     * @return the midAM
     */
    public boolean isMidAM() {
        return midAM;
    }

    /**
     * @param midAM the midAM to set
     * @throws java.beans.PropertyVetoException
     */
    public void setMidAM(boolean midAM) throws PropertyVetoException {
        boolean oldMidAM = this.midAM;
        vetoableChangeSupport.fireVetoableChange(PROP_MIDAM, oldMidAM, midAM);
        this.midAM = midAM;
        propertyChangeSupport.firePropertyChange(PROP_MIDAM, oldMidAM, midAM);
    }

    /**
     * @return the Noon
     */
    public boolean isNoon() {
        return Noon;
    }

    /**
     * @param Noon the Noon to set
     * @throws java.beans.PropertyVetoException
     */
    public void setNoon(boolean Noon) throws PropertyVetoException {
        boolean oldNoon = this.Noon;
        vetoableChangeSupport.fireVetoableChange(PROP_NOON, oldNoon, Noon);
        this.Noon = Noon;
        propertyChangeSupport.firePropertyChange(PROP_NOON, oldNoon, Noon);
    }

    /**
     * @return the midAft
     */
    public boolean isMidAft() {
        return midAft;
    }

    /**
     * @param midAft the midAft to set
     * @throws java.beans.PropertyVetoException
     */
    public void setMidAft(boolean midAft) throws PropertyVetoException {
        boolean oldMidAft = this.midAft;
        vetoableChangeSupport.fireVetoableChange(PROP_MIDAFT, oldMidAft, midAft);
        this.midAft = midAft;
        propertyChangeSupport.firePropertyChange(PROP_MIDAFT, oldMidAft, midAft);
    }

    /**
     * @return the Afternoon
     */
    public boolean isAfternoon() {
        return Afternoon;
    }

    /**
     * @param Afternoon the Afternoon to set
     * @throws java.beans.PropertyVetoException
     */
    public void setAfternoon(boolean Afternoon) throws PropertyVetoException {
        boolean oldAfternoon = this.Afternoon;
        vetoableChangeSupport.fireVetoableChange(PROP_AFTERNOON, oldAfternoon, Afternoon);
        this.Afternoon = Afternoon;
        propertyChangeSupport.firePropertyChange(PROP_AFTERNOON, oldAfternoon, Afternoon);
    }

    /**
     * @return the Evening
     */
    public boolean isEvening() {
        return Evening;
    }

    /**
     * @param Evening the Evening to set
     * @throws java.beans.PropertyVetoException
     */
    public void setEvening(boolean Evening) throws PropertyVetoException {
        boolean oldEvening = this.Evening;
        vetoableChangeSupport.fireVetoableChange(PROP_EVENING, oldEvening, Evening);
        this.Evening = Evening;
        propertyChangeSupport.firePropertyChange(PROP_EVENING, oldEvening, Evening);
    }

    /**
     * @return the Bedtime
     */
    public boolean isBedtime() {
        return Bedtime;
    }

    /**
     * @param Bedtime the Bedtime to set
     * @throws java.beans.PropertyVetoException
     */
    public void setBedtime(boolean Bedtime) throws PropertyVetoException {
        boolean oldBedtime = this.Bedtime;
        vetoableChangeSupport.fireVetoableChange(PROP_BEDTIME, oldBedtime, Bedtime);
        this.Bedtime = Bedtime;
        propertyChangeSupport.firePropertyChange(PROP_BEDTIME, oldBedtime, Bedtime);
    }

}