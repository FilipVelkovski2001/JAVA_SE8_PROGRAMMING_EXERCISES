package com.example.lambda;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
        // Replace with stream
         tList.stream().mapToDouble(t -> t.getTransactionTotal()).forEach(System.out::println);;
        
         double t1 = tList.stream().filter(t -> t.getBuyerName().equals("Radio Hut")).mapToDouble(t -> t.getTransactionTotal()).sum();
         
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
     
        
        // Replace with Stream
        double t2 = tList.stream().filter(t -> t.getBuyerName().equals("PriceCo")).mapToDouble(t -> t.getTransactionTotal()).sum();
        
        System.out.printf("PriceCo Total: $%,9.2f%n", t2);
        // Replace with stream
        double t3 = tList.stream().filter(t -> t.getBuyerName().equals("Best Deals")).mapToDouble(t -> t.getTransactionTotal()).sum();;
        
        System.out.printf("Best Deals Total: $%,9.2f%n", t3);
        
        // Print out Average Unit Count
        
        System.out.println("=== Average Unit Count ===");
        
        // Replace with Stream
        
        double t4 = tList.stream().mapToDouble(t -> t.getUnitCount()).sum();
        
        // Replace with stream
        		
        double t5 = tList.stream().filter(t -> t.getProduct().equals("Widget Pro")).mapToDouble(t -> t.getUnitCount()).average().orElse(0);
        
        System.out.printf("Widget Pro Avg: %,9.0f%n", t5);
       
        double t6 = tList.stream().filter(t -> t.getProduct().equals("Widget")).mapToDouble(t -> t.getUnitCount()).average().orElse(0);
         
        System.out.printf("Widget Avg: %,9.0f%n", t6);        
       
                 
        
    }
}
