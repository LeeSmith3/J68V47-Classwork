package Lesson7;

import java.util.Scanner;
public class Lesson7Exercise2_SumFunction {

    public static int valueA(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int valueA = input.nextInt();
        return valueA;
    }
    public static int valueB(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int valueB = input.nextInt();
        return valueB;
    }
    public static int Sum;
    public static void printAnswer(){
        System.out.print("The sum of "+valueA() +" and "+valueB() +" is "+calculateSum());
    }

    public static int calculateSum(){
        int valueA = valueA();
        int valueB = valueB();
        int calculateSum = valueA + valueB;
        return calculateSum;
    }
    public static void main(String[] args) {
        printAnswer();
    }
}
