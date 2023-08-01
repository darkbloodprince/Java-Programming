import java.util.Scanner;
class PalindromeNext
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sln=1;
		while(true)
		{
			num++
			int temp==num;
			int rem=0;
			int rev=0;
			while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if (num==rev)
			{
				System.out.println(num);
				break;
			}
		}
	}
}
