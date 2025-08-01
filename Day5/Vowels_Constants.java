package programs;
import java.util.*;
public class Vowels_Constants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine().toLowerCase();
		int vowels = 0;
		int constants = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if( Character.isLetter(ch)) {
				if(ch =='a' || ch == 'e' || ch =='i' ||  ch == 'o' || ch == 'u') {
					vowels++;
				}
				else {
					constants++;
				}
			}
		}
		System.out.println("Vowels:" + vowels);
		System.out.println("Constants:" + constants);
	}

}
