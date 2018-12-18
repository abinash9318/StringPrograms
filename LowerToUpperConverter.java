import java.util.*;

/*
 * Write a function to convert a given String from lowercase to uppercase
 */
public class LowerToUpperConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String input = scanner.nextLine();
		System.out.println(lowerToUpper(input));
		scanner.close();
	}

	public static char[] lowerToUpper(String input) {
		char[] inputArr = input.toCharArray();
		int count=0;
		for (int i = 0; i < inputArr.length; i++) {
			if(inputArr[i]>=65 && inputArr[i]<=90){
				continue;
			}
			else{
				count++;
				inputArr[i] = Character.toUpperCase(inputArr[i]);
			}
		}
		System.out.println(count);
		return inputArr;
	}
}
