//WAPTP Product of Odd numbers b/w m to n and trace the program
import java.util.Scanner;
class ProdOfOddNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting number: ");
		int m=sc.nextInt();
		System.out.println("Enter Ending number: ");
		int n=sc.nextInt();
		int prod=1;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==1)
			{
				prod=prod*i;
			}
		}
		System.out.println("Product of Odd numbers from "+m+" to "+n+" = "+prod);
	}
}
