import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		Scanner input  = new Scanner(System.in);
		//create object for write data to file use PrintStream class
		//FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt",true));
		System.out.print("Product Id: ");
		String productId = input.next();
		System.out.print("Product Name: ");
		String productName = input.next();
		System.out.print("Product Unit: ");
		int productUnit = input.nextInt();
		System.out.print("Product Price: ");
		float ProductPrice = input.nextFloat();
		
		writeFile.println(productId+","+productName+","+productUnit+","+ProductPrice);
		System.out.println("Write file already...");
		writeFile.close();
		
		
		
		
		
		
		
		
		
	}

}
