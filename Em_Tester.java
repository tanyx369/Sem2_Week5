import java.util.Scanner;

public class Em_Tester {

	
	public static void main(String[] args) {
		Manager m1 = new Manager(3221 , "Peter" , "Finance" , 30000 , "MOMO");
		Clerk c1 = new Clerk(3211 , "Jack" , "IT" , 12000 , "POPO");
		m1.display();
		m1.addBonues();
		m1.display();
		
		c1.display();
		c1.addBonues();
		c1.display();
		
		double total = 0;
		
		Scanner scan = new Scanner(System.in);
		Employee[] emp = {m1 , c1};
		for(int x = 0 ; x < emp.length ; x++) {
			System.out.println("How many days you left? ");
			int day = scan.nextInt();
			emp[x].deduct(day);
			emp[x].display();
			total += emp[x].getDeduct();
		}
		
		System.out.println("Total deduction of all workers: " + total);
		
		
	}

}
