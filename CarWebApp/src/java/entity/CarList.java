/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class CarList {
    
    private static Car[] cars;
     private static ArrayList<Car> listBrand = new ArrayList<>();
    private static ArrayList<Car> listExploitation = new ArrayList<>();
    private static ArrayList<Car> listYearOfIssueAndPrice = new ArrayList<>();


    static {
        cars = new Car[4];
        cars[0] = new Car(1, "Porcshe", "Panamera", "чёрный", "3592-IT-2", 2002,545.74);
        cars[1] = new Car(2, "BMW", "M8", "фиолетовый", "5046-LV-5", 2010,952.52);
        cars[2] = new Car(3, "Tesla", "Prid", "синий", "7586-UK-7", 2015,322.32);
        cars[3] = new Car(4, "Mercedes-Benz", "GLE", "белый", "6482-EG-1", 2020,645.85);
    }

    public static List<Car> getCars() {
        return Arrays.asList(cars);
    }

    public static ArrayList<Car> getListBrand(String brand) {
        for (Car car : getCars()) {
            if (brand.equals(car.getBrand())) {
                listBrand.add(car);
            }
        }
        return listBrand;
    }
    public static ArrayList<Car> getListExploitation(int exploitation) {
         for (Car car : getCars()) {
            if ((2023-car.getYearOfIssue()) > exploitation) {
                listExploitation.add(car);
            }
        }
        return listExploitation;
    }

    public static ArrayList<Car> getListYearOfIssueAndPrice(int yearOfIssue, double price) {
 for (Car car : getCars()) {
     if (car.getYearOfIssue() == yearOfIssue && car.getPrice() > price) {
                    listYearOfIssueAndPrice.add(car);
            }
        }
        return listYearOfIssueAndPrice;
    }
}
