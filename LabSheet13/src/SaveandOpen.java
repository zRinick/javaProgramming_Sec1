import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException{
		Scanner input  = new Scanner(System.in);
		String answer;
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		
		do {
			header();
			System.out.print("Enter name:");
			name = input.next();
			System.out.print("Enter department : ");
			dept = input.next();
			System.out.print("Enter data again : ");
			answer = input.next();
			writeFile.println(name+"\t"+dept);
			
		}while(answer.equalsIgnoreCase("y"));
		writeFile.close();
	}
	public void read() throws IOException{
		int i=0;
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			Boolean check = false;
			header();
			
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(++i+") "+name);					
					check = true;
				}
				
				}
			if(check) {
				header();
				System.out.println("Employee in dept "+getDept().toUpperCase()+" is "+i+" person.");
				
			}else {
				System.out.println("\nSorry, no deparment: "+getDept().toUpperCase()+" in file.");
			}
			
			
			
		}catch(IOException e) {
			
			System.out.println("Sorry, File not fount");
		}
		
	}
}
