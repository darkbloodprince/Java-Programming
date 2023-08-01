//WAPTP Product of second half of a given number
import java.util.Scanner;
class ProdOfSecondHalf 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		int rem=0;
		while (temp!=0)
		{
			rem=temp%10;
			temp=temp/10;
			count++;
		}
		count=count/2;
		int div=1;
		for (int i=1;i<=count ;i++ )
		{
			div=div*10;
		}
		n=n%div;
		int prod=1;
		while (n!=0)
		{
			rem=n%10;
			n=n/10;
			prod=prod*rem;
		}
		System.out.println("Product of Second half of given number: "+prod);
	}
}