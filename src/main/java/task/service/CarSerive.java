package task.service;

import task.model.Car;
import task.model.Owner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarSerive {

    private static List<Car> carsList = new ArrayList<>();
    private static int maxCarId = 0;

    public static void createCar(String model, String manufacturer, String registredNumber){
        Car car = new Car(maxCarId++, model, manufacturer, registredNumber);
        carsList.add(car);
    }

    public static List<Car> getCarsByModel(String model){
        List<Car> listOfCars = new ArrayList<>();
        for (Car car:carsList) {
            if (car.getModel().equals(model)){
                listOfCars.add(car);
            }
        }
        return listOfCars;
    }

    public static List<Car> getCarsByManufacturer(String manufacturer){
        List<Car> listOfCars = new ArrayList<>();
        for (Car car:carsList) {
            if (car.getManufacturer().equals(manufacturer)){
                listOfCars.add(car);
            }
        }
        return listOfCars;
    }

    public static List<Car> sortByModel(List<Car> carsList, boolean reverse) {
        carsList.sort(Comparator.comparing(Car::getModel));
        if (reverse)
            Collections.reverse(carsList);
        return carsList;
    }

}
