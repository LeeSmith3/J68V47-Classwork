import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lesson12Exercise3_CarSales {
    public static ArrayList<L12E3_CarSales_class.car> loadFile(String filename){
        List<String> carDetails;
        ArrayList<L12E3_CarSales_class.car> thisClass = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                carDetails = Arrays.asList(line.split(","));
                L12E3_CarSales_class.car newCar = new L12E3_CarSales_class.car();
                newCar.make = carDetails.get(0);
                newCar.model = carDetails.get(1);
                newCar.year = Integer.parseInt(carDetails.get(2));
                newCar.vin = carDetails.get(3);
                newCar.price = Integer.parseInt(carDetails.get(4));
                newCar.mileage = Integer.parseInt(carDetails.get(4));
                newCar.condition= carDetails.get(5);
                thisClass.add(newCar);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return thisClass;
    }
    public static void printCars(L12E3_CarSales_class.car thisCar){
        System.out.print("Price: ", thisCar.toString(price));
    }
}
