
import javax.swing.*;
public class Example_503_1 {

	public static void main(String[] args) {
		
		String sentence = JOptionPane.showInputDialog("Input a sentence : ");
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentece,agin : ");
		}
		int spaceber = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceber+=1;
			}
		}
		JOptionPane.showMessageDialog(null,"This sentence has "+spaceber+" spacber."
				+ "\nThis sentence has "+(spaceber+1)+" word.");
		
		
		
	}

}
