package com.example;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("hello world");


        double myCash;


        myCash = 100;

        int monthlySalary = 20;

        // constant are things that does not change (final infront), only can be assign a value once.
        // can not add a string to a double (data type)
        // when using constant use all caps and separate them with underscores
        // always use constant to give floating number a descriptive name

        final double UK_VAT_RATE = 0.20;

        String mainCourse = "fish";
        String side = "chips";

        System.out.println("My favorite food is: " + mainCourse + "" + side);
        System.out.println("Initial funds are: " + myCash);

        myCash = 150;

        System.out.println("Now I've got " + myCash);
        System.out.println("Payday. Got " + (myCash + monthlySalary));



        /// excercise 2

        double COST_OF_FISH = 5.6;
        double COST_OF_CHIPS = 2.65;

        double whatsLeft = myCash - (COST_OF_CHIPS + COST_OF_FISH)*(1+UK_VAT_RATE);

        // changing whatsleft to myCash and making myCash as constant changing int myCash to double myCash

         myCash = myCash - (COST_OF_CHIPS + COST_OF_FISH)*(1+UK_VAT_RATE);

        System.out.println("Had a pub lunch. Funds depleted to " + whatsLeft);

        System.out.println("Had a pub lunch. Funds depleted to " + myCash);
    }
}

