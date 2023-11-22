package Lesson2;

import java.util.*;
public class Lesson2Exercise2_MathOperators {
    public static void main(String[] args) {
        /* Declares variables*/
        int num1;
        int num2;
        int answer;

        /* Gets user input */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number. ");
        num1 = input.nextInt();

        System.out.print("Enter another number. ");
        num2 = input.nextInt();

        /* Calculates and displays answers */
        answer = num1 + num2;
        System.out.print("When added together, the two numbers make " + answer + "\n");
        answer = num1 - num2;
        System.out.print("When the second number is taken away from the first number, we end up with " + answer + "\n");
        answer = num1 * num2;
        System.out.print("When the numbers are multiplied with each other, we get " + answer + "\n");
        answer = num1 / num2;
        System.out.print("When divided, we end up with " + answer + "\n");
    }

}
