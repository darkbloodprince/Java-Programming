import java.util.Scanner;
class HcfOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers one by one");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int hcf=0;
		for (int i=1;i<=n1&&i<=n2 ;i++ )
		{
			if (n1%i==0&&n2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("Hcf of "+n1+" and "+n2+" is : "+hcf);
	}
}
