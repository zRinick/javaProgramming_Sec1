import java.io.*;

public class Lab1203 {

	public static void main(String[] args) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp="";
		int countbook=0,i=1;
		while((tmp=readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			System.out.println(i+"."+data[0]+" ("+data[1]+"), Rating "+data[2]+" publisg on "+data[5]);
			countbook++;
			i++;

		}
		readFile.close();
		System.out.println("----------------------------------------------");
		System.out.println("Number of total Book = "+countbook);

	}

}
