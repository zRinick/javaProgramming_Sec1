import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		/*double widthinput = Double.parseDouble(
				JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(
				JOptionPane.showInputDialog("Input length"));
		String colorINput = JOptionPane.showInputDialog("Input color");
		
		Rectangle obj1 = new Rectangle(widthinput,lengthInput,colorINput);
		
		JOptionPane.showMessageDialog(null, obj1+
				"\nArea of Rectangle = "+ obj1.getArea());*/
		//input data interface class
		double widthinput = Double.parseDouble(
				JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(
				JOptionPane.showInputDialog("Input length"));
		
		
		Rectangle2 obj2 = new Rectangle2(widthinput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2+
				"\nArea of Rectangle = "+ obj2.getArea());
		

	}

}
