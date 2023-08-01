import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base value:");
		int base=sc.nextInt();
		System.out.println("Enter power value:");
		int power=sc.nextInt();
		int value=1;
		for (int i=1;i<=power ;i++ )
		{
			value=value*base;
		}
		System.out.println(base+" to the power of "+power+" is "+value);
	}
}
