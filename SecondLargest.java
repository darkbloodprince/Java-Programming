//WAPTP Second Largest digit of a number along with the number between 111 to 333
import java.util.Scanner;
class SecondLargestDigit  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter Ending number: ");
		int b=sc.nextInt();
		int num,temp;
		for (int i=a;i<=b ;i++ )
		{
			temp=i;
			num=i;
			int n=0;
			int rem=0;
			int sl=0;
			while (temp!=0)
			{
				rem=temp%10;
				temp=temp/10;
				if (rem>n)
				{
					sl=n;
					n=rem;
				}
			}
			System.out.println(sl+" - "+num);
		}
	}
}
