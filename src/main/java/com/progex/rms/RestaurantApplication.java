package com.progex.rms;

import com.progex.annotations.ProgexMicroservice;
import com.progex.annotations.SwaggerData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ProgexMicroservice(swaggerData = @SwaggerData(applicationName = "Restaurant Management Service", version = "", contactName = "",
        contactEmail = "", description = "Restaurant Management Service", basePackage = "com.progex.rms"))
@ComponentScan(basePackages = {"com.progex"})
public class RestaurantApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantApplication.class, args);
    }
}