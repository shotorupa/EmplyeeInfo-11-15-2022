package com.inharitance;

public class Grand_parent {
	
	         void son () {
	        	   System.out.println("He is a son");
	        	  }
	         void doughter () {
	        	 System.out.println("She is a doughter");
	         }
           public static void main(String[] args) {
			        Grand_parent  obj = new Grand_parent();
			        obj.son();
			        obj.doughter();
		}
}
