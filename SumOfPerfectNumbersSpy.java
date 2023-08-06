//WAPTP Sum of all the Perfect numbers between m to n is spy numbers or not
import java.util.Scanner;
class SumOfPerfectNumbersSpy
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter ending number: ");
		int b=sc.nextInt();
		for (int i=a;i<=b ;i++ )
		{
			int sum=0;
			for (int j=1;j<i ;j++ )
			{
				if (i%j==0)
				{
					sum=sum+j;
				}
			}
			if (sum==i)
			{
				int rem=0;
				int total=0;
				int prod=1;
				while (sum!=0)
				{
					rem=sum%10;
					sum=sum/10;
					total=total+rem;
					prod=prod*rem;
				}
				if (total==prod)
				{
					System.out.println(i);
				}
			}
		}
	}
}
