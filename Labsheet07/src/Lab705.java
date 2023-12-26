import javax.swing.*;
public class Lab705 {
 
	static String odd,even;
	
	public static void main(String[] args) {
		int[] num = new int[5];
        for(int i=0;i<num.length;i++) {
        	num[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter item number "+(i+1) + " : "));
        }
        ShowEven(num);
        Showodd(num);
  }
	
	public static void ShowEven(int[]num) {
        for(int _num:num) {
        	if(_num %2==0) {
        		even+= _num+" ";
        		
        		
        	}
        }	
        JOptionPane.showMessageDialog(null, "List of even number : "
        		+ "\n"+even);
	}
	
	public static void Showodd (int[]num) {
        for(int _num:num) {
        	if(_num %2==1) {
        		odd+= _num+" ";
	}
  }
        JOptionPane.showMessageDialog(null, "List of even number : "
        		+ "\n"+odd);
    }
}