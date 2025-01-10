

package task5;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		System.out.println("Enter the Marks of the student");
		Scanner objs=new Scanner(System.in);
		int G=objs.nextInt();
		if(G == 100) {
			System.out.println("S");
		}
		else if((G>90) && (G <=99)) {
			System.out.println("Grade of the student is A");
		}
		else if ((G>80) && (G<=89))
		{
			System.out.println("Grade of the student is B");
		}
		else if ((G>70) && (G<=79))
		{
			System.out.println("Grade of the student is C");
		}
		else if ((G>60) && (G<=69))
		{
			System.out.println("Grade of the student is D");
		}
		else if ((G>50) && (G<=59))
		{
			System.out.println("Grade of the student is E");
		}
		else if (G<=50)
		{
			System.out.println("Grade of the student is F");
		}
		else if(G>100)
		{
			System.out.println("Invalid Input");
		}
	}

}
