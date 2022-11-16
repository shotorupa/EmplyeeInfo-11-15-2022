package employee_info;

public class PolyOverLoading {
                          
	             public static void main(String[] args) {
	            	 PolyOverLoading obj=new PolyOverLoading();
	            	 obj.oL1();
	            	 obj.oL1('1',"Emmy");
	            	 obj.oL1("333-333-4444", 5500.00);
	            	 obj.oL1(6F,60000000L);
	            	 

				}
	
	      public void oL1() {
	    	  System.out.println("All the employee info");
	    	   }
	      public void oL1(char empno, String name) {
	    	  System.out.println("Employee number is :"+empno+ "  and name is :"+ name); 
              }
	      public void oL1(String pno, Double salary) {
	    	  System.out.println("Phone number is :"+pno+ "  and salary is "+salary);
}
	      public void oL1(float days, long yearly ) {
	    	  System.out.println("worked total in a week "+ "yearly made salary "+yearly);
}
	      
}