import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers one by one:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		for (int i=1;true ;i++ )
		{
			if (num1*i%num2==0)
			{
				System.out.println("LCM of "+num1+" and "+num2+" is "+num1*i);
				break;
			}
		}
	}
}
