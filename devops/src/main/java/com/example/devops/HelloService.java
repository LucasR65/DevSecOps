package com.example.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloService {

    ArrayList<Car>cars = new ArrayList<Car>();

    public HelloService() {
        Car car = new Car("AA11BB", "ferrari", 2000);
        cars.add(car);
        car = new Car("BB22CC", "porsche", 1000);
        cars.add(car);
        car = new Car("CC33DD", "peugeot", 500);
        cars.add(car);
        car = new Car("AA22VV", "dacia", 500);
        cars.add(car);
        car = new Car("AA23VV", "dacia", 500);
        cars.add(car);
    }


    @GetMapping("/cars/{plateNumber}")
    public Car disBonjour(@PathVariable("plateNumber") String plaque){
        int i=0;
        while(i<cars.size() && cars.get(i).getPlateNumber().equals(plaque)==false){
            i++;
        }
        if(i < cars.size()){
            return cars.get(i);
        } else {
            return null;
        }
    }
}