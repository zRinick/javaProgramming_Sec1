import java.util.*;
import java.text.*;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm =new DecimalFormat("#,###.00");
		double[] score = new double[5];
		double sum=0,average=0;
		double max=0,min=0,midam=0;
		for(int i =0;i<score.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			score[i] = scan.nextDouble();
			sum += score[i];
			
			
		}
		average = sum/score.length;
		
		System.out.println("");
		System.out.println("Average of "+score.length+" student is "+frm.format(average));
		int j;
		for (int i=0;i<score.length;i++) {
			if(score[i]>average) {
			System.out.println("> Student "+(i+1)+" ("+frm.format(score[i])+")");
		}
		
							
	}
}
	}
