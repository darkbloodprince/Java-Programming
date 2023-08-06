//WAPTP Perfect numbers between 1 to 1000 in Descending order
import java.util.Scanner;
class PerfectNumbersDescending 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter ending number: ");
		int b=sc.nextInt();
		int count=0;
		for (int i=b;i>=a ;i-- )
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
				System.out.println(i);
			}
		}
	}
}
