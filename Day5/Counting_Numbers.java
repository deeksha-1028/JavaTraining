package programs;
import java.util.*;
public class Counting_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentance:");
		String sentence = sc.nextLine();
		String[] words =sentence.split(" ");
		System.out.println("Number of words" + words.length);

	}

}
