//WAPTP first half of a given number in reverse order
import java.util.Scanner;
class FirstHalfReverse 
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
		count=count/2;
		int div=1;
		for (int i=1;i<=count ;i++ )
		{
			div=div*10;
		}
		n=n/div;
		while (n!=0)
		{
			rem=n%10;
			n=n/10;
			System.out.println(rem);
		}
	}
}
