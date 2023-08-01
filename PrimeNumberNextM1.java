import java.util.Scanner;
class PrimeNumberNextM1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int fact=0;
		for (int i=1;i<=n ;i++ )
		{
			if(n%i==0)
			{
				fact++;
			}
		}
		if (fact==2)
		{
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
		else
		{
			int fact1=0;
			for (int i=1;i<=(n/2) ;i++ )
			{
				if(n%i==0)
				{
					fact1=fact1+i;
				}
			}
			if(fact1==n)
			{
				System.out.println("Perfect number");
			}
			else
				System.out.println("Not perfect number");
		}
	}
}
