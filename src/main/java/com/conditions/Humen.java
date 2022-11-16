package com.conditions;

public class Humen {
	
	public void life() {
		int age=17;
		
	if (age == 17) {
		System.out.println("if age is 17 years old can drive");
	}
	else if (age>17) {
		System.out.println("Age under 17 can drive without parents");
	}
	else if (age<16 ) {
		System.out.println("ages under 16 can not drive");
	}
      }
     public static void main(String[] args) {
		Humen obj=new Humen();
		obj.life();
	}
}
