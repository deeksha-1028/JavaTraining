package programs;
import java.util.*;
public class Rotated_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Original String:");
		String s1 = sc.nextLine();
		System.out.println("Enter the Rotated String:");
		String s2 = sc.nextLine();
		String combined = s1+s1;
		if(combined.contains(s2)) {
			System.out.println("Yes it is Rotated");
		}
		else {
			System.out.println("It is not Rotated");
		}
		

	}

}