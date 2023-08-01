import java.util.Scanner;
class Scan
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First number");
		int n1=scan.nextInt();
		System.out.println("Enter Second number");
		int n2=scan.nextInt();
		int sum=n1+n2;
		System.out.println("Sum of given two numbers is: "+sum);
	}
}
