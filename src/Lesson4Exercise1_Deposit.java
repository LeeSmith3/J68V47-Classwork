import java.util.*;
public class Lesson4Exercise1_Deposit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* organize inputs */
        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your surname: ");
        String surname = input.next();

        System.out.print("Enter the total value of your order: ");
        float orderVal = input.nextFloat();

        System.out.print("Enter the amount you wish to pay as deposit: ");
        float deposit = input.nextFloat();

        /* input validation */
        if (deposit > orderVal) {
            System.out.println("Deposit amount too large. Please try again.");
            deposit = input.nextFloat();
        } else if (deposit < 0) {
            System.out.println("Deposit cannot be a negative number. Please try again");
            deposit = input.nextFloat();
        }

        /* calculate remainder */
        float remainder = orderVal - deposit;

        /* output */
        System.out.println("\n -- RECEIPT --");
        System.out.println("Customer: "+firstName.substring(0,1)+" "+surname);
        System.out.format("Order total: £%.2f", orderVal);
        System.out.format("\nDeposit paid: £%.2f", deposit);
        System.out.format("\nRemainder: £%.2f", remainder);
        System.out.println(" ");
        if (deposit > 100){
            System.out.println("You get a free toaster!");
        }

        System.out.println("Have a nice day.");

    }
}
