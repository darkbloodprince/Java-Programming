import java.util.Scanner;
class Season 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Month number:");
		int num=sc.nextInt();
		switch (num)
		{
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("Winter Season");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("Summer Season");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Rainy Season");
			break;
		default:
			System.out.println("Please enter valid month number");
			break;
		}
	}
}
