package com.example.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class RadioHutTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Consumer<SalesTxn> radioReport = 
          t -> System.out.printf("ID: " + t.getTxnId() + "  Seller: " + t.getSalesPerson() 
          + "-- Buyer: " + t.getBuyerName() + " -- State: " 
          + t.getState() + " -- Amt: $%,9.0f%n", t.getTransactionTotal());
        
        // Print out Radio Hut Transactions
        System.out.println("=== Radio Hut Transactions ===");
        List<SalesTxn> radioHut = tList.stream().filter(t -> t.getBuyerName().equals("Radio Hut")).collect(Collectors.toList());
        radioHut.forEach(System.out::println);
        
        // Print out the total number of transactions
        System.out.print("Total Transactions: ");
      long transaction = tList.stream().filter(t -> t.getBuyerName().equals("Radio Hut")).count();

      System.out.println(transaction);
        
        
        // Print largest transaction
        System.out.println("===Radio Hut Largest ===");

        SalesTxn largest = tList.stream().max(Comparator.comparing(SalesTxn::getTransactionTotal)).orElse(null);
        System.out.println(largest);
        
        // Print smallest transaction
        System.out.println("=== Radio Hut Smallest ===");

       SalesTxn smallest = tList.stream().filter(p -> p.getBuyerName().equals("Radio Hut")).min(Comparator.comparing(SalesTxn::getTransactionTotal)).orElse(null);
       System.out.println(smallest); 
    }
}
