//WAPTP Sum and product numbers which are divisible by 3 & 5 b/w m to n and trace the program
import java.util.Scanner;
class SumProdDivBy3_5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting number: ");
		int m=sc.nextInt();
		System.out.println("Enter Ending number: ");
		int n=sc.nextInt();
		int sum=0;
		int prod=1;
		for (int i=m;i<=n ;i++ )
		{
			if (i%3==0 && i%5==0)
			{
				sum=sum+i;
				prod=prod*i;
			}
		}
		System.out.println("Sum numbers from "+m+" to "+n+" = "+sum+" and Product= "+prod);
	}
}
