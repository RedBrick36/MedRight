/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author RedBrick
 */
@Entity
@Table (name = "TREATMENTS", catalog = "", schema = "APP")
@NamedQueries ({@NamedQuery (name = "Treatments.findAll", query = "SELECT t FROM Treatments t"),
  @NamedQuery (name = "Treatments.findByUuid", query = "SELECT t FROM Treatments t WHERE t.uuid = :uuid"),
  @NamedQuery (name = "Treatments.findByType", query = "SELECT t FROM Treatments t WHERE t.type = :type"),
  @NamedQuery (name = "Treatments.findByName", query = "SELECT t FROM Treatments t WHERE t.name = :name"),
  @NamedQuery (name = "Treatments.findByCondition", query = "SELECT t FROM Treatments t WHERE t.condition = :condition"),
  @NamedQuery (name = "Treatments.findByDose", query = "SELECT t FROM Treatments t WHERE t.dose = :dose"),
  @NamedQuery (name = "Treatments.findByMeasure", query = "SELECT t FROM Treatments t WHERE t.measure = :measure"),
  @NamedQuery (name = "Treatments.findByReminder", query = "SELECT t FROM Treatments t WHERE t.reminder = :reminder"),
  @NamedQuery (name = "Treatments.findByMonday", query = "SELECT t FROM Treatments t WHERE t.monday = :monday"),
  @NamedQuery (name = "Treatments.findByTuesday", query = "SELECT t FROM Treatments t WHERE t.tuesday = :tuesday"),
  @NamedQuery (name = "Treatments.findByWednesday", query = "SELECT t FROM Treatments t WHERE t.wednesday = :wednesday"),
  @NamedQuery (name = "Treatments.findByThursday", query = "SELECT t FROM Treatments t WHERE t.thursday = :thursday"),
  @NamedQuery (name = "Treatments.findByFriday", query = "SELECT t FROM Treatments t WHERE t.friday = :friday"),
  @NamedQuery (name = "Treatments.findBySaturday", query = "SELECT t FROM Treatments t WHERE t.saturday = :saturday"),
  @NamedQuery (name = "Treatments.findBySunday", query = "SELECT t FROM Treatments t WHERE t.sunday = :sunday"),
  @NamedQuery (name = "Treatments.findByAm", query = "SELECT t FROM Treatments t WHERE t.am = :am"),
  @NamedQuery (name = "Treatments.findByMidam", query = "SELECT t FROM Treatments t WHERE t.midam = :midam"),
  @NamedQuery (name = "Treatments.findByNoon", query = "SELECT t FROM Treatments t WHERE t.noon = :noon"),
  @NamedQuery (name = "Treatments.findByMidaft", query = "SELECT t FROM Treatments t WHERE t.midaft = :midaft"),
  @NamedQuery (name = "Treatments.findByAfternoon", query = "SELECT t FROM Treatments t WHERE t.afternoon = :afternoon"),
  @NamedQuery (name = "Treatments.findByEvening", query = "SELECT t FROM Treatments t WHERE t.evening = :evening"),
  @NamedQuery (name = "Treatments.findByBedtime", query = "SELECT t FROM Treatments t WHERE t.bedtime = :bedtime"),
  @NamedQuery (name = "Treatments.findByMidofnight", query = "SELECT t FROM Treatments t WHERE t.midofnight = :midofnight"),
  @NamedQuery (name = "Treatments.findByAlldays", query = "SELECT t FROM Treatments t WHERE t.alldays = :alldays"),
  @NamedQuery (name = "Treatments.findByAlltimes", query = "SELECT t FROM Treatments t WHERE t.alltimes = :alltimes"),
  @NamedQuery (name = "Treatments.findByAsneeded", query = "SELECT t FROM Treatments t WHERE t.asneeded = :asneeded"),
  @NamedQuery (name = "Treatments.findByLeadtime", query = "SELECT t FROM Treatments t WHERE t.leadtime = :leadtime"),
  @NamedQuery (name = "Treatments.findByOtf", query = "SELECT t FROM Treatments t WHERE t.otf = :otf")})
public class Treatments implements Serializable {

@Transient
private PropertyChangeSupport changeSupport = new PropertyChangeSupport (this);
private static final long serialVersionUID = 1L;
@Id
@Basic (optional = false)
@Column (name = "UUID", nullable = false)
private Integer uuid;
@Column (name = "TYPE", length = 10)
private String type;
@Column (name = "NAME", length = 40)
private String name;
@Column (name = "CONDITION", length = 45)
private String condition;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
// consider using these annotations to enforce field validation
@Column (name = "DOSE", precision = 52)
private Double dose;
@Column (name = "MEASURE", length = 11)
private String measure;
@Column (name = "REMINDER")
private Boolean reminder;
@Column (name = "MONDAY")
private Boolean monday;
@Column (name = "TUESDAY")
private Boolean tuesday;
@Column (name = "WEDNESDAY")
private Boolean wednesday;
@Column (name = "THURSDAY")
private Boolean thursday;
@Column (name = "FRIDAY")
private Boolean friday;
@Column (name = "SATURDAY")
private Boolean saturday;
@Column (name = "SUNDAY")
private Boolean sunday;
@Column (name = "AM")
private Boolean am;
@Column (name = "MIDAM")
private Boolean midam;
@Column (name = "NOON")
private Boolean noon;
@Column (name = "MIDAFT")
private Boolean midaft;
@Column (name = "AFTERNOON")
private Boolean afternoon;
@Column (name = "EVENING")
private Boolean evening;
@Column (name = "BEDTIME")
private Boolean bedtime;
@Column (name = "MIDOFNIGHT")
private Boolean midofnight;
@Column (name = "ALLDAYS")
private Boolean alldays;
@Column (name = "ALLTIMES")
private Boolean alltimes;
@Column (name = "ASNEEDED")
private Boolean asneeded;
@Column (name = "LEADTIME")
private Integer leadtime;
@Column (name = "OTF", length = 20)
private String otf;

public Treatments () {
}

public Treatments (Integer uuid) {
  this.uuid = uuid;
}

public Integer getUuid () {
  return uuid;
}

public void setUuid (Integer uuid) {
  Integer oldUuid = this.uuid;
  this.uuid = uuid;
  changeSupport.firePropertyChange ("uuid", oldUuid, uuid);
}

public String getType () {
  return type;
}

public void setType (String type) {
  String oldType = this.type;
  this.type = type;
  changeSupport.firePropertyChange ("type", oldType, type);
}

public String getName () {
  return name;
}

public void setName (String name) {
  String oldName = this.name;
  this.name = name;
  changeSupport.firePropertyChange ("name", oldName, name);
}

public String getCondition () {
  return condition;
}

public void setCondition (String condition) {
  String oldCondition = this.condition;
  this.condition = condition;
  changeSupport.firePropertyChange ("condition", oldCondition, condition);
}

public Double getDose () {
  return dose;
}

public void setDose (Double dose) {
  Double oldDose = this.dose;
  this.dose = dose;
  changeSupport.firePropertyChange ("dose", oldDose, dose);
}

public String getMeasure () {
  return measure;
}

public void setMeasure (String measure) {
  String oldMeasure = this.measure;
  this.measure = measure;
  changeSupport.firePropertyChange ("measure", oldMeasure, measure);
}

public Boolean getReminder () {
  return reminder;
}

public void setReminder (Boolean reminder) {
  Boolean oldReminder = this.reminder;
  this.reminder = reminder;
  changeSupport.firePropertyChange ("reminder", oldReminder, reminder);
}

public Boolean getMonday () {
  return monday;
}

public void setMonday (Boolean monday) {
  Boolean oldMonday = this.monday;
  this.monday = monday;
  changeSupport.firePropertyChange ("monday", oldMonday, monday);
}

public Boolean getTuesday () {
  return tuesday;
}

public void setTuesday (Boolean tuesday) {
  Boolean oldTuesday = this.tuesday;
  this.tuesday = tuesday;
  changeSupport.firePropertyChange ("tuesday", oldTuesday, tuesday);
}

public Boolean getWednesday () {
  return wednesday;
}

public void setWednesday (Boolean wednesday) {
  Boolean oldWednesday = this.wednesday;
  this.wednesday = wednesday;
  changeSupport.firePropertyChange ("wednesday", oldWednesday, wednesday);
}

public Boolean getThursday () {
  return thursday;
}

public void setThursday (Boolean thursday) {
  Boolean oldThursday = this.thursday;
  this.thursday = thursday;
  changeSupport.firePropertyChange ("thursday", oldThursday, thursday);
}

public Boolean getFriday () {
  return friday;
}

public void setFriday (Boolean friday) {
  Boolean oldFriday = this.friday;
  this.friday = friday;
  changeSupport.firePropertyChange ("friday", oldFriday, friday);
}

public Boolean getSaturday () {
  return saturday;
}

public void setSaturday (Boolean saturday) {
  Boolean oldSaturday = this.saturday;
  this.saturday = saturday;
  changeSupport.firePropertyChange ("saturday", oldSaturday, saturday);
}

public Boolean getSunday () {
  return sunday;
}

public void setSunday (Boolean sunday) {
  Boolean oldSunday = this.sunday;
  this.sunday = sunday;
  changeSupport.firePropertyChange ("sunday", oldSunday, sunday);
}

public Boolean getAm () {
  return am;
}

public void setAm (Boolean am) {
  Boolean oldAm = this.am;
  this.am = am;
  changeSupport.firePropertyChange ("am", oldAm, am);
}

public Boolean getMidam () {
  return midam;
}

public void setMidam (Boolean midam) {
  Boolean oldMidam = this.midam;
  this.midam = midam;
  changeSupport.firePropertyChange ("midam", oldMidam, midam);
}

public Boolean getNoon () {
  return noon;
}

public void setNoon (Boolean noon) {
  Boolean oldNoon = this.noon;
  this.noon = noon;
  changeSupport.firePropertyChange ("noon", oldNoon, noon);
}

public Boolean getMidaft () {
  return midaft;
}

public void setMidaft (Boolean midaft) {
  Boolean oldMidaft = this.midaft;
  this.midaft = midaft;
  changeSupport.firePropertyChange ("midaft", oldMidaft, midaft);
}

public Boolean getAfternoon () {
  return afternoon;
}

public void setAfternoon (Boolean afternoon) {
  Boolean oldAfternoon = this.afternoon;
  this.afternoon = afternoon;
  changeSupport.firePropertyChange ("afternoon", oldAfternoon, afternoon);
}

public Boolean getEvening () {
  return evening;
}

public void setEvening (Boolean evening) {
  Boolean oldEvening = this.evening;
  this.evening = evening;
  changeSupport.firePropertyChange ("evening", oldEvening, evening);
}

public Boolean getBedtime () {
  return bedtime;
}

public void setBedtime (Boolean bedtime) {
  Boolean oldBedtime = this.bedtime;
  this.bedtime = bedtime;
  changeSupport.firePropertyChange ("bedtime", oldBedtime, bedtime);
}

public Boolean getMidofnight () {
  return midofnight;
}

public void setMidofnight (Boolean midofnight) {
  Boolean oldMidofnight = this.midofnight;
  this.midofnight = midofnight;
  changeSupport.firePropertyChange ("midofnight", oldMidofnight, midofnight);
}

public Boolean getAlldays () {
  return alldays;
}

public void setAlldays (Boolean alldays) {
  Boolean oldAlldays = this.alldays;
  this.alldays = alldays;
  changeSupport.firePropertyChange ("alldays", oldAlldays, alldays);
}

public Boolean getAlltimes () {
  return alltimes;
}

public void setAlltimes (Boolean alltimes) {
  Boolean oldAlltimes = this.alltimes;
  this.alltimes = alltimes;
  changeSupport.firePropertyChange ("alltimes", oldAlltimes, alltimes);
}

public Boolean getAsneeded () {
  return asneeded;
}

public void setAsneeded (Boolean asneeded) {
  Boolean oldAsneeded = this.asneeded;
  this.asneeded = asneeded;
  changeSupport.firePropertyChange ("asneeded", oldAsneeded, asneeded);
}

public Integer getLeadtime () {
  return leadtime;
}

public void setLeadtime (Integer leadtime) {
  Integer oldLeadtime = this.leadtime;
  this.leadtime = leadtime;
  changeSupport.firePropertyChange ("leadtime", oldLeadtime, leadtime);
}

public String getOtf () {
  return otf;
}

public void setOtf (String otf) {
  String oldOtf = this.otf;
  this.otf = otf;
  changeSupport.firePropertyChange ("otf", oldOtf, otf);
}

@Override
public int hashCode () {
  int hash = 0;
  hash += ( uuid != null ? uuid.hashCode () : 0 );
  return hash;
}

@Override
public boolean equals (Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
  // not set
  if ( !( object instanceof Treatments ) ) {
    return false;
  }
  Treatments other = (Treatments) object;
  if ( ( this.uuid == null && other.uuid != null ) || ( this.uuid != null && !this.uuid.equals (other.uuid) ) ) {
    return false;
  }
  return true;
}

@Override
public String toString () {
  return "org.redbrick.medright.Treatments[ uuid=" + uuid + " ]";
}

public void addPropertyChangeListener (PropertyChangeListener listener) {
  changeSupport.addPropertyChangeListener (listener);
}

public void removePropertyChangeListener (PropertyChangeListener listener) {
  changeSupport.removePropertyChangeListener (listener);
}
}
