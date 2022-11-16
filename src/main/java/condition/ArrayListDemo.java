package condition;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
	ArrayList<String> baskets = new ArrayList<String>();//with string
	 baskets.add("Apple");
	 baskets.add("Grapes");
	 baskets.add("orenges");
	
	 System.out.println("Basket is holding  "+baskets);
	// using remove mathod
	 baskets.remove("Grapes");
      System.out.println("After remove Grapes from basket  "+baskets);
	//added new object/element
	 baskets.add(2,"Watermelon");
	 System.out.println("After adding new element "+baskets);
	//watermelon, here 2 is index of element/object
	 System.out.println(baskets.get(2)); 
	 //change element or replace
	 baskets.set(0, "pears");
	 System.out.println("After replacing apple to pears "+baskets);
	 //for searching i use contain()--return type is true or false
      System.out.println(baskets.contains("pears"));// true
      System.out.println(baskets.contains("Apple")); //false
      //isEmpty() returns true or false
      System.out.println(baskets.isEmpty());//false
      //if i want to read all the data i can use 3 approches
      //1, for....loop
      System.out.println("Reading elements using for loops......");
        for (int i=0; i<baskets.size();i++) {
        	System.out.println(baskets.get(i));
        }
      
      
      //2, for....each loop
      
      //3, iterator() which is already in the arrayList
	 
	 ArrayList<Integer>ages=new ArrayList<Integer>(); // with integer
          ages.add(20);
          ages.add(35);
          ages.add(55);
          ages.add(32);
          ages.add(20);
      for (int i=0; i<ages.size(); i++) {
       System.out.println("Ages are  :" +ages.get(i));
}
	    System.out.println("I want to see line 3 age number :"+ages.get(3));
}
}
