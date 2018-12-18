import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/*
 * Following program demonstrates the first non repeating character in a line
 */
public class FirstNonRepeatingCharInLine {
	static HashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the line or word :");
		String lineOrWord = scanner.nextLine();
		System.out.println(findFirstNonRepeatChar(lineOrWord));
		scanner.close();
	}

	public static char findFirstNonRepeatChar(String lineOrWord) {
		char[] charArr = lineOrWord.toCharArray();
		char nonRepChar = 0;
		for (Character c : charArr) {
			if (!hashMap.containsKey(c)) {
				hashMap.put(c, 1);
			} else {
				hashMap.put(c, hashMap.get(c) + 1);
			}
		}

		Set<Entry<Character, Integer>> set = hashMap.entrySet();
		for (Entry<Character, Integer> entry : set) {
			if (entry.getValue() == 1) {
				nonRepChar = entry.getKey();
				break;
			}
		}
		return nonRepChar;
	}
}
