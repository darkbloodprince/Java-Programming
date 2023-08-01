import java.util.Scanner;
class SPYNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		int product=1;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if (sum==product)
		{
			System.out.println("Spy number");
		}
		else
			System.out.println("Not Spy number");
	}
}
