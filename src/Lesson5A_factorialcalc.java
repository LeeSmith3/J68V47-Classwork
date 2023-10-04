import java.util.*;

public class Lesson5A_factorialcalc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number here: ");
        int userNum = input.nextInt();

        System.out.print("Enter the amount of times you want to multiply the number here: ");
        int multiplyBy = input.nextInt();
        for(int i = 1; i <= multiplyBy; i++ ){
            int number = userNum * i;
            System.out.println(userNum+" x "+i+" = "+number);
        }
    }
}
