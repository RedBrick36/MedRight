package org.redbrick.medright;

/**
 *
 * @author RedBrick
 */

public class Schedule {
    
    /**
     * Define the field-set for the class
     */
    private String uuid;
    private String type;
    private String name;
    private String condition;
    private double dose;
    private String doseMeasure;
    private boolean reminder;
    private boolean calendarEvent;
    private boolean monday;
    private boolean tuesday;
    private boolean wednesday;
    private boolean thursday;
    private boolean friday;
    private boolean saturday;
    private boolean sunday;
    private boolean am;
    private boolean midAM;
    private boolean noon;
    private boolean midAft;
    private boolean afternoon;
    private boolean evening;
    private boolean bedtime;
    private byte pillOffset;
    private byte liquidOffset;
    private byte topicalOffset;
    
    /**
     * Default Constructor 
     */
    public Schedule()
    {
    uuid = "";
    type = "";
    name = "";
    condition = "";
    dose = 0.0;
    doseMeasure = "";
    reminder = false;
    calendarEvent = false;
    monday = false;
    tuesday = false;
    wednesday = false;
    thursday = false;
    friday = false;
    saturday = false;
    sunday = false;
    am = false;
    midAM = false;
    noon = false;
    midAft = false;
    afternoon = false;
    evening = false;
    bedtime = false;    
    }
    /**
     * Return the state of the object as a comma delimited string
     * for writing to database file
     * @return 
     */
    public String getState() {
        return uuid+","+type+","+name+","+condition+","+dose+","+doseMeasure+","
        +reminder+","+calendarEvent+","+monday+","+tuesday+","+wednesday+","
        +thursday+","+friday+","+saturday+","+sunday+","+am+","+midAM+","+noon+
        ","+midAft+","+afternoon+","+evening+","+bedtime;
    }
        
    /* Need to fix....
    public byte getOffsets() {
        return pillOffset + liquidOffset + topicalOffset;
    }
    */
    
    /**
     * @return the pillOffset
     */
    protected byte getPillOffset() {
        return pillOffset;
    }

    /**
     * @param pillOffset the pillOffset to set
     */
    protected void setPillOffset(byte pillOffset) {
        this.pillOffset = pillOffset;
    }

    /**
     * @return the liquidOffset
     */
    protected byte getLiquidOffset() {
        return liquidOffset;
    }

    /**
     * @param liquidOffset the liquidOffset to set
     */
    protected void setLiquidOffset(byte liquidOffset) {
        this.liquidOffset = liquidOffset;
    }

    /**
     * @return the topicalOffset
     */
    protected byte getTopicalOffset() {
        return topicalOffset;
    }

    /**
     * @param topicalOffset the topicalOffset to set
     */
    protected void setTopicalOffset(byte topicalOffset) {
        this.topicalOffset = topicalOffset;
    }
    // Define getter and setter pairs for each field
    
    /**
     * @return - uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid - uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return - type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type - type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return - name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name - name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return - condition
     */
    public String getCondition() {
        return condition;
    }

    /**
     * @param condition - condition to set
     */
    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * @return - dose
     */
    public double getDose() {
        return dose;
    }

    /**
     * @param dose - dose to set
     */
    public void setDose(double dose) {
        this.dose = dose;
    }

    /**
     * @return - doseMeasure
     */
    public String getDoseMeasure() {
        return doseMeasure;
    }

    /**
     * @param doseMeasure - doseMeasure to set
     */
    public void setDoseMeasure(String doseMeasure) {
        this.doseMeasure = doseMeasure;
    }

    /**
     * @return - reminder
     */
    public boolean isReminder() {
        return reminder;
    }

    /**
     * @param reminder - reminder to set
     */
    public void setReminder(boolean reminder) {
        this.reminder = reminder;
    }

    /**
     * @return - calendarEvent
     */
    public boolean isCalendarEvent() {
        return calendarEvent;
    }

    /**
     * @param calendarEvent - calendarEvent to set
     */
    public void setCalendarEvent(boolean calendarEvent) {
        this.calendarEvent = calendarEvent;
    }

    /**
     * @return - Monday
     */
    public boolean isMonday() {
        return monday;
    }

    /**
     * @param monday - Monday to set
     */
    public void setMonday(boolean monday) {
        this.monday = monday;
    }

    /**
     * @return - Tuesday
     */
    public boolean isTuesday() {
        return tuesday;
    }

    /**
     * @param tuesday - Tuesday to set
     */
    public void setTuesday(boolean tuesday) {
        this.tuesday = tuesday;
    }

    /**
     * @return - Wednesday
     */
    public boolean isWednesday() {
        return wednesday;
    }

    /**
     * @param wednesday - Wednesday to set
     */
    public void setWednesday(boolean wednesday) {
        this.wednesday = wednesday;
    }

    /**
     * @return - Thursday
     */
    public boolean isThursday() {
        return thursday;
    }

    /**
     * @param thursday - Thursday to set
     */
    public void setThursday(boolean thursday) {
        this.thursday = thursday;
    }

    /**
     * @return - Friday
     */
    public boolean isFriday() {
        return friday;
    }

    /**
     * @param friday - Friday to set
     */
    public void setFriday(boolean friday) {
        this.friday = friday;
    }

    /**
     * @return - Saturday
     */
    public boolean isSaturday() {
        return saturday;
    }

    /**
     * @param saturday - Saturday to set
     */
    public void setSaturday(boolean saturday) {
        this.saturday = saturday;
    }

    /**
     * @return - Sunday
     */
    public boolean isSunday() {
        return sunday;
    }

    /**
     * @param sunday - Sunday to set
     */
    public void setSunday(boolean sunday) {
        this.sunday = sunday;
    }

    /**
     * @return - am
     */
    public boolean isAm() {
        return am;
    }

    /**
     * @param am - am to set
     */
    public void setAm(boolean am) {
        this.am = am;
    }

    /**
     * @return - midAM
     */
    public boolean isMidAM() {
        return midAM;
    }

    /**
     * @param midAM - midAM to set
     */
    public void setMidAM(boolean midAM) {
        this.midAM = midAM;
    }

    /**
     * @return - noon
     */
    public boolean isNoon() {
        return noon;
    }

    /**
     * @param noon - noon to set
     */
    public void setNoon(boolean noon) {
        this.noon = noon;
    }

    /**
     * @return - midAft
     */
    public boolean isMidAft() {
        return midAft;
    }

    /**
     * @param midAft - midAft to set
     */
    public void setMidAft(boolean midAft) {
        this.midAft = midAft;
    }

    /**
     * @return - afternoon
     */
    public boolean isAfternoon() {
        return afternoon;
    }

    /**
     * @param afternoon - afternoon to set
     */
    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    /**
     * @return - evening
     */
    public boolean isEvening() {
        return evening;
    }

    /**
     * @param evening - evening to set
     */
    public void setEvening(boolean evening) {
        this.evening = evening;
    }

    /**
     * @return - bedtime
     */
    public boolean isBedtime() {
        return bedtime;
    }

    /**
     * @param bedtime - bedtime to set
     */
    public void setBedtime(boolean bedtime) {
        this.bedtime = bedtime;
    }

}