import java.util.*;

/*
 *  Write a function to check if a given input is integer or String
 */
public class StringValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String input = scanner.nextLine();
		System.out.println(checkString(input));
		scanner.close();
	}

	public static boolean checkString(String input) {
		char[] inputArr = input.toCharArray();
		boolean flag = true;
		for (char c : inputArr) {
			if (Character.toString(c).matches("[0-9]+")) {
				continue;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
