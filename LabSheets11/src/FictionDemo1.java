import java.util.Scanner;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Title : " );
		String title =  scan.nextLine();
		System.out.print("Input Year : " );
		int year = scan.nextInt();
		scan.nextLine();
		System.out.print("Input Name : " );
		String name =  scan.nextLine();
		
		System.out.print("Input Email : " );
		String email =  scan.nextLine();
		
		FictionBook f1 = new FictionBook(title,year);
		
		f1.setAuthorName(name.toUpperCase());
		f1.setEmail(email);
		
		System.out.print(f1);
	}

}
