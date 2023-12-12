import java.util.*;
public class Lab03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		
		int countword=0;
		
		if(Message.toLowerCase().indexOf("nichi")>=0) 
		{
			System.out.print("Nichi is a sentence");
		}
		else
		{
			System.out.print(Message);
			countword+=1;
		}
	}

}
