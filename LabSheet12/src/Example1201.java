import java.io.*;
import java.util.*;
public class Example1201 {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		while(scan.hasNext()) {
			String fname = scan.next();
			scan.next();
			scan.next();
			String email = scan.next();
			System.out.println(fname+" ("+email.toUpperCase()+")");
			
		}
		scan.close();
		
		
	}

}
