import java.util.Scanner;
class No_of_days 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month number:");
		int num=sc.nextInt();
		if (num==1||num==3||num=5||num=7||num=8||num=9||num=10||num==12)
		{
			System.out.println("31 Days");
		}
		else if (num==2)
		{
			System.out.println("28 Days");
		}
		else if (num==4||num==6||num==11)
		{
			System.out.println("30 Days");
		}
		else
			System.out.println("Please enter valid month number: 1-12");
	}
}
