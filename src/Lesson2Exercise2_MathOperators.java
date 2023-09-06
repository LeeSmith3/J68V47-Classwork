import java.util.*;
public class Lesson2Exercise2_MathOperators {
    public static void main(String[] args) {
        int num1;
        int num2;
        int answer;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number. ");
        num1 = input.nextInt();

        System.out.print("Enter another number. ");
        num2 = input.nextInt();

        answer = num1 + num2;
        System.out.print("When added together, the two numbers make " + answer + "\n");
        answer = num1 - num2;
        System.out.print("When the second number is taken away from the first number, we end up with " + answer + "\n");
    }

}
