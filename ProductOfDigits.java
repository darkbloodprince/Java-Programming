//WAPTP Product of all the digits of a given number
import java.util.Scanner;
class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int rem=0;
		int prod=1;
		while (n!=0)
		{
			rem=n%10;
			n=n/10;
			prod=prod*rem;
		}
		System.out.println("Product of all digits of given number: "+prod);
	}
}
