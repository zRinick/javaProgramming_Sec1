import java.util.*;
public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();
	
	public static void main(String[] args) {
		inputCoin();
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addtwo(34);
		System.out.println("Add 2 Baht Money : "+34);
		System.out.println("Money Total : " +pb.getTotal());
		pb.addten(13);
		System.out.println("Add 10 Baht Money : "+13);
		System.out.println("Money Total : " +pb.getTotal());
		pb.addfive(100);*/

	}
	public static void inputCoin() {
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("please define size of PiggyBank:");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of your PiggyBank: "+pb.getPiggyBank());
		MainMenu();
		
	}
	public static void MainMenu() {
		while(true) {
			System.out.println("==========================================");
			System.out.println("Menu of PiggyBank");
			System.out.println("==========================================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.println("==========================================");
			System.out.print("Please Select Menu[1-5] : ");
			int select = scan.nextInt();
			if(select==1) {
				System.out.print("Insert 1 Baht money : ");
				int num = scan.nextInt();
				pb.addone(num);
				System.out.println("Money Total : "+pb.getTotal());
				
			}
			else if(select==2) {
				System.out.print("Insert 2 Baht money : ");
				int num = scan.nextInt();
				pb.addtwo(num);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(select==3) {
				System.out.print("Insert 5 Baht money : ");
				int num = scan.nextInt();
				pb.addfive(num);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(select==4) {
				System.out.print("Insert 10 Baht money : ");
				int num = scan.nextInt();
				pb.addten(num);
				System.out.println("Money Total : "+pb.getTotal());
			}
			else if(select==5) {
				System.out.print("Bye Bye");
				break;
			}
		}
		
	}

}
