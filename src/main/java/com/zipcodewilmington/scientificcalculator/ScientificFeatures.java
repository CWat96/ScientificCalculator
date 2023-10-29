package com.zipcodewilmington.scientificcalculator;

public class ScientificFeatures {
    public boolean isDegrees = true; // using boolean to represent units. True for degrees and false for radians
    private FactorialFunction factorialFunction = new FactorialFunction(); // Instantiate FactorialFunctions
    public ScientificFeatures() {
    }

    public void setUnits(boolean degrees) {
        isDegrees = degrees;
    }
    public boolean isDegrees() {
        return isDegrees;
    }
    public double sine(double entry) {
        if (isDegrees) {
            return Math.sin(Math.toRadians(entry));
        } else {
            return Math.sin(entry);
        }
    }
    public double cosine(double entry) {
        if (isDegrees) {
            return Math.cos(Math.toRadians(entry));
        } else {
            return Math.cos(entry);
        }
    }
    public double tangent(double entry) {
        if (isDegrees) {
            return Math.tan(Math.toRadians(entry));
        } else {
            return Math.tan(entry);
        }
    }
    public void switchUnitsMode() {
        isDegrees = !isDegrees;
    }
}




    // switchDisplayMode()

    // switchDisplayMode(String mode)

    // Memory
    // M+ key
    // MC key (reset memory)
    //MRC key (recall the current value from memory to the display

    //Trig Functions
    // Sine
        // sine()
    // Cosine
        // cosine()
    // Tangent
        // tangent()
    // Inverse Sine
        // inverseSine()
    // Inverse Cosine
        // inverseCosine()
    // Inverse Tangent
        // inverseTangent()

    //SWITCH TRIG UNITS MODE (degrees, Radians) ..String?
    // * switchUnitsMode()
//    public void switchUnitsMode() {
//        if (units.equal("degrees")) {
//            units = "radians";
//        }
//        else {
//            units = "degrees";
//        }
//    }// if else statement because you're saying if not this, else that.

    // * switchUnitsMode(String mode)
    // public void switchUnitsMode(String)


    // Logarithmic functions
    // Log
    // 10x (inverse logarithm
    // Ln (natural logarithm
    // ex (inverse natural logarithm

    // Factorial functions

    // Custom Features
    // ** On and Off

