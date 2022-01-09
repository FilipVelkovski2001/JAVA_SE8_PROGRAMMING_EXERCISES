package com.example;

public class Main {
  public static void main(String[] args) {
	  
	  PeerSingleton peerList01 = PeerSingleton.getInstance();
	  
	  PeerSingleton peerList02 = PeerSingleton.getInstance();
	  
	  for(String hostName : peerList01.getHostNames()) {
		  System.out.println("Host name: "+ hostName);
	  }
	  
	  System.out.println("");
	  
	  for(String hostName1 : peerList02.getHostNames()) {
		  System.out.println("Host name: "+ hostName1);
	  }
    
  }  
}
