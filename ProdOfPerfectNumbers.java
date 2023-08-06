//WAPTP Product of all the Perfect numbers between m to n
import java.util.Scanner;
class ProdOfPerfectNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter ending number: ");
		int b=sc.nextInt();
		int prod=1;
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
				prod=prod*i;
			}
		}
		System.out.println(prod);
	}
}
