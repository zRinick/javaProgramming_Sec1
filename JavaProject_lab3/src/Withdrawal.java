import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm =new DecimalFormat("#,###.00");

		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		
		
		int withdrawMoney = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+""
						+ "\nInput money to withdraw"));
		//if/else if for check
		
		int mod = withdrawMoney%100;
		if(withdrawMoney>balance) {
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than balance","ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawMoney>20000) {
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than 20,000","ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawMoney%100!=0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withDraw "+(mod)+" baht.","ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			int bank1000 = withdrawMoney/1000;
			
			int bank500 = (withdrawMoney%1000)/500;
			int bank100 = (withdrawMoney%500)/100;
			JOptionPane.showMessageDialog(null,"You withdraw "+withdrawMoney+" baht."+"\n1,000 = "+bank1000+""
					+ "\n500 = "+bank500+""
							+ "\n100 = "+bank100);
		}
		
		
	}

}
