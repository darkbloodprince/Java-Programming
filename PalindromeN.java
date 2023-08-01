import java.util.Scanner;
class PalindromeN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sln=1;
		for (int i=1;sln<=num;i++ )
		{
			int n=i;
			int rem=0;
			int rev=0;
			while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if (rev==i)
			{
				if (sln==num)
				{
					System.out.println(sln+". "+i);
				}
				sln++;
			}
		}
	}
}
