package io.codelex.oop.exercise3;


import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getV12EngineCars() {
        List<Car> V12EngineCars = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngineType() == EngineType.V12) {
                V12EngineCars.add(car);
            }
        }
        return V12EngineCars;
    }

    public List<Car> getProducedBefore1999() {
        List<Car> producedBefore1999 = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearOfManufacture() < 1999) {
                producedBefore1999.add(car);
            }
        }
        return producedBefore1999;
    }

    public Car getCheapest() {
        Car cheapest = null;
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            if (cheapest == null || car.getPrice() < cheapest.getPrice()) {
                cheapest = car;
            }
        }
        return cheapest;
    }

    public Car getExpensive() {
        Car expensive = null;
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            if (expensive == null || car.getPrice() > expensive.getPrice()) {
                expensive = car;
            }
        }
        return expensive;
    }

    public List<Car> getMultipleManufacturers(int numberOfManufacturers) {
        List<Car> carsByManufacturer = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturers().size() == numberOfManufacturers) {
                carsByManufacturer.add(car);
            }
        }
        return carsByManufacturer;
    }

    public boolean isInList(Car car) {
        return carList.contains(car);
    }

    public void getCarsSortedByPrice() {

    }

public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
     List<Car> byManufacturer = new ArrayList<>();
     for (Car car : carList) {
         if (car.getManufacturers().contains(manufacturer)) {
             byManufacturer.add(car);
         }
     }
         return byManufacturer;
     }

    public void listOfCarsByEstManufac(){

    }
}


