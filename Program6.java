

package task5;

import java.util.Scanner;

public class Progam6 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int month= obj.nextInt();
		float rent = obj.nextFloat();
		int days= obj.nextInt();
		float tariff=(rent*days);
		float extra=(float) (tariff+(0.2*tariff));
		
		switch (month)
		{
			case 1:
				System.out.println(tariff);
				break;
			case 2:
				System.out.println(tariff);
				break;
			case 3:
				System.out.println(tariff);
				break;
			case 4:
				System.out.println(extra);
				break;
			case 5:
				System.out.println(extra);
				break;
			case 6:
				System.out.println(extra);
				break;
			case 7:
				System.out.println(tariff);
				break;
			case 8:
				System.out.println(tariff);
				break;
			case 9:
				System.out.println(tariff);
				break;
			case 10:
				System.out.println(tariff);
				break;
			case 11:
				System.out.println(extra);
				break;
			case 12:
				System.out.println(extra);
				break;			
					
		}
	}

	}
