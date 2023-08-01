//WAPTP Sum of odd numbers b/w m to n and trace the program
import java.util.Scanner;
class SumOfOddNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting number: ");
		int m=sc.nextInt();
		System.out.println("Enter Ending number: ");
		int n=sc.nextInt();
		int sum=0;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of Odd numbers from "+m+" to "+n+" = "+sum);
	}
}
