
import java.util.Scanner;

//
//CommissionCalculator.java
//@Author: Aishwaryaa Dev
//

public class CommissionCalculator {
	public static void main(String args[]) {
        double total=200;
        double earn = 0; 
// Initialize a Scanner to read input from the command line
		Scanner scanner = new Scanner(System.in); 
    	System.out.println("Item\tValue");
        System.out.println("1\t$239.99");
        System.out.println("2\t$129.75");
        System.out.println("3\t$99.95");
        System.out.println("4\t$350.89");
        System.out.println("Enter an item number (1 - 4) to "
        		+ "record its sale or 0 to exit");
        System.out.printf("Current Compensation: $%.2f%n", total);
        int item = scanner.nextInt(); 
        while (item!=0) 
        {    
        
        	if (item == 1) {
        		earn = 0.09 * 239.99;
        	}
        	else {
        		if (item == 2) {
        			earn = 0.09 * 129.75;
        		}
        		else {
        			if (item == 3) {
        				earn = 0.09 * 99.95; }
        			else {
        				if (item== 4) {
        					earn = 0.09 * 350.89;	
        				}
        			else {
        					System.out.println("ERROR: Invalid input!");
        				}
        			}
        		}
        	}
        	total = total + earn;
            earn = 0;
        	System.out.println("Item\tValue");
            System.out.println("1\t$239.99");
            System.out.println("2\t$129.75");
            System.out.println("3\t$99.95");
            System.out.println("4\t$350.89");
            System.out.println("Enter an item number (1 - 4) to "
            		+ "record its sale or 0 to exit");
            System.out.printf("Current Compensation: $%.2f%n", total);
			item = scanner.nextInt();        
        }
        System.out.printf("Total earnings: $%.2f%n", total);
	}
}


