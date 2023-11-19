import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 5));
        carList.add(new Car("Toyota", 2));
        carList.add(new Car("BMW", 4));

        Comparator<Car> carComparator = Comparator
                .comparing(Car::getManufacturer)
                .thenComparingInt(Car::getAge);


        Collections.sort(carList, carComparator);

        for (Car car : carList) {
            System.out.println("Manufacturer: " + car.getManufacturer() + ", Age: " + car.getAge());
        }
    }
}

class Car {
    private String manufacturer;
    private int age;

    public Car(String manufacturer, int age) {
        this.manufacturer = manufacturer;
        this.age = age;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAge() {
        return age;
    }
}

