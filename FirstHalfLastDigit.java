//WAPTP First half part last digit of a given number
import java.util.Scanner;
class FirstHalfLastDigit 
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
		n=n%10;
		System.out.println("First half part first digit: "+n);
	}
}
