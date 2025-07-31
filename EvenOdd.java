package aaa;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
	    int[] arr = new int[n];

	    System.out.println("Enter the elements:");
	    for (int i = 0; i < n; i++) {
	    	 arr[i] = sc.nextInt();
	    }
	    int odd =0;
	    int even =0;
	    for (int i = 0; i < n; i++) {
	    	if(arr[i]%2==0) {
	    		even+=arr[i];
	    	}
	    	else {
	    		odd+=arr[i];
	    	}
	    }
	    System.out.println(even);
	    System.out.println(odd);
	}

}
