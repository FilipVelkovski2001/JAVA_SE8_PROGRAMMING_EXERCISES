package com.example.lambda;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

   
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Male Eng Under 65");
    
    List<Employee> pll = pl.stream().filter(p -> p.getDept().equals("Eng")).filter(p -> p.getAge() < 65).collect(Collectors.toList());
    pll.stream().forEach(System.out::println);
    // Mail mail, Eng employees < 65

  }
}
