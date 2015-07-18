/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

/**
 *
 * @author RedBrick
 * 
 * This class is created to provide a systematic way of assigning a unique
 * identifier for each schedule entered. Since using the Name variable in the 
 * Schedule objects could become unwieldy -- especially with medicinal names --
 * a unique integer identifier is a better choice. The unique identifier is
 * tied to the type of schedule (pill, liquid, topical or fitness) that the user
 * desires to create. The arrays hold values consistent with the type of schedule
 * being entered; with each being assigned a specific block of integers.
 * 
 */

class GenUUID {

    /* 
    Declare arrays for keeping track of how many of each type has been entered
    and assigning a uuid based upon the offset within that array
    */    
    private final int[] pillCounter;
    private final int[] liquidCounter;
    private final int[] topicalCounter;
    private final int[] fitnessCounter;
    
    // Declare variables for indexing the elements of the arrays   
    private int pO = 0;
    private int lO = 0;
    private int tO = 0;
    private int fO = 0;
    
    // Declare variables for assigning values to array elements by type
    private int p = 0;
    private int l = 100;
    private int t = 200;
    private int f = 300;
    
    // Declare variable for returning a unique uuid
    private int uuid;
    /* 
    Declare variable to be used for switching to appropriate array based 
    upon the value set in the method call.
    */
    private String type;
    /* 
    Declare pointer variable; which will point to the appropriate array 
    based on the value of the type variable above.
    */
    private int pltf;
    /*
    Constructor
    */
    public GenUUID () {
     
    /* 
    Declare an array for each schedule object type selectable in the GUI 
    Pill array elements will be assigned values 0 - 29
    Liquid array elements will be assigned values 100 - 114
    Topical array elements will be assigned values 200 - 209
    Fitness array elements will be assigned values 300 - 319
            
    The size of the array limits how many entries of each type the user can enter
    The numbers chosen here should be plenty large enough for any one person.
    */
        this.pillCounter = new int[30];
        this.liquidCounter = new int[15];
        this.topicalCounter = new int[10];
        this.fitnessCounter = new int[20];
      
    /*
    Initialize each array with a specific sequence of digits based upon their type
    int o is used to control the iterations and the value variables (p,l,t,f) are
    defined as starting at a specified numerical range to assist in sorting
    at a later point.
    */  
        
        for (int o = 0; o <= 29; o++) {
            this.pillCounter[o] = p;
            p++;
        }
        for (int o = 0; o <= 14; o++) {           
            this.liquidCounter[o] = l;
            l++;
        }
        for (int o = 0; o <= 9; o++) {
            this.topicalCounter[o] = t;
            t++;
        }
         for (int o = 0; o <= 19; o++){
            this.fitnessCounter[o] = f;
            f++;
        }

    }
    /* 
    The goal of this next section is two-fold:
    1.  Start by setting the pointer to the appropriate array
    */
     public int genUuid() {
         
        if ("Pill".equals(type)) {
            pltf = pO;
            }
        else if ("Liquid".equals(type)) {
            pltf = lO;
            }
        else if ("Topical".equals(type)) {
            pltf = tO; 
            }
        else if ("Fitness".equals(type)) {
            pltf = fO;
            }
    /* 
    2. Assign uuid the value within the array that is at the current 
    index/offset for that particular array. Each time a new schedule object 
    is instantiated, it will pull its uuid from this object. The indexer
    (pO,lO,tO,fO) is incremented as a part of the process, so that the 
    next time the same type is passed in for a uuid, it will pull the value from 
    the next element in its associated array.
    */ 
        if (type.equals("Pill")) {
            uuid = this.pillCounter[pltf];
            pO++;
        }
        else if (type.equals("Liquid")) {
            uuid = this.liquidCounter[pltf];
            lO++;
        }
        else if (type.equals("Topical")) {
            uuid = this.topicalCounter[pltf];
            tO++;
        }
        else if (type.equals("Fitness")){
            uuid = this.fitnessCounter[pltf];
            fO++;
        }       
        return uuid;
     }
// Setter and Getter for type field
     
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}