package employee_info;

public class Prectice {
	/*instance variable is when you have variable that is outside the 
	Method but inside the class. Instance modifier can be access within the method of the class
	if u add static method u can make non static to static frol local variable
	
	if u have a non static variable, you cannot use the same veriable is a non
	static method.*/
	static int price;
	  String color;
	  
	  public static void main(String[] args) {
	
	//method body
	int a = 500;
	int b =1500;
	
	
	
	int employeeID = 12;
	String phoneNumber = "222-222-2222";
	
	System.out.println("Total pay for employee "+employeeID+"   "+a+b);
	System.out.println(a+b);
	System.out.println(phoneNumber);
	System.out.println("Employee number is "+employeeID+"  "+phoneNumber);
	
	//for static no need to create object.
	     Prectice.Tesla();
	
	//for non static mathod need to create object
	  Prectice obj=new Prectice();
	  obj.car();
      obj.truck();
      obj.boats("15000");
      obj.airplane(60);
      
    //The default value for data typed
    //the default value for int is 0
    // the default value for sting is null
      
      
      
}	
	
	void car() {   //void method
		
		 price = 500;
		String color ="Red";
		int millage = 70;
		String make= "Tesla";
		System.out.println(color);
		}
	
	int motorcycle() {  // non void or a return type method
		return 20;
		
		}
	String truck() {
		return "Ford";
		
		}
	
	boolean isLowPrice() {
		return false;
		}
	
	// static or global level methods - can be accessed from anywhere in the project.
	
	  static void Tesla() {
		    int price = 500;
		   String  color ="Red";
			int millage = 70;
			System.out.println(price);
			
	  }
	
	  static String buses() {
	  return "public";

	  }
	  
	  // Parameterized (within parenthesis) method. it is called argument method where we pass a data
	   // we store the data type and the variable in the parameter
       void boats(String price) {
		  
	 }
	  // class level
	  private void trains() {
		 String pasenger = "";
	  }
	  //project level
	  protected void bicycle() {
		  
		  
	  }
	  
	  void airplane (int speed) {
		  
	  }
	  
	  
}
