package org.redbrick.medright;


import java.io.*;
import javax.persistence.*;

@Entity
@Table (name = "TREATMENTS")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
public class Treatments implements Serializable {

private static final long serialVersionUID = 1L;
@Column (name = "REASON", table = "TREATMENTS", length = 45)
@Basic
private String reason;
@Column (name = "SATURDAY", table = "TREATMENTS")
@Basic
private Boolean saturday;
@Column (name = "MIDAM", table = "TREATMENTS")
@Basic
private Boolean midam;
@Column (name = "TYPE", table = "TREATMENTS", length = 10)
@Basic
private String type;
@Column (name = "UUID", table = "TREATMENTS", nullable = false)
@Id
private Integer uuid;
@Column (name = "ALLDAYS", table = "TREATMENTS")
@Basic
private Boolean alldays;
@Column (name = "MIDAFT", table = "TREATMENTS")
@Basic
private Boolean midaft;
@Column (name = "NOON", table = "TREATMENTS")
@Basic
private Boolean noon;
@Column (name = "ASNEEDED", table = "TREATMENTS")
@Basic
private Boolean asneeded;
@Column (name = "ALLTIMES", table = "TREATMENTS")
@Basic
private Boolean alltimes;
@Column (name = "WEDNESDAY", table = "TREATMENTS")
@Basic
private Boolean wednesday;
@Column (name = "FRIDAY", table = "TREATMENTS")
@Basic
private Boolean friday;
@Column (name = "MONDAY", table = "TREATMENTS")
@Basic
private Boolean monday;
@Column (name = "OTF", table = "TREATMENTS", length = 20)
@Basic
private String otf;
@Column (name = "REMINDER", table = "TREATMENTS")
@Basic
private Boolean reminder;
@Column (name = "THURSDAY", table = "TREATMENTS")
@Basic
private Boolean thursday;
@Column (name = "AM", table = "TREATMENTS")
@Basic
private Boolean am;
@Column (name = "AFTERNOON", table = "TREATMENTS")
@Basic
private Boolean afternoon;
@Column (name = "SUNDAY", table = "TREATMENTS")
@Basic
private Boolean sunday;
@Column (name = "DOSE", table = "TREATMENTS", precision = 52)
@Basic
private Double dose;
@Column (name = "MEASURE", table = "TREATMENTS", length = 11)
@Basic
private String measure;
@Column (name = "TUESDAY", table = "TREATMENTS")
@Basic
private Boolean tuesday;
@Column (name = "MIDOFNIGHT", table = "TREATMENTS")
@Basic
private Boolean midofnight;
@Column (name = "NAME", table = "TREATMENTS", length = 40)
@Basic
private String name;
@Column (name = "LEADTIME", table = "TREATMENTS")
@Basic
private Integer leadtime;
@Column (name = "EVENING", table = "TREATMENTS")
@Basic
private Boolean evening;
@Column (name = "BEDTIME", table = "TREATMENTS")
@Basic
private Boolean bedtime;

public Treatments () {

}

public String getReason () {
  return this.reason;
}

public void setReason (String reason) {
  this.reason = reason;
}

public Boolean isSaturday () {
  return this.saturday;
}

public void setSaturday (Boolean saturday) {
  this.saturday = saturday;
}

public Boolean isMidam () {
  return this.midam;
}

public void setMidam (Boolean midam) {
  this.midam = midam;
}

public String getType () {
  return this.type;
}

public void setType (String type) {
  this.type = type;
}

public Integer getUuid () {
  return this.uuid;
}

public void setUuid (Integer uuid) {
  this.uuid = uuid;
}

public Boolean isAlldays () {
  return this.alldays;
}

public void setAlldays (Boolean alldays) {
  this.alldays = alldays;
}

public Boolean isMidaft () {
  return this.midaft;
}

public void setMidaft (Boolean midaft) {
  this.midaft = midaft;
}

public Boolean isNoon () {
  return this.noon;
}

public void setNoon (Boolean noon) {
  this.noon = noon;
}

public Boolean isAsneeded () {
  return this.asneeded;
}

public void setAsneeded (Boolean asneeded) {
  this.asneeded = asneeded;
}

public Boolean isAlltimes () {
  return this.alltimes;
}

public void setAlltimes (Boolean alltimes) {
  this.alltimes = alltimes;
}

public Boolean isWednesday () {
  return this.wednesday;
}

public void setWednesday (Boolean wednesday) {
  this.wednesday = wednesday;
}

public Boolean isFriday () {
  return this.friday;
}

public void setFriday (Boolean friday) {
  this.friday = friday;
}

public Boolean isMonday () {
  return this.monday;
}

public void setMonday (Boolean monday) {
  this.monday = monday;
}

public String getOtf () {
  return this.otf;
}

public void setOtf (String otf) {
  this.otf = otf;
}

public Boolean isReminder () {
  return this.reminder;
}

public void setReminder (Boolean reminder) {
  this.reminder = reminder;
}

public Boolean isThursday () {
  return this.thursday;
}

public void setThursday (Boolean thursday) {
  this.thursday = thursday;
}

public Boolean isAm () {
  return this.am;
}

public void setAm (Boolean am) {
  this.am = am;
}

public Boolean isAfternoon () {
  return this.afternoon;
}

public void setAfternoon (Boolean afternoon) {
  this.afternoon = afternoon;
}

public Boolean isSunday () {
  return this.sunday;
}

public void setSunday (Boolean sunday) {
  this.sunday = sunday;
}

public Double getDose () {
  return this.dose;
}

public void setDose (Double dose) {
  this.dose = dose;
}

public String getMeasure () {
  return this.measure;
}

public void setMeasure (String measure) {
  this.measure = measure;
}

public Boolean isTuesday () {
  return this.tuesday;
}

public void setTuesday (Boolean tuesday) {
  this.tuesday = tuesday;
}

public Boolean isMidofnight () {
  return this.midofnight;
}

public void setMidofnight (Boolean midofnight) {
  this.midofnight = midofnight;
}

public String getName () {
  return this.name;
}

public void setName (String name) {
  this.name = name;
}

public Integer getLeadtime () {
  return this.leadtime;
}

public void setLeadtime (Integer leadtime) {
  this.leadtime = leadtime;
}

public Boolean isEvening () {
  return this.evening;
}

public void setEvening (Boolean evening) {
  this.evening = evening;
}

public Boolean isBedtime () {
  return this.bedtime;
}

public void setBedtime (Boolean bedtime) {
  this.bedtime = bedtime;
}
}
