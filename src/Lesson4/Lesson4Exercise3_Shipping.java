package Lesson4;

import java.util.*;
public class Lesson4Exercise3_Shipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your total purchase amount: £");
        Float purchaseAmount = input.nextFloat();

        if (purchaseAmount < 50) {
            System.out.print("Shipping cost is = £10.00");
            System.out.format("\nYour final total is = £%.2f", purchaseAmount + 10);
        } else {
            System.out.format("\nYour final total is = £%.2f", purchaseAmount);
        }


    }
}
