//WAPTP Count all the spy numbers between 1 & 10
import java.util.Scanner;
class CountAllSpyNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter Ending number: ");
		int b=sc.nextInt();
		int count=0;
		for (int i=a;i<=b ;i++ )
		{
			int temp=i;
			int rem=0;
			int sum=0;
			int prod=1;
			while (temp!=0)
			{
				rem=temp%10;
				temp=temp/10;
				sum=sum+rem;
				prod=prod*rem;
			}
			if (sum==prod)
			{
				count++;
			}
		}
		System.out.println("Count of spy numbers between "+a+" and "+b+": "+count);
	}
}