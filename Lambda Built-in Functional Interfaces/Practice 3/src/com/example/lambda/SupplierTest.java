package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class SupplierTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    Supplier<Employee> eSupp = () -> 
    new Employee.Builder()
    .givenName("Jill")
    .surName("Doe")
    .age(26)
    .gender(Gender.FEMALE)
    .role(Role.STAFF)
    .dept("Sales")
    .startDate(LocalDate.of(2012, 7, 14))
    .salary(45000)
    .email("jil.doe@example.com")
    .phoneNumber("202-123-4678")
    .address("33 3rd St")
    .city("Smallville")
    .state("KS")
    .code("12333")
    .build();
    		 
      
    System.out.println("=== Print employee list before");
    eList.stream().forEach(Employee::printSummary);
    
    eList.add(eSupp.get());
    
    System.out.println("\n=== Print employee list after");
    eList.stream().forEach(Employee::printSummary);
    
    List<Employee> jill = eList.stream().filter(x -> x.getGivenName().equals("Jill")).collect(Collectors.toList());
    jill.forEach(System.out::println);
    
    List<Employee> fill = jill.stream().filter(x -> x.getSalary() > 55000).collect(Collectors.toList());
    fill.forEach(System.out::println);    
  }
}
