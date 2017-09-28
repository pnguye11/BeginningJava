package com.example;

import java.util.Scanner;



public class BmiCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your height in inches?");
        double yourHeight = scanner.nextDouble();
        System.out.println("What is your weight in pounds");
        double yourWeight = scanner.nextDouble();

        double BMI = calculate(yourWeight,yourHeight);
//        System.out.println(BMI);


    }


    public static double calculate(double yourWeight, double yourHeight) {

        yourWeight = (yourWeight * 703);
        yourHeight = (yourHeight * yourHeight);
        double calculate = (yourWeight / yourHeight);

        if (calculate > 25) {
            System.out.println("Your BMI score is :" + calculate + " You're too fat! Get on it!");

        } else if (calculate < 18.5) {
            System.out.println("Your BMI score is :" + calculate + " You're too skinny!");
        }else{
            System.out.println("Your BMI score is :" + calculate + " You're normal");
        }


        return calculate;
    }



}

