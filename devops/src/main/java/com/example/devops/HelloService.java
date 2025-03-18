package com.example.devops;

import org.springframework.web.bind.annotation.*;
@RestController
public class HelloService {
    @GetMapping("/bonjour")
    public Car disBonjour() {
        Car car = new Car("AA11BB","Ferrari",2000);
        return car;
    }
}