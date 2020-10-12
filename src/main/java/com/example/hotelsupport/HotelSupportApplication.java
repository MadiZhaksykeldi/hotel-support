package com.example.hotelsupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelSupportApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotelSupportApplication.class, args);
    }
}
