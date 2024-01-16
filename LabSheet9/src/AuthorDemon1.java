import java.util.Scanner;
public class AuthorDemon1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String name,email;
		char gender;
		System.out.print("Input author name     : ");
		name = scan.nextLine();
		System.out.print("Input author e-mail   : ");
		email = scan.nextLine();
		System.out.print("Input author gender   : ");
		gender = scan.next().charAt(0); 
		Author A1= new Author(name,email,gender);
		
		
		
		System.out.println(A1);

	}

}
