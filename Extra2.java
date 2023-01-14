import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Extra2 {

	static String year;
	static String gender;
	static String name;
	static int index;
	
	static String m_name;
	static int m_rank;
	static String f_name;
	static int f_rank;
	
	static ArrayList<String> male = new ArrayList<>();
	static ArrayList<String> female = new ArrayList<>();
	static ArrayList<Integer> ranking = new ArrayList<>();
	
	public static void ask() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year: ");
		year = scan.nextLine();
		System.out.println("Enter the gender: ");
		gender = scan.nextLine();
		System.out.println("Enter the name: ");
		name = scan.nextLine();
	}
	
	public static void add() throws FileNotFoundException {
		FileReader read = new FileReader(year + ".txt");
		Scanner scan = new Scanner(read);
	
	
		
		while(scan.hasNextLine()) {
			
			String line = scan.nextLine();
			Scanner scan2 = new Scanner(line);
			index = scan2.nextInt();
			m_name = scan2.next() + " " + index;
			f_name = scan2.next() +  " " + index;
			
			//ranking.add(index);
			male.add(m_name);
			female.add(f_name);
		}
		
		
	}

	public static String analyse() {

		Scanner scan ;
		String detail = "";	
		if(gender.equals("M")) {
			//male.contains(name);
			for(int x = 0 ; x < male.size() ; x ++) {
				scan = new Scanner(male.get(x));
				String get = scan.next();
				if(get.equals(name)) {
					name = get;
					m_rank = scan.nextInt(); 
				}
				
			}
			detail = name + " is ranked #" + m_rank + " in year " + year;
		}
		else if(gender.equals("F")) {
			
			for(int x = 0 ; x < female.size() ; x ++) {
				scan = new Scanner(female.get(x));
				String get = scan.next();
				if(get.equals(name)) {
					name = get;
					f_rank = scan.nextInt();
				}
				
			}
			detail = name + " is ranked #" + f_rank + " in year " + year;
		}
		
		return detail;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ask();
		add();
		System.out.println(analyse());
	}

}
