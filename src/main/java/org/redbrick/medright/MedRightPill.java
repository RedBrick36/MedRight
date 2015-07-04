package org.redbrick.medright;

/**
 * Created by RedBrick on 7/4/15.
 */
public class MedRightPill {

    // Name the medication, the name of the condition or illness it treats, and the treatment type:
    String treatmentMedicationName;
    String treatmentCondition;
    String treatmentType;

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

    // Methods TODO
    public void totalNumberOfDosagesAvailable(){

        Calculate totalNumberOfDosagesAvailable;
    }
    public void numberOfDaysTillAllDosagesConsumed(){

        Calculate numberOfDaysTillAllDosagesConsumed;
    }
    public void avgNumberOfDaysBetweenOrderAndDelivery(){

        Calculate avgNumberOfDaysBetweenOrderAndDelivery;
    }
    public void nextOrderDate(){

        Calculate nextOrderDate;
    }
    public void calendarRemeinders(){

        Create calendarReminders;
    }
    public void displayNotifications(){

        Prompt for displayNotificatons;
    }
    public void PullAndStoreMedicationInfoFromReliableSourceAndMakeAvailableInGUI(){

    }

}
