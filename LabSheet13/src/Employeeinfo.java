import java.util.*;
import java.io.*;

public class Employeeinfo {
	public  static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read Data? :");
		choice = input.next().toLowerCase();
		
		while(!(choice.equals("insert"))&&!(choice.equals("read"))) {
			System.out.print("pleass type insert or read Data? :");
			choice = input.next().toLowerCase();
				
		}
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) {
			obj.insert();
		}
		else if(choice.equals("read")) {
			System.out.print("\nEnter dept: ");
			department = input.next().toLowerCase();
			obj.setDept(department);//sent department to setDept() method form Employee
			obj.read();//call read() method 
			
		}
		
	}
}
