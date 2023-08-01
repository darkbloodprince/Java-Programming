import java.util.Scanner;
class PerfectNumbersN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int sln=1;
		for (int i=1;sln<=num;i++ )
		{
			int fact=0;
			for (int j=1;j<=(i/2) ;j++ )
			{
				if(i%j==0)
				{
					fact=fact+j;
				}
			}
			if (fact==i)
			{
				System.out.println(sln+". "+i);
				sln++;
			}
		}
	}
}
