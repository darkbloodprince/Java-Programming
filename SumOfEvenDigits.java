//WAPTP Sum of even digits of a number along with the number between m to n
import java.util.Scanner;
class SumOfEvenDigits  
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
			int sum=0;
			int rem=0;
			while (temp!=0)
			{
				rem=temp%10;
				temp=temp/10;
				if (rem%2==0)
				{
					sum=sum+rem;
				}
			}
			System.out.println(sum+" - "+num);
		}
	}
}