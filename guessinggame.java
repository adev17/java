//Guessing game
//Not an assignment

import java.util.Scanner;
import java.util.Random;

public class guessinggame {
  public static void main(String[] args) {
  int pickednum;
	Scanner sc = new Scanner(System.in);
	  Random noSeed = new Random(); //correct upto here
	  int target = noSeed.nextInt(10) + 1;
	  System.out.println(target);
	  
	  System.out.print("Pick a number bw 1 to 10: ");
        
        do {
        	pickednum = sc.nextInt(); 
        if (pickednum < target) 
        	System.out.println("Invalid input! Go higher!");
        	else if (pickednum > target) 
        		System.out.println("Invalid input! Go lower!");
        	
        	} while (pickednum !=target);
	System.out.println("Bingo!");
        
  }
}