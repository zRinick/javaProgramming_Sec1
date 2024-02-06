import java.io.*;
import java.util.*;
public class Example1202 {

	public static void main(String[] args) throws IOException{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section: ");
			int sectioninput = input.nextInt();
			Header(sectioninput);
			showListStudent(sectioninput);

	}
	public static void showListStudent(int sectioninput) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp ="";
		while((tmp=readFile.readLine())!=null){
			String[] data =tmp.split("\t");
			double midtemScore = Double.parseDouble(data[4]);
			double finaltemScore = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			if(sectionFile==sectioninput){
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScore+"\t"+finaltemScore+
						"\t"+findResult(midtemScore,finaltemScore));
			}
			
		}
		readFile.close();
	}
	public static String findResult(double midtemScore,double finaltemScore) {
		double totalScore = midtemScore+finaltemScore;
		
		
		
		return totalScore>=40?"Pass":"Fall";
	}
	public static void Header(int sec) {
		System.out.println("***************************************************************");
		System.out.println("\t\tList of data for Section "+sec);
		System.out.println("***************************************************************");
	}

}
