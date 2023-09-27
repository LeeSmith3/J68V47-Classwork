import java.util.*;
public class Lesson5Exercise3_MathQuiz {
    public static void main(String[] args) {
        int valueA;
        int valueB;
        int sum;
        int score = 0;

        Random random = new Random();

        Scanner input = new Scanner(System.in);

        for( int count=1; count<=10; count++ )
        {
            valueA = random.nextInt(1, 10);
            valueB = random.nextInt(1, 10);
            sum = valueA + valueB;
            System.out.print("What is " + valueA + " + " + valueB + "? ");
            int answer = input.nextInt();

            if (answer == sum) {
                System.out.println("Correct.");
                score = score + 1;
            } else {
                System.out.println("Wrong.");
            }
        }

        System.out.println("You got "+score+" out of 10!");

    }
}
