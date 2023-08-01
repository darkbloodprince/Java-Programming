import java.util.Scanner;
class FactorialRange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sln=1;
		for (int i=1;sln<=num;i++ )
		{
			int rem=0;
			int temp=i;
			int result=0;
			while (temp!=0)
			{
				rem=temp%10;
				int fact=1;
				for (int j=1;j<=rem ;j++ )
				{
					fact=fact*j;
				}
				result=result+fact;
				temp=temp/10;
			}
			if (result==i)
			{
				System.out.println(sln+". "+i);
				sln++;
			}
		}
	}
}
