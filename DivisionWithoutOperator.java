//Find remainder using without divison operator
import java.util.Scanner;
class DivisionWithoutOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dividend:");
		int a=sc.nextInt();
		System.out.println("Enter Divisor:");
		int b=sc.nextInt();
		int q=0;
		while (a>=b)
		{
			a=a-b;
			q++;
		}
		System.out.println("Quotient= "+q+" and "+"Remainder= "+a);
	}
}
