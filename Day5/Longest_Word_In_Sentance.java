package programs;
import java.util.*;
public class Longest_Word_In_Sentance {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Sentance:");
	String sentance = sc.nextLine();
	String[] words =sentance.split(" ");
	String longest ="";
	for(String word:words) {
		if(word.length()>longest.length()) {
			longest=word;
		}
	}
	System.out.println("Longest Word:" + longest);

	}

}