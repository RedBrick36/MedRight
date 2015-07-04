/**
 * Project started by RedBrick on 6/30/15.
 *
 * JDK 1.8.0_45
 * Groovy 2.4.3
 *
 * @author RedBrick
 */
package org.redbrick.medright;

/** MedRight will assist in keeping track of medicinal regimens; both for keeping the medicinal schedule as
prescribed, as well as re-ordering those medications/supplements required by the regimen.

MedRight has been designed with ease-of-use and clear user interface as the top priorities. As a result, the GUI is
 limited to only displaying what is absolutely necessary for the current operation. This in no way limits its
 functionality or usefulness. On the contrary, providing a clear, easy-to-use interface reduces errors and provides a
 clean display of associated information. The underlying structure of the application maintains every aspect of the
 regimen as a whole and provides user prompts in a focused and timely fashion designed toward compliance with the
 regimen.

Within the scope of this application, a treatment is defined as:
 Medical care given by a doctor, to a patient, for an illness or injury.

Medical care can range from prescriptions for pills/liquids, to vitamin/mineral supplements, to topical
 applications (such as ointments, lotions and creams, etc.), as well as referrals to other health care providers.

MedRight assists in all cases where a prescription has been issued by the doctor. It can also be very useful to those
 who just wish to keep track of their own, particular vitamin/supplement regimen.
 */

import java.util.*;
import java.text.*;
import javax.swing.*;

public class MedRight {

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
// ----------------------------------------------------------------
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
// ----------------------------------------------------------------
// Showing what it means to be a topical treatment

// Is the treatment a topical (lotion, cream, salve, ointment, etc.)?
boolean topical;

// Track the quantity of units in each order (tubes, tubs, containers)
int numberOfUnitsInOrder;

// Track the date that the current order started being consume
String dateOfFirstDoseFromThisOrder;

// Track how many refills are remaining on the prescription
int numberOfRefillsRemaining;

// Track the size of each unit as received in the prescription order
double sizeInMilliliters;
double sizeInOunces;

// Track the amount to be used in each dose
double millilitersPerDose;
double ouncesPerDose;

//Track the number of times per day that the dosage is prescribed
int numberOfTimesPerDayTaken;

// Track the number of containers on hand at the moment
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
/*
    public static void main(String[] args) {

        System.out.println("Hello World!");

    }


}
*/



