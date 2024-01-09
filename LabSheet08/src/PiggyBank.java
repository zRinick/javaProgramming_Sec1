
public class PiggyBank {
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;
	public void setPiggyBank(int s) {
		clear();
		size = s;
	}
	public int getPiggyBank(){
		return size;
	}
	public void clear() {
		one = two = five = ten =0;
	}
	public int getTotal() {
		
		return one+(2*two)+(5*five)+(10*ten);
	}
	public void addone(int c) {
		if(getTotal()+c<=size) {
			one +=c;
		}
		else {
			System.out.println("Piggy Bank full");
		}
	}
	public void addtwo(int c) {
		if(getTotal()+(2*c)<=size) {
			two +=c;
		}
		else {
			System.out.println("Piggy Bank full");
		}
	}
	public void addfive(int c) {
		if(getTotal()+(5*c)<=size) {
			five +=c;
		}
		else {
			System.out.println("Piggy Bank full");
		}
	}
	public void addten(int c) {
		if(getTotal()+(10*c)<=size) {
			ten +=c;
		}
		else {
			System.out.println("Piggy Bank full");
		}
	}
	
	
}
