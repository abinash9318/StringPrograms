import java.util.*;

/*
 * Write a program to find initial of a name
 */
public class InitialNameFinder {

	static List<String> list = new LinkedList<String>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = scanner.nextLine();
		System.out.println(findInitials(name));
		scanner.close();
	}

	public static List<String> findInitials(String name) {
		String[] stringNameArr = name.split(" ");
		for (String s : stringNameArr) {
			list.add(String.valueOf(s.charAt(0)).toUpperCase());
		}
		return list;
	}
}
