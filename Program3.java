

package task5;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		int number=1;
		System.out.println("Enter the number :");
		Scanner objs =new Scanner(System.in);
		int n = objs.nextInt();
		System.out.println("The output is:");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
		

	}

}
