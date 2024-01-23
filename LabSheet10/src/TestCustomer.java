
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa",10);
		Customer c2 = new Customer(1088, "Conan Edogawa",5);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("****************************");
		System.out.println("id is: "+c1.getID());
		System.out.println("name is: "+c1.getName());
		System.out.println("discount is: "+c2.getDiscout());
		
		System.out.println("****************************");
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1,12000.00);
		System.out.println();
		
		Line();
		//ยังไม่เสร็จครับ 
		//เดี่ยวมาทำต่อครับ
		//อย่าว่าผมนะครับ
	}
	public static void Line() {
		
	}

}
