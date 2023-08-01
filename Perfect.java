import java.util.Scanner;
class Perfect 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int fact=0;
		for (int i=1;i<=(num/2) ;i++ )
		{
			if(num%i==0)
			{
				fact=fact+i;
			}
		}
		if(fact==num)
		{
			System.out.println("Perfect number");
		}
		else
			System.out.println("Not perfect number");
	}
}
