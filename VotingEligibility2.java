import java.util.Scanner;
class VotingEligibility2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		boolean repeat=false;
		do
		{
			System.out.println("Enter your age");
			int age=scan.nextInt();
			if (age>=18)
			{
				System.out.println("You are eligible for voting");
			}
			else
			{
				System.out.println("You are not eligible for voting");
			}
			System.out.println("Do you want to check again");
			System.out.println("Enter true if YES");
			System.out.println("Enter false if NO");
			repeat=scan.nextBoolean();
		}
		while (repeat==true);
		System.out.println("Then get lost>>>>>>>>>......");
	}
}
