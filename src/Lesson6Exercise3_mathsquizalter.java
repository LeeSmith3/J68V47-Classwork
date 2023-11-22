import java.util.Random;
import java.util.Scanner;

public class Lesson6Exercise3_mathsquizalter {
    public static void main(String[] args) {
        int valueA;
        int valueB;
        int sum;
        int score = 0;
        int lives = 3;

        Random random = new Random();

        Scanner input = new Scanner(System.in);

        for (int count = 1; count <= 10; count++) {
            valueA = random.nextInt(1, 10);
            valueB = random.nextInt(1, 10);
            sum = valueA + valueB;
            System.out.print("What is " + valueA + " + " + valueB + "? ");
            int answer = input.nextInt();

            if (answer == sum) {
                System.out.println("Correct.");
                score = score + 1;
            } else {
                if (lives > 1) {
                    System.out.println("Wrong.");
                    lives--;
                    System.out.println("You have "+lives+" lives left.");
                } else if (lives == 1) {
                    System.out.println("Incorrect. You have run out of lives.");
                    count = 10;
                }
            }
        }

        System.out.println("You got " + score + " out of 10!");
    }

}
