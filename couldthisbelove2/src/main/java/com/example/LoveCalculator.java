package com.example;

import java.util.Random;

public class LoveCalculator {
    public static void main(String[] args) {

//        int loveScore = ifYouHadMyLove("Mr X." + "Miss Y");

//        System.out.println("Your love score is: " + loveScore);




        //nesting a method

        System.out.println("Your love score is: " + ifYouHadMyLove("Rick", "Crystal"));

    }

    public static int ifYouHadMyLove(String yourName, String theirName) {

        Random randonObject = new Random();

        int loveScore = randonObject.nextInt(101);

        if (loveScore > 80) {
            System.out.println(yourName + " and " + theirName + " love love each other like fat kid loves cake");
        } else if (loveScore > 40){
            System.out.println(yourName + " and " + theirName + ", you go together like milk and cookies");
        } else {
            System.out.println("Maybe next time brah");
        }



        return loveScore;

    }


}
