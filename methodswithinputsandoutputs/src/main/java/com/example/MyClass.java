package com.example;

public class MyClass {

    public static void main(String[] args) {

        // get milk method
        // the parameter for getMilk medthod value is 2
        // "change" is variable and we are storing it in the method getMilk
        int change = getMilk(2,40);
        System.out.println("Hello Master, your change is " + change + " pounds");




    }

//    public static void getMilk() {
//        System.out.println("Open door");
//        System.out.println("Walk to store");
//        System.out.println("Buy milk on the ground floor");
//        System.out.println("Return home with milk galore");
//
//    }

    // new get milk methods has a require input or parameter

    // nrOfCartonsToBuy is a placeholder for the getMilk(nrOfCartonsToBuy) for the method, replace it with integer
    // nrOfCartonsToBuy is also the parameter

//    public static void getMilk(int nrOfCartonsToBuy) {
//
//        int priceToPay = nrOfCartonsToBuy*2;
//
//        System.out.println("Open door");
//        System.out.println("Walk to store");
//        System.out.println("Buy " +nrOfCartonsToBuy + " on the ground floor");
//        System.out.println("Pay " + priceToPay + " pounds, but no more");
//        System.out.println("Return home with milk galore");
//
//    }


    // method with no output use "void" in front of the method
    // when want to have output use "int for integer, string for string, and double for decimal" in front of the method

    public static int getMilk(int nrOfCartonsToBuy, int startingAmount) {

        int priceToPay = nrOfCartonsToBuy*2;

        System.out.println("Open door");
        System.out.println("Walk to store");
        System.out.println("Buy " +nrOfCartonsToBuy + " on the ground floor");
        System.out.println("Pay " + priceToPay + " pounds, but no more");
        System.out.println("Return home with milk galore");

        // any method that has a return needs a return statement
        // any keyword return is the output of that method

        return startingAmount - priceToPay;

    }



}
