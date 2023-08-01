import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int n=num;
		int rem=0;
		int sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if (sum==n)
		{
			System.out.println("Palindrome number");
		}
		else
			System.out.println("Not Palindrome number");
	}
}
