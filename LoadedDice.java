import java.util.Random;

// LoadedDice become Random
public class LoadedDice extends Random
{
    public LoadedDice() {
    	super();
    }
    
    public int nextInt(int num) {
    	Random ran = new Random();
    	int result = ran.nextInt(2);
    	
    	if(result == 1) {
    		return 5;
    	}
    	else {
    		return ran.nextInt(num);
    	}
    	
    }
    
    public static void printDiceRolls(Random rand) {
    	for(int i = 0 ; i < 100 ; i++) {
    		System.out.println(rand.nextInt(6) + 1);
    	}
    }
    
    public static void main(String[] args) {
    	LoadedDice dice = new LoadedDice();
    	printDiceRolls(dice);
    }
}
