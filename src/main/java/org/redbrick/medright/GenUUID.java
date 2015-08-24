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
 * This class is created to provide a systematic way of assigning a
 * unique
 * identifier for each schedule entered. Since using the Name variable
 * in the
 * Schedule objects could become unwieldy -- especially with medicinal
 * names --
 * a unique integer identifier is a better choice. The unique
 * identifier is
 * tied to the type of schedule (pill, liquid, topical or fitness)
 * that the user
 * desires to create. The arrays hold values consistent with the type
 * of schedule
 * being entered; with each being assigned a specific block of
 * integers.
 *
 */
public class GenUUID {

    private int i = 300;
    private final int iO = 0;
    private final int[] injectionCounter;
    private int l = 100;
    private int lO = 0;
    private final int[] liquidCounter;
    private int p = 0;
    private int pO = 0;
    private final int[] pillCounter;
    private int pltf;
    private int s = 400;
    private int sO = 0;
    private final int[] supplementsCounter;
    private int t = 200;
    private int tO = 0;
    private final int[] topicalCounter;
    private String type;
    private int uuid;

    GenUUID () {

        this.pillCounter = new int[30];
        this.liquidCounter = new int[15];
        this.topicalCounter = new int[10];
        this.injectionCounter = new int[6];
        this.supplementsCounter = new int[20];

        for ( int o = 0; o <= 29; o++ ) {
            this.pillCounter[o] = this.p;
            this.p++;
        }
        for ( int o = 0; o <= 14; o++ ) {
            this.liquidCounter[o] = this.l;
            this.l++;
        }
        for ( int o = 0; o <= 9; o++ ) {
            this.topicalCounter[o] = this.t;
            this.t++;
        }
        for ( int o = 0; o <= 5; o++ ) {
            this.injectionCounter[o] = this.i;
            this.i++;
        }
        for ( int o = 0; o <= 19; o++ ) {
            this.supplementsCounter[o] = this.s;
            this.s++;
        }

    }

    public int genUuid () {

        if ( null != this.type ) {
            switch ( this.type ) {
                case "Pill":
                    this.pltf = this.pO;
                    break;
                case "Liquid":
                    this.pltf = this.lO;
                    break;
                case "Topical":
                    this.pltf = this.tO;
                    break;
                case "Injection":
                    this.pltf = this.iO;
                    break;
                case "Supplement":
                    this.pltf = this.sO;
                    break;
            }
        }

        switch ( this.type ) {
            case "Pill":
                this.uuid = this.pillCounter[this.pltf];
                this.pO++;
                break;
            case "Liquid":
                this.uuid = this.liquidCounter[this.pltf];
                this.lO++;
                break;
            case "Topical":
                this.uuid = this.topicalCounter[this.pltf];
                this.tO++;
                break;
            case "Supplement":
                this.uuid = this.supplementsCounter[this.pltf];
                this.sO++;
                break;
        }
        return this.uuid;
    }

    // Setter and Getter for type field
    public String getType () {
        return this.type;
    }

    public void setType (String type) {
        this.type = type;
    }
}
