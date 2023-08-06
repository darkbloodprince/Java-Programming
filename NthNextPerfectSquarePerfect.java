//WAPTP Check Nth next Perfect square number is perfect number or not between m to n
import java.util.Scanner;
class NthNextPerfectSquarePerfect  
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
			for (int j=1;j<=i ;j++ )
			{
				if (j*j==i)
				{
					sln++;
					if (sln==n+1)
					{
						int sum=0;
						for (int k=1;k<i ;k++ )
						{
							if (i%k==0)
							{
								sum=sum+k;
							}
						}
						if (sum==i)
						{
							System.out.println(i+" is Perfect Number");
						}
						else
							System.out.println(i+" is not Perfect Number");
					}
				}
			}
		}
	}
}
