package com.incapsulation;

public class Accountens  {
        public static void main(String[] args) {
        BankAccount obj = new BankAccount();
       
       
            	   
      obj.setTransfer("10000");
       System.out.println("Transfered to the account "+obj.getTransfer());
           	  
       obj.setDeposit(3000);
     System.out.println("deposited in my account  "+obj.getDeposit()); 
     obj.setAccountNumber("3333333");
    System.out.println("My account address is  "+obj.getAccountNumber());    
               
               }
}
