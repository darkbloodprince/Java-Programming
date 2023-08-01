import java.util.Scanner;
class  Smallest
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0;
		int small=9;
		while (num!=0)
		{
			rem=num%10;
			if (rem<small)
			{
				small=rem;
			}
			num=num/10;
		}
		System.out.println("Smallest Digit: "+small);
	}
}
