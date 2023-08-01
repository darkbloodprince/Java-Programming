import java.util.Scanner;
class SumLargestSmallest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0;
		int large=0;
		int small=9;
		int sum=0;
		int temp=num;
		while (num!=0)
		{
			rem=num%10;
			if (rem>large)
			{
				large=rem;
			}
			if (rem<small)
			{
				small=rem;
			}
			num=num/10;
		}
		sum=large+small;
		System.out.println("Sum of Largest "+large+" and Smallest "+small+" is "+sum);
		int result=0;
		int rem1=0;
		int temp1=temp;
		while (temp!=0)
		{
			rem1=temp%10;
			temp=temp/10;
			int fact=1;
			for (int i=1;i<=rem1 ;i++ )
			{
				fact=fact*i;
			}
			result=result+fact;
		}
		if (temp1==result)
		{
			System.out.println("Strong number");
		}
		else
			System.out.println("Not Strong number");
	}
}
