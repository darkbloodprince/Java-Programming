//WAPTP First half sum + Product of second half of a given number and find even or odd
import java.util.Scanner;
class SumProdEvenOdd 
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
		int n1=n;
		n1=n1/div;
		int sum=0;
		while (n1!=0)
		{
			rem=n1%10;
			n1=n1/10;
			sum=sum+rem;
		}
		n=n%div;
		int prod=1;
		while (n!=0)
		{
			rem=n%10;
			n=n/10;
			prod=prod*rem;
		}
		int num=sum+prod;
		System.out.println("Sum of first half + Product of Second half of given number: "+num);
		if (num%2==0)
		{
			System.out.println("Even number");
		}
		else
			System.out.println("Odd number");
	}
}
