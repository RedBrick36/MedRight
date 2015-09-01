package org.redbrick.medright;

import java.io.*;
import java.util.logging.*;
import javax.persistence.*;

/**
 *
 * @author RedBrick
 */
/**
 * This class provides the foundation for all other operartion's.
 * Providing
 * persistence to this class will allow each instance of this class to
 * either
 * insert into the scheduleDB database a row or to update/delete an
 * existing row
 * (representing a treatment object) in the database.
 */
// Setting up the class as a persistence entity (Domain Class).
@Entity
public class Treatment implements Serializable {

	// Continue setup of persistence by providing a unique, auto generated, id
// for persistence use only.
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
private int id;
@SuppressWarnings ("unused")
private static final Logger LOG = Logger.getLogger (Treatment.class.getName ());
/**
 * Indicates whether the treatment is taken every day of the week
 */
private boolean AllDays;
/**
 * Indicates whether the treatment is taken at all time frames
 */
private boolean AllTimes;
/**
 * Indicates that the treatment is only taken as needed and not
 * according to
 * a particular schedule
 */
private boolean AsNeeded;
/**
 * Indicates the number of minutes ahead of the next naturally
 * occurring
 * schedule reminder to pop up a reminder of the upcoming schedule
 * requirements
 */
private int LeadTime;
/**
 * Indicates that the treatment is to be taken at the time set for an
 * afternoon schedule
 */
private boolean afternoon;
/**
 * Indicates that the treatment is to be taken at the time set for an
 * am
 * schedule
 */
private boolean am;
/**
 * Indicates that the treatment is to be taken at the time set for a
 * bedtime
 * schedule
 */
private boolean bedtime;
/**
 * Declares the condition for which the treatment is prescribed
 */
private String condition;
/**
 * Declares the volume of the dose in 2 decimal format
 */
private double dose;
/**
 * Declares the type of measure used in indicating the dose above:
 * i.e.
 * milligrams, cc's, etc..
 */
private String doseMeasure;
/**
 * Indicates that the treatment is to be taken at the time set for an
 * evening schedule
 */
private boolean evening;
/**
 * Indicates that the treatment is to be taken on Fridays
 */
private boolean friday;
/**
 * Indicates that the treatment is to be taken at the time set for a
 * mid-morning schedule
 */
private boolean midAM;
/**
 * Indicates that the treatment is to be taken at the time set for a
 * mid-afternoon schedule
 */
private boolean midAft;
/**
 * Indicates that the treatment is to be taken on Mondays
 */
private boolean monday;
/**
 * Declares the name of the treatment as indicated on the container
 * for the
 * treatment
 */
private String name;
/**
 * Indicates that the treatment is to be taken at the time set for a
 * noon
 * schedule
 */
private boolean noon;
/**
 * Declares time-frames other than the above listed times: i.e.
 * monthly,
 * every other week, etc..
 */
private String otf;
/**
 * Indicates whether the user desires pop up reminders
 */
private boolean reminder;
/**
 * Indicates that the treatment is to be taken on Saturdays
 */
private boolean saturday;
/**
 * Indicates that the treatment is to be taken on Sundays
 */
private boolean sunday;
/**
 * Indicates that the treatment is to be taken on Thursdays
 */
private boolean thursday;
/**
 * Indicates that the treatment is to be taken on Tuesdays
 */
private boolean tuesday;
/**
 * Declares the type of treatment: i.e. Pill, Liquid, Topical,
 * Injection or
 * Supplement.
 *
 * TType is an enumerated datatype containing the five possibilities
 * for the
 * field 'type'
 *
 * In reality this is not actually needed because the ui that is used
 * for
 * setting the instance's 'type' field is fixed to the available
 * values in a
 * combo box. However, making 'type' an enumerated data type provides
 * a
 * "warm fuzzy" in ensuring that the value of that field can only be
 * one of
 * five values -- no matter how it is set.
 *
 */
private TType type;
/**
 * Defines a unique identifying number for each treatment entry based
 * upon
 * type of treatment.
 */
private int uuid;
/**
 * Indicates that the treatment is to be taken on Wednesdays
 */
private boolean wednesday;
/**
 * Surrogate variable used to provide an empty constructor for
 * persistence.
 */
@SuppressWarnings ("unused")
private String surrogate = "";

// Create empty constructor for use by persistence only
public Treatment () {
}

/**
 * Application-called constructor for this class
 */
public Treatment (String go) {
  this.surrogate = go;
  this.uuid = 0;
  this.type = null;
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
  this.LeadTime = 0;
  this.otf = "";
}

// Define all of the setters and getters for class fields
/**
 * @return the condition
 */
String getCondition () {
  return this.condition;
}

/**
 * @param condition
 * the condition to set
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
 * @param dose
 * the dose to set
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
 * @param doseMeasure
 * the doseMeasure to set
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
 * @param LeadTime
 * the LeadTime to set
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
 * @param name
 * the name to set
 */
void setName (String name) {
  this.name = name;
}

/**
 * @return the type
 */
TType getType () {
  return this.type;
}

/**
 * @param type
 * the type to set
 */
void setType (TType type) {
  this.type = type;
}

/**
 * @return the uuid
 */
int getUuid () {
  return this.uuid;
}

/**
 * @param uuid
 * the uuid to set
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
 * @param otf
 * the otf to set
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
 * @param afternoon
 * the afternoon to set
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
 * @param allDays
 * the allDays to set
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
 * @param allTimes
 * the allTimes to set
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
 * @param am
 * the am to set
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
 * @param asNeeded
 * the asNeeded to set
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
 * @param bedtime
 * the bedtime to set
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
 * @param evening
 * the evening to set
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
 * @param friday
 * the friday to set
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
 * @param midAM
 * the midAM to set
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
 * @param midAft
 * the midAft to set
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
 * @param monday
 * the monday to set
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
 * @param noon
 * the noon to set
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
 * @param reminder
 * the reminder to set
 */
public void setReminder (boolean reminder) {
  this.reminder = reminder;
}

/**
 * @return the saturday
 */
public boolean isSaturday () {
  return this.saturday;
}

/**
 * @param saturday
 * the saturday to set
 */
public void setSaturday (boolean saturday) {
  this.saturday = saturday;
}

/**
 * @return the sunday
 */
public boolean isSunday () {
  return this.sunday;
}

/**
 * @param sunday
 * the sunday to set
 */
public void setSunday (boolean sunday) {
  this.sunday = sunday;
}

/**
 * @return the thursday
 */
public boolean isThursday () {
  return this.thursday;
}

/**
 * @param thursday
 * the thursday to set
 */
public void setThursday (boolean thursday) {
  this.thursday = thursday;
}

/**
 * @return the tuesday
 */
public boolean isTuesday () {
  return this.tuesday;
}

/**
 * @param tuesday
 * the tuesday to set
 */
public void setTuesday (boolean tuesday) {
  this.tuesday = tuesday;
}

/**
 * @return the wednesday
 */
public boolean isWednesday () {
  return this.wednesday;
}

/**
 * @param wednesday
 * the wednesday to set
 */
public void setWednesday (boolean wednesday) {
  this.wednesday = wednesday;
}

// Provide a "State of the Object" return value
/**
 * Return the state of the object as a comma delimited string
 *
 * @return
 */
public String getStateOfTheObject () {
  return this.getUuid () + ", " + this.getType () + ", " + this.getName () + ", " + this.getCondition () + ", "
      + this.getDose () + ", " + this.getDoseMeasure () + ", " + this.isReminder () + ", " + this.isMonday ()
      + ", " + this.isTuesday () + ", " + this.isWednesday () + ", " + this.isThursday () + ", "
      + this.isFriday () + ", " + this.isSaturday () + ", " + this.isSunday () + ", " + this.isAm () + ", "
      + this.isMidAM () + ", " + this.isNoon () + ", " + this.isMidAft () + ", " + this.isAfternoon () + ", "
      + this.isEvening () + ", " + this.isBedtime () + ", " + this.isAllDays () + ", " + this.isAllTimes () + ", "
      + this.isAsNeeded () + ", " + this.getLeadTime () + ", " + this.getotf ();
}
}
