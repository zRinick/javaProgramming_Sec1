import javax.swing.*;//1.liberary for input data from dialog box
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm =new DecimalFormat("#,###.00");
		//2.input data form dialogbox
		
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		
		//input unit price form dialog box
		/*String strUnit = JOptionPane.showInputDialog("Input Product Unit: ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);*/
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit: "));
		
		String strPrice = JOptionPane.showInputDialog("Input Price per unit: ");
		float pricePerUnit = Float.parseFloat(strPrice);
		//calculate totalprice
		
		float totalPrice = productUnit*pricePerUnit;
		float vat = totalPrice+(totalPrice*7/100);
		//display data to dialogbox
		JOptionPane.showMessageDialog(null, "Total Price is "
				+ frm.format(totalPrice)+" baht."
				+"\nAdd VAT 7% is "+frm.format(vat)+" baht.");
		
	}

}
