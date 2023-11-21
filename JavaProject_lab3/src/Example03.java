import javax.swing.*;
public class Example03 {

	public static void main(String[] args) {
		double weighthuman = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight: "));
		double Heighthuman = Double.parseDouble(
				JOptionPane.showInputDialog("Input Height: "));
		Heighthuman /= 100;
		double BMI = weighthuman/(Heighthuman*Heighthuman);
		String bmiCategory;
		
		if(BMI<=18.5) bmiCategory = "Underweight";
		else if(BMI<25) bmiCategory = "Normal-weight";
		else if(BMI<30) bmiCategory = "Overweight";
		else bmiCategory = "Obesity";
		JOptionPane.showMessageDialog(null,"BMI = "+String.format("%.1f",BMI)
				+ "\nYou're "+ bmiCategory ,"BMI", JOptionPane.WARNING_MESSAGE);
		

	}

}
