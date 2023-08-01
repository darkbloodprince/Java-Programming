//WAPTP First half part first digit of a given number
import java.util.Scanner;
class FirstHalfFirstDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		int rem=0;
		while (temp!=0)
		{
			rem=temp%10;
			temp=temp/10;
			count++;
		}
		int div=1;
		for (int i=1;i<=count/2 ;i++ )
		{
			div=div*10;
		}
		n=n/div;
		int n1=n;
		count=0;
		while (n1!=0)
		{
			rem=n1%10;
			n1=n1/10;
			count++;
		}
		div=1;
		for (int i=1;i<=count-1 ;i++ )
		{
			div=div*10;
		}
		n=n/div;
		System.out.println("First half part first digit: "+n);
	}
}
