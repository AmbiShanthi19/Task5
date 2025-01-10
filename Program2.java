

package task5;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Sring :");
		Scanner obj=new Scanner(System.in);
		String S1=obj.next();
		StringBuilder S2=new StringBuilder(S1);
		S2.reverse();
		System.out.println("Reverse String is " + S2);
	}

}
