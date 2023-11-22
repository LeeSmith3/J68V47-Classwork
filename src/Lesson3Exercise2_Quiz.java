import java.util.*;
public class Lesson3Exercise2_Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Q1. What is the capital of Spain? ");
        String capitalSpain = input.next();
        capitalSpain = capitalSpain.toLowerCase();

        if (!capitalSpain.equals("madrid")){
            System.out.println("Sorry, the correct answer is Madrid.");
        }


        System.out.println(capitalSpain.contains("madrid"));

        System.out.print("Q2. What is the capital of the UK? ");
        String capitalUK = input.next();
        capitalUK = capitalUK.toLowerCase();

        if (!capitalUK.equals("london")){
            System.out.println("Sorry, the correct answer is London.");
        }

        System.out.println(capitalUK.contains("london"));

        System.out.print("Q3. What is the capital of Italy? ");
        String capitalItaly = input.next();
        capitalItaly = capitalItaly.toLowerCase();

        if (!capitalItaly.equals("rome")){
            System.out.println("Sorry, the correct answer is Rome.");
        }

        System.out.println(capitalItaly.contains("rome"));

    }
}
