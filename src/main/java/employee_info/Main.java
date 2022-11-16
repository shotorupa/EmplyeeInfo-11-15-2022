package employee_info;

public class Main {
	        
	int employeeid; //those r my  instance variable 
	String ename;
	double salary;
	int departno;
	String job;
	
	void display() // my methods
  {
		System.out.println("employee id is  "+employeeid);
		System.out.println("employee name is  "+ename);
		System.out.println("employee salary is  "+salary);
		System.out.println("department number is  " +departno);
		System.out.println("employee position is  "+job);
		
	}
	
	public static void main(String[] args) 
	{
		employee emp1=new employee(); //emp1 1st object created as emp1
	     emp1.employeeid=101;
	     emp1.ename="Dani";
	     emp1.salary=50000.00;
	     emp1.departno=10;
	     emp1.job="Manager";
	     emp1.display();
	     
	     employee emp2=new employee(); // emp2 2nd object created as em2
	     emp2.employeeid=102;
	     emp2.ename="Daly";
	     emp2.salary=30000.00;
	     emp2.departno=30;
	     emp2.job="Lead";
	     emp2.display();
	
}	
	
	
	

}
