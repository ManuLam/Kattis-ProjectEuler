import java.math.BigInteger;        // Importing an object to store numbers larger than a "long"

public class p16 {
public static void main(String[]args) {
	BigInteger num = new BigInteger("2");   // 2 is stored as a Big Integer
	BigInteger total = num.pow(1000);       // 2^1000 is stored as "total" as a Big Integer

	System.out.println(num + "^1000 = " + total);
	String hold = String.valueOf(total);        // The Big Integer is casted into a String
	int sum = 0;

		for(int i = 1; i < hold.length()+1; i++) {      // A loop that adds all the numbers of the String to find the sum
		String add = hold.substring(i-1, i);
		sum += Integer.parseInt(add);
		}

	System.out.println("\n^ Every Digit Added is = " + sum);  // Prints the sum of each digit of the sum added together (Answer = 1366)
	}
}