import java.io.*;
import java.util.Scanner;

public class Lab1204 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp="";
		int countbook=0,i=1;
		
		System.out.print("Enter rating of books: ");
		double inputrating = input.nextDouble();
		System.out.println("-------------------------------------------------------");
		while((tmp=readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			double rating = Double.parseDouble(data[2]);
			if(inputrating==rating) {
				System.out.println("Book "+i+":"+data[0]+" by "+"("+data[3]+")"+" reviews");
				countbook++;
				i++;
			}
		}
		readFile.close();
		System.out.println("-------------------------------------------------------");
		System.out.println("There are "+countbook+" Book get rating more than "+inputrating);
		
		
		
	
	
	
	
	}

}
