import java.util.Scanner;
class PalindromeNextM
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Enter how many next Palindrome numbers you want:");
		int num=sc.nextInt();
		int sln=1;
		for (int i=n;true ;i++ )
		{
			int temp=i;
			int rem=0;
			int rev=0;
			while(temp!=0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if (rev==i)
			{
				System.out.println(sln+". "+i);
				if (sln==num)
				{
					break;
				}
				sln++;
			}
		}
	}
}
