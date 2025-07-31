package aaa;

import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
	    int[] arr = new int[n];

	    System.out.println("Enter the elements:");
	    for (int i = 0; i < n; i++) {
	    	 arr[i] = sc.nextInt();
	    }
	    System.out.println("Enter number of positions to rotate:");
	    int d = sc.nextInt();
	    d = d % n;
	    int[] rotated = new int[n];
	    for(int i=0; i<n; i++) {
	    	rotated[i] = arr[(i+d)% n];
	    }
	    System.out.println("Rotated Array:");
	    for(int i=0; i<n; i++) {
	    	System.out.println(rotated[i]+ " ");
	    }
	}

}
