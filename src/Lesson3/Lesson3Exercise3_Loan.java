package Lesson3;

import java.util.*;
public class Lesson3Exercise3_Loan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount: £");
        int loan = input.nextInt();

        System.out.println("Interest Rate (APR %): ");
        int interest = input.nextInt();

        System.out.println("Number of years: ");
        int years = input.nextInt();

        double j = ((double)interest / 100) / 12;
        double n = years * 12;
        double Monthly = loan * (j / (1 - Math.pow((1+ j),-n)));

        System.out.format("Monthly payment for this loan: £%.2f", Monthly);


    }
}
