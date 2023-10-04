import java.util.*;
public class Lesson5B_GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 7;
        boolean isCorrect = false;


        System.out.print("Guess the number. It is between 1 and 10. ");

        for (int i = 1; i <= 5; i++) {
            int answer = input.nextInt();

            if (answer != number) {
                System.out.print("Incorrect. try again. ");
                isCorrect = false;
            } else {
                System.out.println("Correct.");
                isCorrect = true;
                i = 5;
            }

        }
    }
}
