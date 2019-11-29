package com.carsharinator.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class CarSharinatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSharinatorApplication.class, args);
        }
        
        @RequestMapping("/")
        String home() {
            return "Tische mögen kaputt gehen! \n";
        }
}
