//WAPTP Count of even Perfect square numbers between m to n
import java.util.Scanner;
class CountEvenPerfectSquare  
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
				if (i%2==0)
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
