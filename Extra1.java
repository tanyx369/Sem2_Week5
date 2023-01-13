import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;

public class Extra1 {

	static String rank;
	static String detail = "";
	
	public static void build() throws IOException {
		
		Random rand = new Random();
		int num = rand.nextInt(3);
		
		
		if(num == 0) {
			rank = "assistant";
			int salary_a1 = rand.nextInt(50000 , 80000);
			detail = rank + " " + salary_a1;
		}
		else if(num == 1) {
			rank = "associate";
			int salary_a2 = rand.nextInt(60000, 110000);
			detail = rank + " " + salary_a2;
		}
		else if(num == 2) {
			rank = "full";
			int salary_a3 = rand.nextInt(75000, 130000);
			detail = rank + " " + salary_a3;
		}
		
		
		
		
		
	}
	
	public static void write() throws IOException {
		File file = new File("Record.txt");
		FileWriter f1 = new FileWriter(file);
		PrintWriter write = new PrintWriter(f1);
		
		String first = "FirstName";
		String last = "LastName";
		
		for(int x = 1 ; x <= 10 ; x++ ) {
			build();
			write.println(first + " " + last + " " + detail);
		}
		
		write.close();
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		write();
	}

}
