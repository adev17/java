//SmallestInt.java
//Aishwaryaa Dev
import java.util.Scanner;

public class SmallestInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value=0;
		int smallest=0;
		System.out.print("How many integers shall we "
				+ "compare? (Enter a positive integer): ");
        int counter = scanner.nextInt(); 
        
        while (counter<=0) {
        	System.out.println("Invalid input!");
    		System.out.print("How many integers shall we "
    				+ "compare? (Enter a positive integer): ");
            counter = scanner.nextInt(); 
        }
        if (counter>0)
        {	
        	
        	for(int ii = 1; ii<=counter; ii++) {
        		System.out.print("Enter value " + ii + ": ");
        		value = scanner.nextInt();
        		if (ii==1) {smallest=value;}
        		
        		if (value<smallest) {
        				smallest = value;}	    		
    	        }         		
        	System.out.println("The smallest number entered was " + smallest);
        }  
	}
}