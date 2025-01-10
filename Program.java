

package task5;

public class Program1 {

	public static void main(String[] args) {
		String S1="MADAM";
		StringBuilder S2=new StringBuilder("MADAM");
		S2.reverse();
		if (S1.equals(S2.toString()))
		{
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not Palindrome");
		}
	}
}
