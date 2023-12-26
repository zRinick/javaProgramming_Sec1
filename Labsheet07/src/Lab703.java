import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		int[] num = {78,36,58,41,25,92,75};
		System.out.print("Input index of array : ");
		input = scan.nextInt();
			while(input>(num.length-1)||input<0){
			System.out.print("Input index of array, agin : ");
			input = scan.nextInt();
			}
			
		System.out.println("");
		
		System.out.println("value in current index is "+num[input]);
		if(input!=(num.length-1)) {
			System.out.println("value in next    index is "+num[input+1]);
		}
		else{
			System.out.println("Sorry, "+input+"is the last index in array.");
		}
		
	}
	

}
