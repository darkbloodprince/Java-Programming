import java.util.Scanner;
class HcfOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers one by one");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		int hcf=0;
		for (int i=1;i<=n1&&i<=n2&&i<=n3 ;i++ )
		{
			if (n1%i==0&&n2%i==0&&n3%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("Hcf of "+n1+", "+n2+" and "+n3+" is : "+hcf);
	}
}
