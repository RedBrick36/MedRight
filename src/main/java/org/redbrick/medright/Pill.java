package org.redbrick.medright;

/**
 * Created by RedBrick on 7/4/15.
 */
// As used in MedRight, Pill covers both tablets and capsules

/* As an object of this class is instantiated it will have the listed variables available.
Almost all of these variables will be initialized through a GUI; the remainder by calling the methods outlined within
 the object
*/

public class Pill {

    // Name the medication, and the name of the condition or illness it treats:
    String treatmentMedicationName;
    String treatmentCondition;

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

    // Track whether person wants pop-up reminders
    boolean reminders;

    // Track whether of not calendar events should be created
    boolean calendarEvents;

    // Methods TODO
//    public void totalNumberOfDosagesAvailable(){
//
//        Calculate totalNumberOfDosagesAvailable;
//    }
//    public void numberOfDaysTillAllDosagesConsumed(){
//
//        Calculate numberOfDaysTillAllDosagesConsumed;
//    }
//    public void avgNumberOfDaysBetweenOrderAndDelivery(){
//
//        Calculate avgNumberOfDaysBetweenOrderAndDelivery;
//    }
//    public void nextOrderDate(){
//
//        Calculate nextOrderDate;
//    }
//    public void calendarReminders(){
//
//        Create calendarReminders;
//    }
//    public void displayNotifications(){
//
//        create displayNotificatons;
//    }
//    public void PullAndStoreMedicationInfoFromReliableSourceAndMakeAvailableInGUI(){

        //TODO Decide on method and sources for inclusion here...
    }

