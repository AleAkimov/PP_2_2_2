package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Red", 2020));
        cars.add(new Car("Audi", "Blue", 1990));
        cars.add(new Car("Honda", "Yellow", 2000));
        cars.add(new Car("Mercedes", "Green", 1990));
        cars.add(new Car("Toyota", "Yellow", 2000));
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> showCar(int count) {
        int limit = Math.min(count, 5);
        return cars.stream()
                .limit(limit)
                .toList();
    }
}
