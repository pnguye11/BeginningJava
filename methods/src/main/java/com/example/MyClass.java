package com.example;

public class MyClass {

    public static void main(String[] args) {

        // get milk method
        // the parameter for getMilk medthod value is 2

        getMilk(2);
        getMilk(15);


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

        public static void getMilk(int nrOfCartonsToBuy) {

            int priceToPay = nrOfCartonsToBuy*2;

            System.out.println("Open door");
            System.out.println("Walk to store");
            System.out.println("Buy " +nrOfCartonsToBuy + " on the ground floor");
            System.out.println("Pay " + priceToPay + " pounds, but no more");
            System.out.println("Return home with milk galore");

    }



}
