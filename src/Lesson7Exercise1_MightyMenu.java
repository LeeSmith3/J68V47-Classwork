import java.util.*;

public class Lesson7Exercise1_MightyMenu {

    public static boolean isActive = true;
    public static int option;
    public static void getOption(){
        Scanner input = new Scanner(System.in);
        option = input.nextInt();
    }

    public static void callMenu(){
        isActive = true;
        System.out.println("Please select one of the following options:\n1. Say 'hello'\n2. Tell a joke\n3. Quit.");
    }

    public static void Option1(){
        System.out.println("Hello!\n");

    }

    public static void Option2(){
        System.out.println("There are 10 types of people: those who understand binary, and those who don’t. \n");
    }

    public static void Option3(){
        System.out.println("Goodbye.");
        isActive = false;
    }
    public static void main(String[] args) {
        callMenu();
        getOption();

        while(isActive){
            if(option == 1){
                Option1();
                callMenu();
                getOption();
            } else if (option == 2) {
                Option2();
                callMenu();
                getOption();
            } else if (option == 3) {
                Option3();
            } else {
                System.out.println("Invalid input. please try again\n");
                callMenu();
                getOption();
            }

        }
    }

}
