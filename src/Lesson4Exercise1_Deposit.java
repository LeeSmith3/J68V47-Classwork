import java.util.*;
public class Lesson4Exercise1_Deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your surname: ");
        String surname = input.next();

        System.out.println("Enter the total value of your order: ");
        float orderVal = input.nextFloat();

        System.out.println("Enter the amount you wish to pay as deposit: ");
        float deposit = input.nextFloat();

        if (deposit > orderVal) {
            System.out.println("Deposit amount too large. Please try again.");
            deposit = input.nextFloat();
        } else if (deposit < 0) {
            System.out.println("Deposit cannot be a negative number. Please try again");
            deposit = input.nextFloat();
        }



    }
}
