import java.util.Scanner;
class UserSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers you want to add:");
		int num=sc.nextInt();
		System.out.println("Enter all "+num+" numbers one by one:");
		int sum=0;
		for (int i=1;i<=num ;i++ )
		{
			int num1=sc.nextInt();
			sum=sum+num1;
		}
		System.out.println("Sum of given "+num+" numbers is "+sum);
	}
}
