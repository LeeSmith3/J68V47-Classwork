
import java.util.*;
public class Lesson3Exercise1_UserAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your surname: ");
        String surname = input.next();

        System.out.print("Enter your year of birth: ");
        String yrOfBirth = input.next();

        System.out.println("Username: "+ firstName.substring(0,1).toUpperCase() + surname.toLowerCase());

        System.out.println("Password: "+ surname.substring(0,1).toLowerCase() + firstName.toUpperCase() + yrOfBirth);
    }

}
