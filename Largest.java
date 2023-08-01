import java.util.Scanner;
class Largest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0;
		int large=0;
		while (num!=0)
		{
			rem=num%10;
			if (rem>large)
			{
				large=rem;
			}
			num=num/10;
		}
		System.out.println("Largest Digit: "+large);
	}
}
