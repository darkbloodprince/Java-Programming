import java.util.Scanner;
class SumProductFactors
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		for (int i=1;i<=n ;i++ )
		{
			if(n%i==0)
			{
				sum=sum+i;
				product=product*i;
			}
		}
		System.out.println("Sum of factors of given number: "+sum);
		System.out.println("Product of factors of given number: "+product);
	}
}
