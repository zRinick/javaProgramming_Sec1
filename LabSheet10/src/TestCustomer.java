

public class TestCustomer {
    public static void main(String[] arge) {
        System.out.println("###Test Customer class###");
        Customer c1 = new Customer(1088,"Conan Edogawa", 10);
        Customer c2 = new Customer(1088,"Conan Edogawa", 5);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("*************************************");
        System.out.println("id is: "+c1.getId());

        System.out.println("name is: "+c1.getName());

        System.out.println("discount is: "+c2.getDiscount());

        System.out.println("***************************************");

        System.out.println("###Test Invoice class##"); 
        Invoice i1 = new Invoice(101, c2, 12000.00);
        Invoice i2 = new Invoice(101,c2,9500);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("***************************************");
        System.out.println("id is: " + i1.getId());
        System.out.println("customer is: " +i1.getCustomer());
        System.out.println("amount is: " + i1.getAmountAfterDiscount());
        System.out.println("**************************************");
        System.out.println("customer's id is: " + i2.getCustomerID());
        System.out.println("customer's name is: " + i2.getCustomerName());
        System.out.println("customer's discount is: " + i2.getCustomerDiscount());
        System.out.println("amount after discount is: " + i2.getAmountAfterDiscount()); 
    }
    
    	  
}
