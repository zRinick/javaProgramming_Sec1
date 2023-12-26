import javax.swing.*;
public class Example602 {

	public static void main(String[] args) {
		int inputyear = Integer.parseInt(JOptionPane.showInputDialog(" "
				+ "Input year: "));
		while(!(checkYear(inputyear))) {
			inputyear = Integer.parseInt(JOptionPane.showInputDialog(" "
				+ "Please input year between 1000-3000,\nInput year again: "));
		}
		/*if(isLaepYear(inputyear)) {
			JOptionPane.showMessageDialog(null,inputyear + " is Leap year");
		}
		else {
			JOptionPane.showMessageDialog(null,inputyear + " is NOT Leap year");
		}*/
		JOptionPane.showMessageDialog(null,isLaepYear(inputyear)
				?inputyear + " is Leap year"
				:inputyear + " is NOT Leap year");
	}
	public static boolean isLaepYear(int year) {
		if((year%4==0)&&(year%100!=0)||(year%400==0)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean checkYear(int year) {
		if(year>=1000&&year<=3000) {
			return true;
		}
		else {
			return false;
		}
	}


}

