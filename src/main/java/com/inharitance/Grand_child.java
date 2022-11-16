package com.inharitance;

public class Grand_child extends Parents { // extended from previous class.
                
	         public static void main(String[] args) {
				     Grand_child obj=new Grand_child(); //created new object for call the methods.
				     obj.daddy();
				     obj.mumy();
				     obj.husband();
				     obj.wife();
			}
	    void daddy() {
	    	     System.out.println("He is a Daddy");
	    	 }
	    void mumy() {
	    	System.out.println("She is a mummy");
	    }
}
