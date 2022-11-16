package com.abstraction;

public class Myhouse implements MainInterface, SecondInterface {
                       
	          public static void main(String[] args) {
				    Myhouse myobj = new Myhouse();
				       myobj.myFamilyroom();
				       myobj.myLivingroom();
				       myobj.mykitchen();
				       myobj.mykitchenstuff();
				       myobj.mypets();
				       myobj.mykids();
				       myobj.mykids();
			}
	
	public void myFamilyroom() {
		System.out.println("I have a familyroom");
		}
     public void myLivingroom() {
	System.out.println("I have a Livingroom");
		}
     public void mykitchen() {
		System.out.println("I have a kitchen");
	}
      public void mykitchenstuff() {
		System.out.println("I have some dishes");
		}
       public void mypets() {
		System.out.println("I have a Dog name jannie");
		}
       public void mykids() {
		System.out.println("I have a baby girl and a big boy");
		
	}

        


}
