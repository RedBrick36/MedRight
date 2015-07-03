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

/* TODO Create and refine a list of those properties that define all treatment types possible within this class.
TODO Ensure that all type definitions are clear, concise and comprehensive.
*/

/*
Name the medication, the name of the condition or illness it treats, and the treatment type:
   public string treatmentMedicationName;
   public string treatmentCondition;
   public string treatmentType
------------------------------------------------------------------

// Is the treatment a pill?
   public bool pill;

// Track the quantity of pills in each order
   public int numberOfPillsInOrder

// Track how many refills are remaining on the prescription
   public int numberOfRefillsRemaining

// Track the size of each pill as received in the prescription order
   public double sizeInMilligrams;

// Track whether pill is to be cut in half for the correct dosage
   public bool isPillCutInHalf;

// Track the amount to be used in each dose
   public double milligramsPerDose;

// Track the number of times per day that the dosage is taken
   public int numberOfTimesPerDayTaken;

// Track the number of pills on hand at the moment
   public double quantityOnHand

// Calculate nextOrderDate by using
// Instantiate a Date object
       Date date = new Date();
  and use the following string variables:

   string dateOfLastOrder;
   string dateOfLastArrival;
   string numberOfDaysToReceiveDelivery;
   string dateOfFirstDoseFromThisOrder;
   string nextOrderDate;
------------------------------------------------------------------

// Is the treatment a liquid?
   public bool liquid;

// Track the quantity of bottles in each order
   public int numberOfBottlesInOrder

// Track how many refills are remaining on the prescription
   public int numberOfRefillsRemaining

// Track the size of each bottle as received in the prescription order
   public double sizeInMilliliters;
   public double sizeInOunces;

// Track the amount to be used in each dose
   public double millilitersPerDose;
   public double ouncesPerDose;

//Track the number of times per day that the dosage is prescribed
   public int numberOfTimesPerDayTaken;

// Track the number of bottles on hand at the moment
   public double quantityOnHand

// Calculate nextOrderDate by using:
// Instantiate a Date object
       Date date = new Date();
  and use the following string variables:

   string dateOfLastOrder;
   string dateOfLastArrival;
   string numberOfDaysToReceiveDelivery;
   string dateOfFirstDoseFromThisOrder;
   string nextOrderDate;
------------------------------------------------------------------

// Is the treatment a topical (lotion, cream, salve, ointment, etc.)?
   public bool topical;

// Track the quantity of units in each order (tubes, tubs, containers)
   public int numberOfUnitsInOrder

// Track how many refills are remaining on the prescription
   public int numberOfRefillsRemaining

// Track the size of each unit as received in the prescription order
   public double sizeInMilliliters;
   public double sizeInOunces;

// Track the amount to be used in each dose
   public double millilitersPerDose;
      public double ouncesPerDose;

//Track the number of times per day that the dosage is prescribed
   public int numberOfTimesPerDayTaken;

// Track the number of containers on hand at the moment
   public double quantityOnHand

// Calculate nextOrderDate by using
// Instantiate a Date object
       Date date = new Date();
  and use the following string variables:

   string dateOfLastOrder;
   string dateOfLastArrival;
   string numberOfDaysToReceiveDelivery;
   string dateOfFirstDoseFromThisOrder;
   string nextOrderDate;
------------------------------------------------------------------
*/

// We need (because the data types differ) a Collections Framework (Map?) for the data...
// TODO Research declaring and using the Collections Framework for this application


    public static void main(String[] args) {
        /* TODO Enter code here... */

    System.out.println("Hello World!");

    }

}