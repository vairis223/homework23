package io.codelex.oop.exercise3;

import java.util.ArrayList;
import java.util.List;

public class TestCar {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("August Horch Automobilwerke Gmbh", 1909, "Germany");
        Manufacturer manufacturer2 = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer manufacturer3 = new Manufacturer("Opel Automobile Gmbh", 1862, "Germany");


        List<Manufacturer> manufacturerList = new ArrayList<>();
        manufacturerList.add(manufacturer1);
        manufacturerList.add(manufacturer2);
        manufacturerList.add(manufacturer3);

        Car car1 = new Car("Audi", "A4", 10000.0, 2012, manufacturerList, EngineType.VR6);
        Car car2 = new Car("BMW", "320", 5000.0, 1993, manufacturerList, EngineType.R4);
        Car car3 = new Car("Opel", "Insignia", 5500.0, 2009, manufacturerList, EngineType.R4);
        Car car4 = new Car("BMW", "750IL", 15000.0, 1999, manufacturerList, EngineType.V12);
        Car car5 = new Car("BMW", "M3", 20000.0, 2002, manufacturerList, EngineType.R6);


        System.out.println(car1.equals(car2));
        System.out.println(car3.equals(car1));

        System.out.println("car1 hashcode: " + car1.hashCode());
        System.out.println("car2 hashcode: " + car2.hashCode());

        System.out.println();

        CarService carService = new CarService(new ArrayList<>());

        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);
        carService.addCar(car5);

        List<Car> allCars = carService.getCarList();
                System.out.println("All cars in car service: ");
        for (Car car : allCars) {

            System.out.println(car.getName() + " " + car.getModel());
        }
        System.out.println();
        carService.removeCar(car3);

        List<Car> V12EngineCars = carService.getV12EngineCars();
        System.out.println("Cars with V12 engine: ");
        for (Car car : V12EngineCars) {
            System.out.println( car.getName() + " " + car.getModel());
        }
        System.out.println();

        List<Car> producedBefore1999 = carService.getProducedBefore1999();
        System.out.println("Cars produced before 1999: ");
        for (Car car : producedBefore1999) {
            System.out.println( car.getName() + " " +car.getModel());
        }
        System.out.println();

        System.out.println("Most expensive car in list: " + carService.getExpensive().getName());
        System.out.println();

        System.out.println("Cheapest car in list: " + carService.getCheapest().getName());
        System.out.println();

        List<Car> multipleManufacturers = carService.getMultipleManufacturers(3);
        System.out.println("Cars with 3 manufacturers: ");
        for (Car car : multipleManufacturers) {
            System.out.println( car.getName() + " " + car.getModel());
            System.out.println();
        }

        boolean carIsInList = carService.isInList(car2);
        System.out.println("Is BMW 320 in list?");
        System.out.println(carIsInList);

        List<Car> carsByManufacturer = carService.getCarsByManufacturer(manufacturer2);
        System.out.println("Cars manufactured by BMW: ");
        for (Car car : carsByManufacturer) {
            System.out.println( car.getName() + " " + car.getModel());

        }
    }
}
