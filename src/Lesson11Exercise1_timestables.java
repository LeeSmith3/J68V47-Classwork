import java.io.*;
import java.util.*;
public class Lesson11Exercise1_timestables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to be multiplied: ");
        int num = input.nextInt();

        try (PrintWriter out = new PrintWriter( new FileWriter("output.txt") ) ) {
            for (int count = 1; count <= 5; count++) {
                out.format("%d x %d = %d%n", num, count, num * count);

            }
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }

    }
}