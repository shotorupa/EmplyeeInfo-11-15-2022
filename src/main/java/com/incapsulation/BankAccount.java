package com.incapsulation;

public class BankAccount {
	//access modifier ---data type----variable----value
	                                  //Declaration     //Initialization 
	     private  int   deposit;  //instance variable
         private  String accountNumber;
         private String transfer;
           // after this i have right click on class and then source and click generate getter and setter
         // and keep it public for some sort of accesses...and then generate them inside the class.
         
         public String getTransfer() {
			return transfer;
		}
		public void setTransfer(String transfer) {
			this.transfer = transfer;
		}
		public int getDeposit() {  //get method we have use return type method
			return deposit;
		}
		public void setDeposit(int deposit) {  // for set method we have use void method or return nothing method
			this.deposit = deposit; // this keyword: its mean its belongs to this class. referee to the class.
			                                       //means veriable and 
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
}
