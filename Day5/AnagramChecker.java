package programs;
import java.util.*;
public class AnagramChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string:");
		String s1 = sc.nextLine();
		System.out.println("Enter second string:");
		String s2 = sc.nextLine();
		s1=s1.replaceAll(" ", "").toLowerCase();
		s2=s2.replaceAll(" ", "").toLowerCase();
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}