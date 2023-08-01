import java.util.Scanner;
class FactorialSum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0;
		int temp=num;
		int result=0;
		while (num!=0)
		{
			rem=num%10;
			int fact=1;
			for (int i=1;i<=rem ;i++ )
			{
				fact=fact*i;
			}
			result=result+fact;
			num=num/10;
		}
		System.out.println("Sum of Factorial of "+temp+" is "+result);
	}
}
