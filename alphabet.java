package day3;
import java.util.*;
public class alphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String res="";
	
		while(num>0) {
			num--;
			
			char ch =(char)('a'+ (num %26)); 
			res=ch+res;
			num/=26;
		}
		System.out.println(res);

	}

}
