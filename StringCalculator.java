/* 
 * Project: StringCalculator.java
 * Description: Takes in a String with maths symbol and calculates
 * Author: Seunghoon Park
 * Date: 6th October, 2015
 */
import java.io.*;
import java.util.*;
public class StringCalculator {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String sum like 2 + 3: ");
		String str = scan.nextLine();
		Scanner scan2 = new Scanner(str); // create new Scanner for the String
		// Set delimiters to + sign and any whitespace ... or ... -
		scan2.useDelimiter("\\s*\\+\\s*");
		int total = 0;
		while(scan2.hasNextInt()) {
			total = total + scan2.nextInt();
		}
		System.out.println("Sum is: " + total);
	}
}