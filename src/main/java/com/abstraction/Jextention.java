package com.abstraction;

public class Jextention extends Jewelry {
	
	      void rings() {
	    	  System.out.println("i have rings");
	      }

		@Override
		void nacklace() {
			System.out.println("I have 2 nackless");
			
		}
           public static void main(String[] args) {
        	   Jextention obj= new Jextention();
        	   obj.rings();
        	   obj.nacklace();
        	   
        	   Jewelry obj1=new Jextention();
        	       obj1.breclet();
        	       obj1.ankleBreclet();
        	       obj1.jBox();
		}
}
