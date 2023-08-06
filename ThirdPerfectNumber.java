//WAPTP 3rd perfect number between 1 to 1000
import java.util.Scanner;
class ThirdPerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter ending number: ");
		int b=sc.nextInt();
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int sln=0;
		for (int i=a;i<=b ;i++ )
		{
			int sum=0;
			for (int j=1;j<i ;j++ )
			{
				if (i%j==0)
				{
					sum=sum+j;
				}
			}
			if (sum==i)
			{
				sln++;
				if (sln==n)
				{
					System.out.println(i);
				}
			}
		}
	}
}
