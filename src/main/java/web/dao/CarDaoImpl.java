package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Subaru", 15, "blue"));
        carList.add(new Car("Audi RS", 100, "red"));
        carList.add(new Car("Porshe", 911, "yellou"));
        carList.add(new Car("Ferrari", 40, "white"));
        carList.add(new Car("McLaren", 1, "purple"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0){
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
