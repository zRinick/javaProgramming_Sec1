
public class Invoice {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return getCustomer().getId();
    }

    public String getCustomerName() {
        return getCustomer().getName();
    }

    public int getCustomerDiscount() {
        return getCustomer().getDiscount();
    }

    public double getAmountAfterDiscount() {
        //return amount * (1 - getCustomer().getDiscount() / 100.0);
    	return getAmount()-((getAmount()*getCustomerDiscount()/100.0));
    }

    public String toString(){
        return "[invoice id="+id+",Customer="+customer.toString()+",amount"+amount+"]";
    }

}
