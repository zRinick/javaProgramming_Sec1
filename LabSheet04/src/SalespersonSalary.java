import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final double COMMISSION_RATE = 0.15;
		final int SENTIEL = -1;
		
		int sales;
		double salary;
		
				
		
		while(true){
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if(sales == SENTIEL ) 
			{
				System.out.print("Bye");
				break;
			}
			else {
				salary = 1000 +sales*COMMISSION_RATE;
				System.out.printf("Salary is: $%.2f\n",salary);
			}
		}
		
	}

}
