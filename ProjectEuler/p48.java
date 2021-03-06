import java.math.BigInteger;        // Import an object to hold values larger than a "long"

public class p48 {
public static void main(String[]args) {
	BigInteger sum = new BigInteger("0");      //Setting Big Integers to 0
	BigInteger num = new BigInteger("0");

		for(int i = 1; i <= 1000; i++) {
			num = BigInteger.valueOf((int)i);       // The number from 1 to 1000 is to the power of itself
			num = num.pow(i);                       // The calculation fot these self powers are stored
			sum = sum.add(num);
		}

		System.out.println("Sum of num to power of num =" + sum);     // The sum of these "Self Power values" are printed out
		System.out.println("\nLast Ten Digits are = " + sum.toString().substring( sum.toString().length()-10 , sum.toString().length()));
                // The sum is casted to a String and the last Ten Digits are printed out (Answer = 9110846700)
    }
}