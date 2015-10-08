// Encryption.java
public class Encryption {
	public Encryption() {

	}
	// encrypt() method accepts a String and returns babble
	public String encrypt(String msg) {
		/*
		 * all v's (big or small) = "ag',r"
		 * all m's (big or small) = "ssad"
		 * all g's (big or small) = "jeb..w"
		 * all b's (big or small) = "dug>?/"
		 */
		String encStr = ""; // to hold our new encrypted String
		for(int i=0; i<msg.length(); i++) {
			char ch = msg.charAt(i);
			switch(ch) {
				case 'V':
				case 'v':
					encStr += "ag',r";
					break;
				case 'M':
				case 'm':
					encStr += "ssad";
					break;
				case 'G':
				case 'g':
					encStr += "jeb..w";
					break;
				case 'B':
				case 'b':
					encStr += "dug>?/";
					break;
				default:
					encStr += ch;
			}
		}
		return encStr;
	}
	// decrypt() method acceepts babble and returns a good String
	public String decrypt(String encStr) {
		String msg = "";
		// contains(String) : returns true if a String is found inside a String
		// replace(String old, String new)
		/*
		 * Search for v's
		 * Search for m's
		 * Search for g's
		 * Search for b's
		 */
		encStr = encStr.replace("ag',r", "v");
		encStr = encStr.replace("ssad", "m");
		encStr = encStr.replace("jeb..w", "g");
		encStr = encStr.replace("dug>?/", "b");
		return encStr;
	}
}