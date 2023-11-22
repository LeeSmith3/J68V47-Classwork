package Lesson2;

import java.util.*;
public class Lesson2Exercise1_ShortStory {
    public static void main (String[] args){
        /* Collects user input */
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is a hobby of yours i.e. programming, bowling, playing basketball? ");
        String hobby = input.nextLine();

        /* Displays short story output w/ concatenation */
        System.out.print("Today, " + name + " had a good day! They spent their day " + hobby + " and enjoyed themselves very much. \nAfter a long day of " + hobby + ", " + name + " was very tired, and decided to head to bed, feeling satisfied with their day. \n The end.");
    }

}
