import java.io.*;
import java.util.*;

public class Extra3 {
	
	static double total_a1 ;
	static double total_a2;
	static double total_a3;
	
	static int num_a1;
	static int num_a2;
	static int num_a3;
	
	public static void analyse() throws FileNotFoundException {
		
		FileReader f1 = new FileReader("Salary.txt");
		Scanner scan = new Scanner(f1);
		
		String get;
		while(scan.hasNext()) {
			get = scan.nextLine();
			String[] split = get.split(" ");
			double salary = Double.parseDouble(split[3]);
			if(get.contains("assistant")) {
				total_a1 += salary;
				num_a1 ++;
			}
			else if(get.contains("associate")) {
				total_a2 += salary;
				num_a2 ++;
			}
			else if(get.contains("full")) {
				total_a3 += salary;
				num_a3++;
			}
		}
		
		
	}
	
	public static void calculation() {
		System.out.println("Total salary for all assistant professor: " + total_a1 + "\n");
		System.out.println("Total salary for all associate professor: " + total_a2 + "\n" );
		System.out.println("Total salary for all full-time professor: " + total_a3 + "\n" );
		
		System.out.println("Average salary for all assistant professor: " + (total_a1 / num_a1) + "\n");
		System.out.println("Average salary for all associate professor: " + (total_a2 / num_a2) + "\n");
		System.out.println("Average salary for all full-time professor: " + (total_a3 / num_a3) + "\n");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		analyse();
		calculation();

	}

}
