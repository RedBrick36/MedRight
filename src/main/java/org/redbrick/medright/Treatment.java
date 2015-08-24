package org.redbrick.medright;

import java.util.logging.*;

/**
 *
 * @author RedBrick
 */
class Treatment {

    private static final Logger LOG = Logger.getLogger (
            Treatment.class.getName ());

    /**
     *
     */
    boolean AllDays;

    /**
     *
     */
    boolean AllTimes;

    /**
     *
     */
    boolean AsNeeded;

    /**
     *
     */
    int LeadTime;

    /**
     *
     */
    boolean afternoon;

    /**
     *
     */
    boolean am;

    /**
     *
     */
    boolean bedtime;

    /**
     *
     */
    String condition;

    /**
     *
     */
    double dose;

    /**
     *
     */
    String doseMeasure;

    /**
     *
     */
    boolean evening;

    /**
     *
     */
    boolean friday;

    /**
     *
     */
    boolean midAM;

    /**
     *
     */
    boolean midAft;

    /**
     *
     */
    boolean monday;

    /**
     *
     */
    String name;

    /**
     *
     */
    boolean noon;

    /**
     *
     */
    String otf;

    /**
     *
     */
    boolean reminder;

    /**
     *
     */
    boolean saturday;

    /**
     *
     */
    boolean sunday;

    /**
     *
     */
    boolean thursday;

    /**
     *
     */
    boolean tuesday;

    /**
     *
     */
    String type;
    /**
     * Define the field-set for the class
     */
    int uuid;

    /**
     *
     */
    boolean wednesday;

    /**
     * Constructor
     */
    public Treatment () {
        this.uuid = 0;
        this.type = "";
        this.name = "";
        this.condition = "";
        this.dose = 0.0;
        this.doseMeasure = "";
        this.reminder = false;
        this.monday = false;
        this.tuesday = false;
        this.wednesday = false;
        this.thursday = false;
        this.friday = false;
        this.saturday = false;
        this.sunday = false;
        this.am = false;
        this.midAM = false;
        this.noon = false;
        this.midAft = false;
        this.afternoon = false;
        this.evening = false;
        this.bedtime = false;
        this.AllDays = false;
        this.AllTimes = false;
        this.AsNeeded = false;
        this.LeadTime = 00;
        this.otf = "";
    }

    /**
     * @return the condition
     */
    String getCondition () {
        return this.condition;
    }

    /**
     * @param condition the condition to set
     */
    void setCondition (String condition) {
        this.condition = condition;
    }

    /**
     * @return the dose
     */
    double getDose () {
        return this.dose;
    }

    /**
     * @param dose the dose to set
     */
    void setDose (double dose) {
        this.dose = dose;
    }

    /**
     * @return the doseMeasure
     */
    String getDoseMeasure () {
        return this.doseMeasure;
    }

    /**
     * @param doseMeasure the doseMeasure to set
     */
    void setDoseMeasure (String doseMeasure) {
        this.doseMeasure = doseMeasure;
    }

    /**
     * @return the leadTime
     */
    int getLeadTime () {
        return this.LeadTime;
    }

    /**
     * @param LeadTime the LeadTime to set
     */
    void setLeadTime (int LeadTime) {
        this.LeadTime = LeadTime;
    }

    /**
     * @return the name
     */
    String getName () {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    void setName (String name) {
        this.name = name;
    }

    /**
     * Return the state of the object as a comma delimited string
     * for writing to database file later
     *
     * @return
     */
    String getStringState () {
        return this.getUuid () + ", " + this.getType () + ", " + this.
                getName ()
                + ", " + this.getCondition () + ", " + this.getDose ()
                + ", "
                + this.getDoseMeasure () + ", " + this.isReminder ()
                + ", "
                + this.isMonday () + ", " + this.isTuesday () + ", "
                + this.isWednesday () + ", " + this.isThursday ()
                + ", "
                + this.isFriday () + ", " + this.isSaturday () + ", "
                + this.isSunday () + ", " + this.isAm () + ", "
                + this.isMidAM ()
                + ", " + this.isNoon () + ", " + this.isMidAft ()
                + ", "
                + this.isAfternoon () + ", " + this.isEvening ()
                + ", "
                + this.isBedtime () + ", " + this.isAllDays () + ", "
                + this.isAllTimes () + ", " + this.isAsNeeded ()
                + ", "
                + this.getLeadTime () + ", " + this.getotf ();
    }

    /**
     * @return the type
     */
    String getType () {
        return this.type;
    }

    /**
     * @param type the type to set
     */
    void setType (String type) {
        this.type = type;
    }

    /**
     * @return the uuid
     */
    int getUuid () {
        return this.uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    void setUuid (int uuid) {
        this.uuid = uuid;
    }

    /**
     *
     * @return otf
     */
    String getotf () {
        return this.otf;
    }

    /**
     * @param otf the otf to set
     */
    void setotf (String otf) {
        this.otf = otf;
    }

    /**
     * @return the afternoon
     */
    boolean isAfternoon () {
        return this.afternoon;
    }

    /**
     * @param afternoon the afternoon to set
     */
    void setAfternoon (boolean afternoon) {
        this.afternoon = afternoon;
    }

    /**
     * @return the allDays
     */
    boolean isAllDays () {
        return this.AllDays;
    }

    /**
     * @param allDays the allDays to set
     */
    void setAllDays (boolean allDays) {
        this.AllDays = allDays;
    }

    /**
     * @return the allTimes
     */
    boolean isAllTimes () {
        return this.AllTimes;
    }

    /**
     * @param allTimes the allTimes to set
     */
    void setAllTimes (boolean allTimes) {
        this.AllTimes = allTimes;
    }

    /**
     * @return the am
     */
    boolean isAm () {
        return this.am;
    }

    /**
     * @param am the am to set
     */
    void setAm (boolean am) {
        this.am = am;
    }

    /**
     * @return the asNeeded
     */
    boolean isAsNeeded () {
        return this.AsNeeded;
    }

    /**
     * @param asNeeded the asNeeded to set
     */
    void setAsNeeded (boolean asNeeded) {
        this.AsNeeded = asNeeded;
    }

    /**
     * @return the bedtime
     */
    boolean isBedtime () {
        return this.bedtime;
    }

    /**
     * @param bedtime the bedtime to set
     */
    void setBedtime (boolean bedtime) {
        this.bedtime = bedtime;
    }

    /**
     * @return the evening
     */
    boolean isEvening () {
        return this.evening;
    }

    /**
     * @param evening the evening to set
     */
    void setEvening (boolean evening) {
        this.evening = evening;
    }

    /**
     * @return the friday
     */
    boolean isFriday () {
        return this.friday;
    }

    /**
     * @param friday the friday to set
     */
    void setFriday (boolean friday) {
        this.friday = friday;
    }

    /**
     * @return the midAM
     */
    boolean isMidAM () {
        return this.midAM;
    }

    /**
     * @param midAM the midAM to set
     */
    void setMidAM (boolean midAM) {
        this.midAM = midAM;
    }

    /**
     * @return the midAft
     */
    boolean isMidAft () {
        return this.midAft;
    }

    /**
     * @param midAft the midAft to set
     */
    void setMidAft (boolean midAft) {
        this.midAft = midAft;
    }

    /**
     * @return the monday
     */
    boolean isMonday () {
        return this.monday;
    }

    /**
     * @param monday the monday to set
     */
    void setMonday (boolean monday) {
        this.monday = monday;
    }

    /**
     * @return the noon
     */
    boolean isNoon () {
        return this.noon;
    }

    /**
     * @param noon the noon to set
     */
    void setNoon (boolean noon) {
        this.noon = noon;
    }

    /**
     * @return the reminder
     */
    boolean isReminder () {
        return this.reminder;
    }

    /**
     * @param reminder the reminder to set
     */
    void setReminder (boolean reminder) {
        this.reminder = reminder;
    }

    /**
     * @return the saturday
     */
    boolean isSaturday () {
        return this.saturday;
    }

    /**
     * @param saturday the saturday to set
     */
    void setSaturday (boolean saturday) {
        this.saturday = saturday;
    }

    /**
     * @return the sunday
     */
    boolean isSunday () {
        return this.sunday;
    }

    /**
     * @param sunday the sunday to set
     */
    void setSunday (boolean sunday) {
        this.sunday = sunday;
    }

    /**
     * @return the thursday
     */
    boolean isThursday () {
        return this.thursday;
    }

    /**
     * @param thursday the thursday to set
     */
    void setThursday (boolean thursday) {
        this.thursday = thursday;
    }

    /**
     * @return the tuesday
     */
    boolean isTuesday () {
        return this.tuesday;
    }

    /**
     * @param tuesday the tuesday to set
     */
    void setTuesday (boolean tuesday) {
        this.tuesday = tuesday;
    }

    /**
     * @return the wednesday
     */
    boolean isWednesday () {
        return this.wednesday;
    }

    /**
     * @param wednesday the wednesday to set
     */
    void setWednesday (boolean wednesday) {
        this.wednesday = wednesday;
    }
}
