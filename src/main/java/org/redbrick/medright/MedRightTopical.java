package org.redbrick.medright;

/**
 * Created by RedBrick on 7/4/15.
 */
public class MedRightTopical {

// What it means to be a topical treatment

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
