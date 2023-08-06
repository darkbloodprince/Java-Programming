//WAPTP Spy numbers between m & n in descending order
import java.util.Scanner;
class SpyNumbersDescending
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter Ending number: ");
		int b=sc.nextInt();
		for (int i=b;i>=a ;i-- )
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
				System.out.println(i);
			}
		}
	}
}