import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,agin : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int spaceber = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceber+=1;
			}
		}
		System.out.println("This sentence has "+spaceber+"spacber.");
		System.out.println("This sentence has "+(spaceber+1)+"word.");
	}
}
