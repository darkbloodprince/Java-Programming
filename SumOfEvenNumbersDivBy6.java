//WAPTP Sum of even numbers which are divisible by 6 b/w 1 to 50 and trace the program
import java.util.Scanner;
class SumOfEvenNumbersDivBy6 
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
			if (i%2==0)
			{
				if (i%6==0)
				{
					sum=sum+i;
				}
			}
		}
		System.out.println("Sum of Even numbers from "+m+" to "+n+" = "+sum);
	}
}
