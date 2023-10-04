import java.util.*;
public class Lesson6Exercise2_userMenu {
    public static void main(String[] args) {

        boolean isQuitting = false;

        Scanner input = new Scanner(System.in);

        while(!isQuitting){

            System.out.println("Please select one of the following options:\n1. Say 'hello'\n2. Tell a joke\n3. Quit.");
            var userInput = input.nextLine();

            if(userInput.equals("3")){
                isQuitting = true;
                System.out.println("Goodbye.");
            }
        }



    }
}
