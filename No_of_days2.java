import java.util.Scanner;
class No_of_days2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month number:");
		int num=sc.nextInt();
		switch (num)
		{
		case 1:
			System.out.println("31 Days");
			break;
		case 2:
			System.out.println("28 Days");
			break;
		case 3:
			System.out.println("31 Days");
			break;
		case 4:
			System.out.println("30 Days");
			break;
		case 5:
			System.out.println("31 Days");
			break;
		case 6:
			System.out.println("30 Days");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("31 Days");
			break;
		case 11:
			System.out.println("30 Days");
			break;
		case 12:
			System.out.println("31 Days");
			break;
		default:
			System.out.println("Please enter valid month number: 1-12");
			break;
		}
	}
}
