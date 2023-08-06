//WAPTP Product of all the Perfect square numbers between 1 to 10
import java.util.Scanner;
class ProdPerfectSquare  
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
			for (int j=1;j<=i ;j++ )
			{
				if (j*j==i)
				{
					prod=prod*i;
				}
			}
		}
		System.out.println(prod);
	}
}
