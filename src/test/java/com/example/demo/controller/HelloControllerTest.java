package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

   HelloController controller= new HelloController();

   @Test
   void testHello() {
      String response= controller.hello();
      assertEquals("Hello from Spring Boot Jenkins Demo", response);
   }

   @Test
   void testStatus() {
      String response= controller.status();
      assertEquals("Application is running", response);
      System.out.println("DELETE LATER");
   }
}
