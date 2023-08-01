//WAPTP odd digits of a given number
import java.util.Scanner;
class Odd_digits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int rem=0;
		System.out.println("Odd digits of a given number: ");
		while (n!=0)
		{
			rem=n%10;
			n=n/10;
			if (rem%2==1)
			{
				System.out.println(rem);
			}
		}
	}
}
