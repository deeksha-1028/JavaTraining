package aaa;

import java.util.*;

public class MovingZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
	    int[] arr = new int[n];

	    System.out.println("Enter the elements:");
	    for (int i = 0; i < n; i++) {
	    	 arr[i] = sc.nextInt();
	    }
	    int pos=0;
	    int temp=0;
	    for(int i=0; i<n; i++) {
	    	if(arr[i]!=0)
	    	{
	    		temp=arr[pos];
	    		arr[pos]=arr[i];
	    		arr[i]=temp;
	    		pos++;
	    	}
	    }
	    System.out.println("Array after moving zeros:");
	    for(int i=0;i<n;i++) {
	    	System.out.println(arr[i]+" ");
	    }
	    }

}
