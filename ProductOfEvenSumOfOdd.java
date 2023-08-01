//WAPTP Product of even digits and sum of odd digits of a given number
import java.util.Scanner;
class ProductOfEvenSumOfOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int rem=0;
		int sum=0;
		int prod=1;
		while (n!=0)
		{
			rem=n%10;
			n=n/10;
			if (rem%2==0)
			{
				prod=prod*rem;
			}
			else
				sum=sum+rem;
		}
		System.out.println("Product of even digits of given number: "+prod);
		System.out.println("Sum of odd digits of given number: "+sum);
	}
}
