import java.util.*;
import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		//input
		String youremail = JOptionPane.showInputDialog("Input your Email : ");
		//check email
		while(youremail.startsWith("@")||youremail.startsWith(" ")) {
			youremail = JOptionPane.showInputDialog("Input your Email,agin : ");
		}
		//check email hotmail.com or gmail.com
		youremail=youremail.toLowerCase();
		if(youremail.endsWith("hotmail.com")||youremail.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null,"Your e-mail is "
					+ youremail);
		}
		else{
			JOptionPane.showMessageDialog(null,"Your e-mail is not hotmail or"
					+ " gmail dot com");
		}
	}
}
