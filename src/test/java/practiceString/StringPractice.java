package practiceString;

public class StringPractice {
	public static void main(String[] args) {
		//we can reverse String 3 ways
	//1) using + (String concatenation) operator.
		String str="My Automation Framework";// Declared String variable
	    String rev=""; // dont have value.
	    int len=str.length(); //finding lenth of a string.
	       for(int i=len-1; i>=0; i--) 
	    {
	    	rev=rev+str.charAt(i);
	    }
	       System.out.println(" Reversed String is : "+ rev);//console :-Revarsed String is : aciremA fo etats detinU
	     
	    //2) Using character array
       /* char a[]=str.toCharArray();// converting str into character array this tocharArray method will convert into multiple charecters.
	     int len = a.length;
	     for(int i=len-1; i>=0; i--)// charecters will have some peace
	     {
	    	 rev=rev+a[i];
	     }
	     System.out.println("2nd Reversed string is "+rev);*/// console:-2nd Reversed string is aciremA fo etats detinU
	
	     //3) using string Buffer class
	     StringBuffer sb=new StringBuffer(str);//pass the variable
	     System.out.println("3rd Reversed string is : "+sb.reverse());
	}
	
	

}
