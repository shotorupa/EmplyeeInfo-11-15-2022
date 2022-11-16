package condition;

import java.util.*;
import java.util.stream.Collectors;

public class PrecticeList {
	
	private static final Integer[] List = null;

	public static void main(String[] args) {
		
		//removing duplicate elements
//		List<Integer> number = new ArrayList<Integer>();
//		number.add(10);
//		number.add(40);
//		number.add(10);
//		number.add(35);
//		List<Integer> updatedList =new ArrayList<Integer>();
//           Set<Integer> list = new HashSet<Integer>(number);
//		System.out.println(list);
//
//		//finding duplicate elements
//		int [] num = {40,26,45,26,35,26, 78, 45};
//     for (int i=0; i< num.length-1;i++) {
//	    	for(int j=i+1; j< num.length;j++) {
//	    	if (num[i]==num[j]) {
//	    		System.out.println("The Duplicate Elements is : "+num[j]);
//	    	}
//	    		}
//    	}
//	      for (int i=1; i <=100; i++) {
//    	  if (i%3==0&& i%5==0) {
//    		  System.out.println("FizzBuzz");
//    	  }
//    	  else if (i%3==0) {
//    		  System.out.println("Fizz");
//   	  }
//  	  else if(i%5==0) {
//    		  System.out.println("Buzz");
//    	  }
//  	  else {
// 		  System.out.println(i);
//    	  }
//      }
	 int num []= {40,26,45,26,35,26, 78, 45}; 
	 int max = Arrays.stream(num).max().getAsInt();
	 System.out.println("Maximum number is "+max);
	     }
	   
	}

	


