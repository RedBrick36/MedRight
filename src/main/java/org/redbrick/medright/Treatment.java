package org.redbrick.medright;

/**
 *
 * @author RedBrick
 */
public class Treatment {

  /**
   * Define the field-set for the class
   */
  protected int uuid;
  protected String type;
  protected String name;
  protected String condition;
  protected double dose;
  protected String doseMeasure;
  protected boolean reminder;
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
  protected boolean AllDays;
  protected boolean AllTimes;
  protected boolean AsNeeded;
  protected int LeadTime;
  protected String otf;

  /**
   * Constructor
   */
  public Treatment () {
    uuid = 0;
    type = "";
    name = "";
    condition = "";
    dose = 0.0;
    doseMeasure = "";
    reminder = false;
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
    AllDays = false;
    AllTimes = false;
    AsNeeded = false;
    LeadTime = 00;
    otf = "";
  }

  /**
   * Return the state of the object as a comma delimited string
   * for writing to database file later
   *
   * @return
   */
  public String getStringState () {
    return getUuid () + ", " + getType () + ", " + getName () + ", " + getCondition () + ", " + getDose () + ", " + getDoseMeasure () + ", " + isReminder () + ", " + isMonday () + ", " + isTuesday () + ", " + isWednesday () + ", " + isThursday () + ", " + isFriday () + ", " + isSaturday () + ", " + isSunday () + ", " + isAm () + ", " + isMidAM () + ", " + isNoon () + ", " + isMidAft () + ", " + isAfternoon () + ", " + isEvening () + ", " + isBedtime () + ", " + isAllDays () + ", " + isAllTimes () + ", " + isAsNeeded () + ", " + getLeadTime () + ", " + getotf ();
  }

  /**
   * @return the uuid
   */
  protected int getUuid () {
    return uuid;
  }

  /**
   * @param uuid the uuid to set
   */
  protected void setUuid (int uuid) {
    this.uuid = uuid;
  }

  /**
   * @return the type
   */
  protected String getType () {
    return type;
  }

  /**
   * @param type the type to set
   */
  protected void setType (String type) {
    this.type = type;
  }

  /**
   * @return the name
   */
  protected String getName () {
    return name;
  }

  /**
   * @param name the name to set
   */
  protected void setName (String name) {
    this.name = name;
  }

  /**
   * @return the condition
   */
  protected String getCondition () {
    return condition;
  }

  /**
   * @param condition the condition to set
   */
  protected void setCondition (String condition) {
    this.condition = condition;
  }

  /**
   * @return the dose
   */
  protected double getDose () {
    return dose;
  }

  /**
   * @param dose the dose to set
   */
  protected void setDose (double dose) {
    this.dose = dose;
  }

  /**
   * @return the doseMeasure
   */
  protected String getDoseMeasure () {
    return doseMeasure;
  }

  /**
   * @param doseMeasure the doseMeasure to set
   */
  protected void setDoseMeasure (String doseMeasure) {
    this.doseMeasure = doseMeasure;
  }

  /**
   * @return the reminder
   */
  protected boolean isReminder () {
    return reminder;
  }

  /**
   * @param reminder the reminder to set
   */
  protected void setReminder (boolean reminder) {
    this.reminder = reminder;
  }

  /**
   * @return the monday
   */
  protected boolean isMonday () {
    return monday;
  }

  /**
   * @param monday the monday to set
   */
  protected void setMonday (boolean monday) {
    this.monday = monday;
  }

  /**
   * @return the tuesday
   */
  protected boolean isTuesday () {
    return tuesday;
  }

  /**
   * @param tuesday the tuesday to set
   */
  protected void setTuesday (boolean tuesday) {
    this.tuesday = tuesday;
  }

  /**
   * @return the wednesday
   */
  protected boolean isWednesday () {
    return wednesday;
  }

  /**
   * @param wednesday the wednesday to set
   */
  protected void setWednesday (boolean wednesday) {
    this.wednesday = wednesday;
  }

  /**
   * @return the thursday
   */
  protected boolean isThursday () {
    return thursday;
  }

  /**
   * @param thursday the thursday to set
   */
  protected void setThursday (boolean thursday) {
    this.thursday = thursday;
  }

  /**
   * @return the friday
   */
  protected boolean isFriday () {
    return friday;
  }

  /**
   * @param friday the friday to set
   */
  protected void setFriday (boolean friday) {
    this.friday = friday;
  }

  /**
   * @return the saturday
   */
  protected boolean isSaturday () {
    return saturday;
  }

  /**
   * @param saturday the saturday to set
   */
  protected void setSaturday (boolean saturday) {
    this.saturday = saturday;
  }

  /**
   * @return the sunday
   */
  protected boolean isSunday () {
    return sunday;
  }

  /**
   * @param sunday the sunday to set
   */
  protected void setSunday (boolean sunday) {
    this.sunday = sunday;
  }

  /**
   * @return the am
   */
  protected boolean isAm () {
    return am;
  }

  /**
   * @param am the am to set
   */
  protected void setAm (boolean am) {
    this.am = am;
  }

  /**
   * @return the midAM
   */
  protected boolean isMidAM () {
    return midAM;
  }

  /**
   * @param midAM the midAM to set
   */
  protected void setMidAM (boolean midAM) {
    this.midAM = midAM;
  }

  /**
   * @return the noon
   */
  protected boolean isNoon () {
    return noon;
  }

  /**
   * @param noon the noon to set
   */
  protected void setNoon (boolean noon) {
    this.noon = noon;
  }

  /**
   * @return the midAft
   */
  protected boolean isMidAft () {
    return midAft;
  }

  /**
   * @param midAft the midAft to set
   */
  protected void setMidAft (boolean midAft) {
    this.midAft = midAft;
  }

  /**
   * @return the afternoon
   */
  protected boolean isAfternoon () {
    return afternoon;
  }

  /**
   * @param afternoon the afternoon to set
   */
  protected void setAfternoon (boolean afternoon) {
    this.afternoon = afternoon;
  }

  /**
   * @return the evening
   */
  protected boolean isEvening () {
    return evening;
  }

  /**
   * @param evening the evening to set
   */
  protected void setEvening (boolean evening) {
    this.evening = evening;
  }

  /**
   * @return the bedtime
   */
  protected boolean isBedtime () {
    return bedtime;
  }

  /**
   * @param bedtime the bedtime to set
   */
  protected void setBedtime (boolean bedtime) {
    this.bedtime = bedtime;
  }

  /**
   * @return the allDays
   */
  protected boolean isAllDays () {
    return AllDays;
  }

  /**
   * @param allDays the allDays to set
   */
  protected void setAllDays (boolean allDays) {
    this.AllDays = allDays;
  }

  /**
   * @return the allTimes
   */
  protected boolean isAllTimes () {
    return AllTimes;
  }

  /**
   * @param allTimes the allTimes to set
   */
  protected void setAllTimes (boolean allTimes) {
    this.AllTimes = allTimes;
  }

  /**
   * @return the asNeeded
   */
  protected boolean isAsNeeded () {
    return AsNeeded;
  }

  /**
   * @param asNeeded the asNeeded to set
   */
  protected void setAsNeeded (boolean asNeeded) {
    this.AsNeeded = asNeeded;
  }

  /**
   * @return the leadTime
   */
  protected int getLeadTime () {
    return LeadTime;
  }

  /**
   * @param LeadTime the LeadTime to set
   */
  protected void setLeadTime (int LeadTime) {
    this.LeadTime = LeadTime;
  }

  /**
   *
   * @return otf
   */
  protected String getotf () {
    return otf;
  }

  /**
   * @param otf the otf to set
   */
  protected void setotf (String otf) {
    this.otf = otf;
  }
}
