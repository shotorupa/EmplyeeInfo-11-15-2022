package employee_info;

public class employee_bonus {

	
	     char employeen;
	     int crismasb;
	     double holloweenb;
	     double newyearb;
	     
	   void info()
	   {
		   
		  System.out.println("employee :"+employeen); 
		   System.out.println("chrismas Bonus: "+crismasb);
		   System.out.println("Holloween Bonus: "+holloweenb);
		   System.out.println("New year bonus: "+newyearb);
		   
	   }
	
	public static void main(String[] args) {
		
		employee_bonus ebonus=new employee_bonus();
		ebonus.employeen='A';
		ebonus.crismasb=4000;
		ebonus.holloweenb=3000.50;
		ebonus.newyearb=3000.50;
		ebonus.info();
		
	}
	
	
	
	
	
	

}
