import java.util.*;
public class Lesson3Exercise2_Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Q1. What is the capital of Spain? ");
        String capitalSpain = input.next();
        capitalSpain = capitalSpain.toLowerCase();

        System.out.println(capitalSpain.contains("madrid"));

        System.out.print("Q2. What is the capital of the UK? ");
        String capitalUK = input.next();
        capitalUK = capitalUK.toLowerCase();

        System.out.println(capitalUK.contains("london"));

        System.out.print("Q3. What is the capital of Italy? ");
        String capitalItaly = input.next();
        capitalItaly = capitalItaly.toLowerCase();

        System.out.println(capitalItaly.contains("rome"));

    }
}
