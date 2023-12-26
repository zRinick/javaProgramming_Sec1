import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
		
	}
	
	public static void inputEmail() {
		String inputemail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		while(inputemail.startsWith("@")||inputemail.startsWith(" ")) {
			inputemail = JOptionPane.showInputDialog("Input your e-mail,again : ");
		}
		boolean validataEmail = checkEmail(inputemail);
		if(validataEmail) {
		JOptionPane.showMessageDialog(null,"your e-mail is "+inputemail);
		}
		else {
			JOptionPane.showMessageDialog(null,"your e-mail is not hotmail or gmail dot com");
		}
	}
	
	public static boolean checkEmail(String email){
		
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else{
			return false;	
		}
	}
	
}
