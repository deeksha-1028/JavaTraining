package aaa;
import java.util.*;
public class SumArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
    	 arr[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }

    System.out.println("Sum of array elements is:" + sum);
	}

}