import java.util.Scanner;
class PrimeNumberNextM
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Enter how many next prime numbers you want:");
		int num=sc.nextInt();
		int sln=1;
		while (true)
		{
			n++;
			int count=0;
			for (int i=1;i<=n ;i++ )
			{
				if (n%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(sln+". "+n);
				if (sln==num)
				{
					break;
				}
				sln++;
			}
		}
	}
}
