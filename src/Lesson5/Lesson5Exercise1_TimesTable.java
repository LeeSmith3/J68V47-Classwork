package Lesson5;

import java.util.Scanner;
public class Lesson5Exercise1_TimesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        int num = input.nextInt();

        for( int count=1; count<=12; count++ )
        {
            System.out.println(num+" multiplied by " +count+ " is equal to "+ num * count);
        }
    }
}
