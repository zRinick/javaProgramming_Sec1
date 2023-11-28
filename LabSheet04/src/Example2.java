import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		// Declare constants first (variables may use these constants)
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		// Declare variables

		int taxableIncome;

		double taxPayable = 0;
		
		//assume input for  taxableIncome
		taxableIncome = 85000;
		//compute tax payable on 4 cases
		if(taxableIncome<=20000) {
			taxableIncome =0;
		}
		else if(taxableIncome<=40000) {
			taxPayable = (taxableIncome-20000) *TAX_RATE_ABOVE_20K;
		}
		else if(taxableIncome<=60000) {
			taxPayable = 20000*TAX_RATE_ABOVE_20K+(taxableIncome-40000)*TAX_RATE_ABOVE_40K;
		}
		else {
			taxPayable = (20000*TAX_RATE_ABOVE_20K)+(20000*TAX_RATE_ABOVE_40K)+(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
		}
		//print tax payable 
		//System.out.print("The income tax payable is : "+ taxPayable);
		System.out.printf("The income tax payble is: %.2f",taxPayable);
		
	}
	
	

}
