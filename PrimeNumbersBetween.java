import java.util.Scanner;
class PrimeNumbersBetween
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sln=1;
		for (int i=1;true;i++ )
		{
			int fact=0;
			for (int j=1;j<=i ;j++ )
			{
				if(i%j==0)
				{
					fact++;
				}
			}
			if (fact==2)
			{
				System.out.println(sln+". "+i);
				sln++;
			}
			if (sln>num)
			{
				break;
			}
		}
	}
}
