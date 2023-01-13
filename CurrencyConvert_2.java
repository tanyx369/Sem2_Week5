import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CurrencyConvert_2 {

	private static double input ;
	private static double output;
	private static boolean option;
	private static boolean status = false;
	
	private static String value;
	private static ImageIcon icon = new ImageIcon("money3.png");
	
	public static void API(String choose) {
		status = false;
		Object str = "";
		
		
		try {
			str = JOptionPane.showInputDialog(null ,"Enter the amount to convert (" + choose + " ) " , "CURRENCY CONVERTER", 
					JOptionPane.INFORMATION_MESSAGE , icon ,null, 0 );
			if(str == null) {
				System.exit(0);
			}
			input = Double.parseDouble(str.toString());
			status = true;
		}
		catch (NumberFormatException nfe)  {
			JOptionPane.showMessageDialog(null, "You had entered unavailable input", "CURRENCY CONVERTER",JOptionPane.INFORMATION_MESSAGE );
			status = false;
			GUI();
		}
		
	}
	
	public static void GUI() {
		
		String[] selection = {"USD to MYR" , "MYR to USD"}; 
		Object gui = JOptionPane.showInputDialog(null, "Welcome to Currency Converter" , "CURRENCY CONVERTER", JOptionPane.INFORMATION_MESSAGE , icon , selection, 0);
		
		try {
			if (gui.equals("USD to MYR")) {
				option = true;
				API("USD to MYR");
			}
			else if(gui.equals("MYR to USD")) {
				option = false;
				API("MYR to USD");
			}
			
		}
		catch(NullPointerException npe) {
			System.exit(0);
		}
		
	

		
		if(status) {
			calculation();
			
			if(option) {
				value = String.format("%.2f USD = RM %.2f ", input , output);
			}
			else {
				value = String.format("RM %.2f = %.2f USD ", input , output);
			}
			
			result();
		}
		
	}
	
	
	public static void result() {
		
		int result = JOptionPane.showOptionDialog(null , "Result: " + value + "\n" + "Do you want to convert again ?"
				, "CURRENCY CONVERTER" ,JOptionPane.YES_NO_OPTION , JOptionPane.INFORMATION_MESSAGE, icon , null ,0  );
		
		if(result == 0) {
			GUI();
		}
		else {
			System.exit(0);
		}
		
	}
	
    public static double calculation() {
    	if(option) {
    		output = input * 4.2;
        	return output;
    	}
    	else {
    		output = input / 4.2;
        	return output;
    	}
    	
    }
    
    public static void main(String[] args) {
    	GUI();
    	result();
    }

}
