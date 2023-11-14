import java.util.*;//1.import for keybord
import java.text.*;//1. import format
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm =new DecimalFormat("#,###.00");
		//2.Create class Scanner for input fata from kerboard
		Scanner input = new Scanner(System.in);
		//3.display and input data 
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productunit = input.nextInt();
		System.out.print("Input product price per unit : ");
		float productprice = input.nextFloat();
		System.out.println("");
		float totalprice = productunit*productprice;
		System.out.println("Total Price is "+frm.format(totalprice)+" baht.");
		float vat = totalprice+(totalprice*7/100);
		System.out.print("Add VAT 7%  is "+frm.format(vat)+" baht.");
		
		
	}

}
