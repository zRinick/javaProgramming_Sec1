import javax.swing.*;
import java.text.*;
public class Example01 {

	public static void main(String[] args) {
		DecimalFormat frm =new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		//รับข้อมูลทาง  และแปลงเป็นจำนวนเต็ม
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill? "));
		double discount,totalPrice=0;
		totalPrice = BUFFET * numberofCustomer;
		//using Confirm 
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null, "Total Price is "
					+ frm.format(totalPrice)+" baht"+"\nDo you have a member card?");
		}while(member==JOptionPane.CANCEL_OPTION);
		if(member == JOptionPane.YES_OPTION) {
			discount = totalPrice *90/100;
			JOptionPane.showMessageDialog(null,""
					+ "Amount to be paid is "+frm.format(discount)+" baht.");
		}
		else if(member == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,""
					+ "Amount to be paid is "+frm.format(totalPrice)+" baht.");
		}
		
		
	}

}
