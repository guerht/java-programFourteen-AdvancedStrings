/*
 * Project: SpyProgram.java
 * Description: A program to encrypt and decrypt passwordor message String
 * Author: Seunghoon Park
 * Date: 7 October, 2015
 */
import java.util.Scanner;
public class SpyProgram {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a secret message: ");
		String secret = scan.nextLine();
		System.out.println("To encrypt: " + secret);
		Encryption enc = new Encryption();
		String encStr = enc.encrypt(secret); // Encrypt the original String
		System.out.println("Encrypted: " + encStr);
		String decStr = enc.decrypt(encStr);
		System.out.println("Decrypted: " + decStr); // Decrypt the encrypted string
	}
}