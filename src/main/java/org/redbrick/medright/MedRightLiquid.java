package org.redbrick.medright;

public class MedRightLiquid

// Showing what it means to be a liquid treatment

// Is the treatment a liquid?
boolean liquid;

// Track the quantity of bottles in each order
int numberOfBottlesInOrder;

// Track the date that the current order started being consumed
String dateOfFirstDoseFromThisOrder;

// Track how many refills are remaining on the prescription
int numberOfRefillsRemaining;

// Track the size of each bottle as received in the prescription order
double sizeInMilliliters;
double sizeInOunces;

// Track the amount to be used in each dose
double millilitersPerDose;
double ouncesPerDose;

//Track the number of times per day that the dosage is prescribed
int numberOfTimesPerDayTaken;

// Track the number of bottles on hand at the moment
double quantityOnHand;

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