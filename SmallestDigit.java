//WAPTP Smallest digit of a number along with the number between 55 to 95
import java.util.Scanner;
class SmallestDigit  
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
			int n=9;
			int rem=0;
			while (temp!=0)
			{
				rem=temp%10;
				temp=temp/10;
				if (rem<n)
				{
					n=rem;
				}
			}
			System.out.println(n+" - "+num);
		}
	}
}
