package com.example.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class GroupTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        Map<String, List<SalesTxn>> tMap;
        
        // Print out transactions grouped by Buyer
        
         tMap = tList.stream().collect(Collectors.groupingBy(SalesTxn::getBuyerName));
         
         tMap.forEach((BuyerName, transactions) -> {
        	 System.out.println(BuyerName);
        	 transactions.forEach(System.out::println);
         });
        
        
        
        System.out.println("=== Transactions Grouped by Buyer ===");
        
    }
}
