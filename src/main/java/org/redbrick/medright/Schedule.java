package org.redbrick.medright;

/**
 *
 * @author RedBrick
 */
public class Schedule {

// Define the variable set for each Schedule object
    @SuppressWarnings("ProtectedField")
    protected String uuid;
    protected String type;
    protected String name;
    protected String medCondition;
    protected double dose;
    protected String doseMeasure;
    protected boolean reminder;
    protected boolean calendarEvent;
    protected boolean monday;
    protected boolean tuesday;
    protected boolean wednesday;
    protected boolean thursday;
    protected boolean friday;
    protected boolean saturday;
    protected boolean sunday;
    protected boolean am;
    protected boolean midAM;
    protected boolean noon;
    protected boolean midAft;
    protected boolean afternoon;
    protected boolean evening;
    protected boolean bedtime;

    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the medCondition
     */
    public String getMedCondition() {
        return medCondition;
    }

    /**
     * @param medCondition the medCondition to set
     */
    public void setMedCondition(String medCondition) {
        this.medCondition = medCondition;
    }

    /**
     * @return the dose
     */
    public double getDose() {
        return dose;
    }

    /**
     * @param dose the dose to set
     */
    public void setDose(double dose) {
        this.dose = dose;
    }

    /**
     * @return the doseMeasure
     */
    public String getDoseMeasure() {
        return doseMeasure;
    }

    /**
     * @param doseMeasure the doseMeasure to set
     */
    public void setDoseMeasure(String doseMeasure) {
        this.doseMeasure = doseMeasure;
    }

    /**
     * @return the reminder
     */
    public boolean isReminder() {
        return reminder;
    }

    /**
     * @param reminder the reminder to set
     */
    public void setReminder(boolean reminder) {
        this.reminder = reminder;
    }

    /**
     * @return the calendarEvent
     */
    public boolean isCalendarEvent() {
        return calendarEvent;
    }

    /**
     * @param calendarEvent the calendarEvent to set
     */
    public void setCalendarEvent(boolean calendarEvent) {
        this.calendarEvent = calendarEvent;
    }

    /**
     * @return the monday
     */
    public boolean isMonday() {
        return monday;
    }

    /**
     * @param monday the monday to set
     */
    public void setMonday(boolean monday) {
        this.monday = monday;
    }

    /**
     * @return the tuesday
     */
    public boolean isTuesday() {
        return tuesday;
    }

    /**
     * @param tuesday the tuesday to set
     */
    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }

    /**
     * @return the wednesday
     */
    public boolean isWednesday() {
        return wednesday;
    }

    /**
     * @param wednesday the wednesday to set
     */
    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }

    /**
     * @return the thursday
     */
    public boolean isThursday() {
        return thursday;
    }

    /**
     * @param thursday the thursday to set
     */
    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }

    /**
     * @return the friday
     */
    public boolean isFriday() {
        return friday;
    }

    /**
     * @param friday the friday to set
     */
    public void setFriday(boolean friday) {
        this.friday = friday;
    }

    /**
     * @return the saturday
     */
    public boolean isSaturday() {
        return saturday;
    }

    /**
     * @param saturday the saturday to set
     */
    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }

    /**
     * @return the sunday
     */
    public boolean isSunday() {
        return sunday;
    }

    /**
     * @param sunday the sunday to set
     */
    public void setSunday(boolean sunday) {
        this.sunday = sunday;
    }

    /**
     * @return the am
     */
    public boolean isAm() {
        return am;
    }

    /**
     * @param am the am to set
     */
    public void setAm(boolean am) {
        this.am = am;
    }

    /**
     * @return the midAM
     */
    public boolean isMidAM() {
        return midAM;
    }

    /**
     * @param midAM the midAM to set
     */
    public void setMidAM(boolean midAM) {
        this.midAM = midAM;
    }

    /**
     * @return the noon
     */
    public boolean isNoon() {
        return noon;
    }

    /**
     * @param noon the noon to set
     */
    public void setNoon(boolean noon) {
        this.noon = noon;
    }

    /**
     * @return the midAft
     */
    public boolean isMidAft() {
        return midAft;
    }

    /**
     * @param midAft the midAft to set
     */
    public void setMidAft(boolean midAft) {
        this.midAft = midAft;
    }

    /**
     * @return the afternoon
     */
    public boolean isAfternoon() {
        return afternoon;
    }

    /**
     * @param afternoon the afternoon to set
     */
    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    /**
     * @return the evening
     */
    public boolean isEvening() {
        return evening;
    }

    /**
     * @param evening the evening to set
     */
    public void setEvening(boolean evening) {
        this.evening = evening;
    }

    /**
     * @return the bedtime
     */
    public boolean isBedtime() {
        return bedtime;
    }

    /**
     * @param bedtime the bedtime to set
     */
    public void setBedtime(boolean bedtime) {
        this.bedtime = bedtime;
    }



}