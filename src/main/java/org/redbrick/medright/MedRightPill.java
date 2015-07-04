package org.redbrick.medright;

public class MedRightPill

// Showing what it means to be a pill treatment

// Name the medication, the name of the condition or illness it treats, and the treatment type:
String treatmentMedicationName;
String treatmentCondition;
String treatmentType;

// Is the treatment a pill?
boolean pill;

// Track the quantity of pills in each order
int numberOfPillsInOrder;

// Track the date that the current order started being consumed
String dateOfFirstDoseFromThisOrder;

// Track how many refills are remaining on the prescription
int numberOfRefillsRemaining;

// Track the size of each pill as received in the prescription order
double sizeInMilligrams;

// Track whether pill is to be cut in half for the correct dosage
boolean isPillCutInHalf;

// Track the amount to be used in each dose
double milligramsPerDose;

// Track the number of times per day that the dosage is taken
int numberOfTimesPerDayTaken;

// Track the number of pills on hand at the moment
double quantityOnHand;

// Track how long it takes between order and delivery
String dateOfLastOrder;
String dateOfLastArrival;
String numberOfDaysToReceiveDelivery;

// Store next order date
String nextOrderDate;
/*
Methods //TODO
   Calculate totalNumberOfDosagesAvailable;
   Calculate numberOfDaysTillAllDosagesConsumed;
   Calculate avgNumberOfDaysBetweenOrderAndDelivery;
   Calculate nextOrderDate;
   Create calendarReminders;
   Prompt for displayNotificatons;
   Pull and Store medication info from reliable source and make available in GUI
*/