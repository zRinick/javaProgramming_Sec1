
public class Example1 {

	public static void main(String[] args) {
		String isbn="IB2-6325-85-4-1",title="Basic Java Programming";
		int unit=5;
		//float price = 255.75f;
		double price = 225.75;
		System.out.println("Book ISBN  : "+isbn);
		System.out.println("Book Title : "+title);
		System.out.println("Book Unit  : "+unit+" Book.");
		System.out.println("Book Price : "+price+" Baht.");
		System.out.println("--------------------------------------------");
		double totalprice =unit*price;
		System.out.println("Total price is "+totalprice);
		double vat = totalprice +(totalprice*7/100);
		System.out.println("Add vat 7% is "+vat);
		
	}

}
