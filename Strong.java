import java.util.Scanner;
class Strong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int result=0;
		int rem=0;
		int temp=num;
		while (num!=0)
		{
			rem=num%10;
			num=num/10;
			int fact=1;
			for (int i=1;i<=rem ;i++ )
			{
				fact=fact*i;
			}
			result=result+fact;
		}
		if (temp==result)
		{
			System.out.println("Strong number");
		}
		else
			System.out.println("Not Strong number");
	}
}
