//FindPrimes.java
//Aishwaryaa Dev

public class FindPrimes {

	public static void main(String[]args) {
		System.out.println("Prime numbers < 10k:");
		 for (int n = 2;n<10000; n++ ) {
			 if (isPrime(n)) {
			 System.out.println(n);}
		}
	}

public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    				}
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        	}
    	}
    return true;
	}
}