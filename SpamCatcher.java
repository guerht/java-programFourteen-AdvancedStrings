/* 
 * Project: SpamCatcher.java
 * Description: A program to catch spammy email.
 * Author: Seunghoon Park
 * Date: 6th October, 2015
 */
import java.util.Scanner;
public class SpamCatcher {
	public static void main(String args[]) {
		String spamTitle = "Low cost loans";
		String spamFilteredTitle = "L*o*w* *c*o*s*t* *l*o*a*n*s";
		// this is the title we received
		String sentTitle = "d^^*_^^ir....-t***y";
		Scanner scan = new Scanner(sentTitle);
		scan.useDelimiter(""); // now EVERYTHING is a token
		// this is the actual title
		String trueTitle = "";
		while (scan.hasNext()) {
			//skip the stuff we want to get rid of
			while (scan.hasNext("\\W|_")) {
				scan.skip("_*"); // step 1: skip underscores
				if (scan.hasNext()) {
					scan.skip("\\W*"); // step 2: skip non-word charcters [a-z, A-Z, 0-9]
				}

			}
			if (scan.hasNext()) {
				trueTitle = trueTitle + scan.next(); // step 3: keep everything else
			}
		}
		System.out.println(trueTitle);
	} 
}