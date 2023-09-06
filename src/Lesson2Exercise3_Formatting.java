import java.util.*;

public class Lesson2Exercise3_Formatting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of the first item: ");
        double firstItem = input.nextDouble();

        System.out.print("Enter the price of the second item: ");
        double secondItem = input.nextDouble();

        System.out.print("Enter the price of the third item: ");
        double thirdItem = input.nextDouble();

        double total = firstItem + secondItem + thirdItem;

        System.out.format("\nITEM 1........ £%.2f", firstItem);
        System.out.format("\nITEM 2........ £%.2f", secondItem);
        System.out.format("\nITEM 3........ £%.2f", thirdItem);
        System.out.format("\nSUBTOTAL....... £%.2f", total);
    }

}
