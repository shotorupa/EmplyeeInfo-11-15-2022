package com.mainpage;

public class Page1 {
	String drink ;
	String food;
	boolean unknown ;
	 String name;
	 int age;
	
	            public   void prectice1 () {
		
		 System.out.println("My girl name is  "+name+ ",  age is  "+age);
		 System.out.println("is she have good havit?  drinking  "+drink+ ",  eating good--  "+food+ ",  is it true?  "+unknown);
	    }
	 public static void main(String[] args) {
		      Page1 obj=new Page1();
		        obj.drink=("water");
		        obj.food=("healthy");
		        obj.unknown=false;
		        obj.name=("shanvi");
		        obj.age=3;
		        obj.prectice1();
		        
		        
	}
	

}
