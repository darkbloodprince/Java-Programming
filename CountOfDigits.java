//Count of digits
import java.util.Scanner;
class CountOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int count=0;
		int rem=0;
		while (n!=0)
		{
			rem=n%10;
			n=n/10;
			count++;
		}
		System.out.println("Count of digits: "+count);
	}
}
