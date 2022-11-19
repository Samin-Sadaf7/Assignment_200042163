package Assignment2.Content_Coupling;

import java.util.ArrayList;
import java.util.List;
/*
    Explanation is written in car.java
 */
public class CarManufacturer {
    public List<Car> cars=new ArrayList<>();
    public Car MakeCar(){
        Car car = new Car();
        car.Car_Number="22-10-4523";
        car.Manufacturer="Japan Automobiles Ltd";
        car.Brand="Toyota";
        car.seats=6;
        return car;
    }
    public void AddCar(){
        Car car = this.MakeCar();
        this.cars.add(car);
    }
}
