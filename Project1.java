import java.util.Scanner;
class Project1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int rem=0;
		int sum=0;
		int product=1;
		int armstrong=n;
		while (n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n=n/10;
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+product);
		if (sum==product)
		{
			System.out.println("The given number is Spy number");
		}
		else
			System.out.println("The given number is not a Spy number");
		int temp=product;
		int rev=0;
		while (product!=0)
		{
			rem=product%10;
			rev=rev*10+rem;
			product=product/10;
		}
		if (rev==temp)
		{
			System.out.println("The given number is a Palindrome");
		}
		else
			System.out.println("The given number is not a Palindrome");
		int count=0;
		int arm=armstrong;
		while (armstrong!=0)
		{
			rem=armstrong%10;
			count++;
			armstrong=armstrong/10;
		}
		int result=0;
		int check=arm;
		while (arm!=0)
		{
			rem=arm%10;
			int power=1;
			for (int i=0;i<count ;i++ )
			{
				power=power*rem;
			}
			result=power+result;
			arm=arm/10;
		}
		if (check==result)
		{
			System.out.println("Given number is Armstrong number");
		}
		else
			System.out.println("Given number is not an Armstrong number");
	}
}
