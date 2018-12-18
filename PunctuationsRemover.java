import java.util.*;

/*
 * Write a function to remove all punctuation from a given String
 */
public class PunctuationsRemover {

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input :");
		String input = scanner.nextLine();
		System.out.println(removePunctuation(input));
		scanner.close();
	}

	public static String removePunctuation(String input) {
		String[] inputArr = input.split(" ");
		String removedOutput = "";
		for (String s : inputArr) {
			removedOutput = removedOutput + " " + checkPunctuation(s);
		}
		return removedOutput.trim();
	}

	public static String checkPunctuation(String s) {
		char[] sArr = s.toCharArray();
		StringBuffer bf = new StringBuffer();
		for (char c : sArr) {
			if (Character.toString(c).matches("[0-9]")
					|| Character.toString(c).matches("[a-zA-Z]")) {
				bf.append(c);
			}
		}
		return bf.toString();
	}
}
