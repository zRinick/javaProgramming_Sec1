import java.util.*;

public class lab6033 {
	static Scanner input = new Scanner(System.in);
	static String fullname,fname,miname,lastname,yoname;
	public static void main(String[] args) {
		System.out.print("Please enter your name, separa by a space.\n: ");
		fullname = input.nextLine();
		String yyname=abbreviatName(fullname);
		
		
		int space = fullname.trim().indexOf(" ");
		fname = fullname.substring(0,space);
		
		System.out.println(yyname);
		
	}
	public static String abbreviatName(String fullname) {
		int fspace = fullname.indexOf(" ");
		int lspace = fullname.lastIndexOf(" ");
		if(fspace == -1 || lspace == -1 || fspace == lspace);
		int space = fullname.trim().indexOf(" ");
		fname = fullname.substring(0,fspace);
		miname = fullname.substring(fspace+1,fspace+2);
		
		lastname = fullname.substring(lspace+1,lspace+2);
		
		yoname = miname.toUpperCase() +"."+lastname.toUpperCase()+"."+fname;
		
		return yoname;

		
		
	}
}
