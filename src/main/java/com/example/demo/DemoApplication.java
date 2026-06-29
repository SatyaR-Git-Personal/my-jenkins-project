package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
   public static void main(String[] args) {
      System.out.println("MY APPLICATION STARTED");
      SpringApplication.run(DemoApplication.class, args);
   }
   
}
