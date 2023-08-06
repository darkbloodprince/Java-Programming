//WAPTP Count of odd Perfect square numbers between 1 to 1000
import java.util.Scanner;
class CountOddPerfectSquare  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter ending number: ");
		int b=sc.nextInt();
		int count=0;
		for (int i=a;i<=b ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				if (i%2==1)
				{
					if (j*j==i)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
