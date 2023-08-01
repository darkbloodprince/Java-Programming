//WAPTP Last digit of a number along with the number between 100 to 250
import java.util.Scanner;
class LastDigit  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Starting number: ");
		int a=sc.nextInt();
		System.out.println("Enter Ending number: ");
		int b=sc.nextInt();
		int num,n;
		for (int i=a;i<=b ;i++ )
		{
			num=i;
			n=i;
			n=n%10;
			System.out.println(n+" - "+num);
		}
	}
}
