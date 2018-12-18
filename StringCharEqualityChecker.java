import java.util.*;

/*
 * Write a function to check if all the characters of a String are same or not
 * Below provided solution works fine.. But need to find out better solution for this
 */
public class StringCharEqualityChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String input = scanner.nextLine();
		System.out.println(checkEquality(input));
		scanner.close();
	}

	public static boolean checkEquality(String input) {
		char[] inputArr = input.toCharArray();
		boolean flag = true;
		for (int i = 0; i < inputArr.length-1; i++) {
			if (inputArr[i] == inputArr[i + 1]) {
				continue;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
