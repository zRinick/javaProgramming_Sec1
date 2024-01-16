import java.util.Scanner;

public class Bookdemo {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Book b1 = new Book();
		String title;
		float price;
		int year;
		System.out.print("Input book title   : ");
		title = scan.nextLine();
		System.out.print("Input book price   : ");
		price = scan.nextFloat();
		System.out.print("Input publish year : ");
		year = scan.nextInt();
		b1.setPrice(price);
		b1.setPublishyear(year);
		b1.setTitle(title);
		System.out.println();
		System.out.println(b1);
	}

}
