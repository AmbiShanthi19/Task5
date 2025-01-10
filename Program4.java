

package task5;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner S1=new Scanner(System.in) ;
		int k=S1.nextInt();
		System.out.println("Output is ");
		for (int i=0;i<k;i++) {
			for (int j=0;j<k;j++)
			{
				if(j==i || j==k-i-1)
				{
					System.out.print("*");
				
				}
				else
					{
					System.out.print(" ");
				}
				
			}System.out.println();
			
			}
		}
	}

