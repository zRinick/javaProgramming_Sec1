import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X=0,Y=0;
		int sum=0,total=0;
		System.out.print("Input value of X : ");
		X = scan.nextInt();
		System.out.print("Input value of Y : ");
		X = scan.nextInt();
		while(Y<X) 
		{
			
			System.out.print("Input value of Y, again : ");
			Y = scan.nextInt();
		}
		
		System.out.println();
		while(X<Y)
		{
			X++;
			total = sum +X;
			System.out.println(sum+"+"+X+"="+total);
			sum=total;
		}
		
		
		
	}

}
