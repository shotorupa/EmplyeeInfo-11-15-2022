package com.inharitance;
  
         //concept inharitance prectice mathod calling from diffrent class
           public class Parents extends Grand_parent {

        	   public static void main(String[] args) {
				    Parents obj =new Parents();
				    obj.husband();
				    obj.wife();
				    obj.son();
				    obj.doughter();
				    }
	void husband() {
		    System.out.println("He is a Husband");
	}
	void wife() {
		   System.out.println("She is a wife");
	}
	
}
     