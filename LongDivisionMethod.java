import java.util.Scanner;
class LongDivisionMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Divisor:");
		int divisor=sc.nextInt();
		System.out.println("Enter Dividend:");
		int dividend=sc.nextInt();
		while(divisor!=0)
		{
			int rem=dividend%divisor;
			System.out.println("Remainder: "+rem);
			dividend=divisor;
			System.out.println("Dividend: "+dividend);
			divisor=rem;
			System.out.println("Divisor: "+divisor);
		}
		System.out.println(dividend);
	}
}
