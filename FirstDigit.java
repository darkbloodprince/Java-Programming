//WAPTP First digit of a number along with the number between 10 to 50
import java.util.Scanner;
class FirstDigit  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter Ending number: ");
		int b=sc.nextInt();
		int num,n,temp;
		for (int i=a;i<=b ;i++ )
		{
			temp=i;
			n=i;
			num=i;
			int count=0;
			while (temp!=0)
			{
				temp=temp/10;
				count++;
			}
			int div=1;
			for (int j=1;j<count ;j++ )
			{
				div=10*div;
			}
			n=n/div;
			System.out.println(n+" - "+num);
		}
	}
}
