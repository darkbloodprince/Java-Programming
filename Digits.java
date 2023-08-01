import java.util.Scanner;
class Digits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int digit=0;
		if (num==0)
		{
			digit++;
		}
		while(num!=0)
		{
			digit++;
			num=num/10;
		}
		System.out.println("Digits: "+digit);
	}
}
