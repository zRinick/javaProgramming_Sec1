import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		PrintStream writeFile = new PrintStream((new File("d://txtFile//Sentence.txt")));
		Scanner input  = new Scanner(System.in);
		int i=1;
		while(true) {
			System.out.print("Sentence: ");
			String word = input.next();
			
			if(word.equalsIgnoreCase("Stop")) {
				break;
			}
			
			//save data to file(write file)
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.print("File is save!!");
		writeFile.close();
		
		
		
		
		
	}

}
