import java.text.*;//1. import format
public class Example2 {

	public static void main(String[] args) {
		//2.call Class DecimalFormat
		DecimalFormat frm =new DecimalFormat("#,###.00");
		final double BUFFET=299;
		int numberofcustomer =5;
		double netprice = BUFFET*numberofcustomer;
		//3.
		System.out.println("Buffet of "+numberofcustomer
				+ " Customer is "+frm.format(netprice));
		double servicecharge = netprice+(netprice*3/100);
		System.out.println("Add Service Charge 3% is "
				+ frm.format(servicecharge));
		
		
	}

}
