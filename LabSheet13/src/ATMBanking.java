import java.util.*;
import java.io.*;
public class ATMBanking {

	public static void main(String[] args) throws IOException {
		Scanner input  = new Scanner(System.in);
		String data,password;
		int money;
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//ATMBookBank.txt"));
		do {
			System.out.print("Enter accunt number :");
			data = input.next();
			System.out.print("Enter password : ");
			password = input.next();
			System.out.print("Enter money : ");
			money = input.nextInt();
			
		}while(false);
		writeFile.close();
		
		

	}

}
