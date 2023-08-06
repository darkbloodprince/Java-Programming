//WAPTP Decimal to binary number
import java.util.Scanner;
class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int a=sc.nextInt();
		int b=0;
		while (a!=0)
		{
			if (a%2==0)
			{
				a=a/2;
				b=b*10;
			}
			else
			{
				a=a/2;
				b=b*10+1;
			}
		}
		int rem=0;
		int rev=0;
		while (b!=0)
		{
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
		}
		System.out.println("Binary value= "+rev);
	}
}
