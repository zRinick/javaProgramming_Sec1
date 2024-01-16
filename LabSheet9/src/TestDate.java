
public class TestDate {

	public static void main(String[] args) {
		Date d1 = new Date(2011,2,8);
		System.out.println(d1);
		System.out.println();
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setday(23);
		//12/23/2023
		System.out.println(d1);
		System.out.println();
		System.out.println("Year is: "+d1.getYear());
		System.out.println("Year is: "+d1.getMonth());
		System.out.println("Year is: "+d1.getDay());
		
		
		
	}

}
