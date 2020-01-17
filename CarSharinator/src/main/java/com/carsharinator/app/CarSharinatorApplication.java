package com.carsharinator.app;

import com.carsharinator.app.DriverFunctions.DriverFunctions;
import com.carsharinator.app.models.users.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class CarSharinatorApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(CarSharinatorApplication.class, args);
                Date today = new Date();
                today.setHours(0);
                User driver = new User(1,"Joseph", "Doofmann","Pedo24", Gender.Other, "xX_GamerGirl_Xx@gmail.com",true, today);
      
                
                if (DriverFunctions.CreateTrip(driver))
                {
                     System.out.println("Valid");
                } 
                else
                {
                   
                }
               
        }
        
        @RequestMapping("/")
        String home() {
            return "Tische mögen kaputt gehen! \n";
        }
}
