import java.io.*;
import java.util.*;
public class Lab1205 {

	private static String id;
	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(new File("d://txtFile//Student.txt"));
		int i=1;
		Head();
		while(scan.hasNext()) {
			String id = scan.next();
			String gname = scan.next();
			String fname = scan.next();
			String lname = scan.next();
			double grade = scan.nextDouble();
			String level = scan.next();
			
			System.out.println(i+".\t"+id+"\t"+level(level)+"\t"+fname.substring(0,1).toUpperCase()+"."+lname+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		scan.close();

	}
	public static String level(String level) throws IOException{
		return level+"th";
		
	}
	public static String Status(double grade) {
		if(grade>=2){
			return "Pass";
		}
		else if(grade>=1&&grade<=2){
			return "Critical";
		}
		else {
			return "Retired";
		}
		
	}
	public static void Head() {
		System.out.println("No."+"\t"+"ID"+"\t\t"+"Level"+"\t"+"Name"+"\t\t"+"Grad"+"\t"+"Status");
		System.out.println("***************************************************************");
	}

}
