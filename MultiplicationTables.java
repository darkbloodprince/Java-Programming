import java.util.Scanner;
class MultiplicationTables 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter min table number");
		int min=scan.nextInt();
		System.out.println("Enter max table number");
		int max=scan.nextInt();
		for (int t=min;t<=max ;t++ )
		{
			for (int i=1;i<=10 ;i++ )
			{
				System.out.println(t+" * "+i+" = "+t*i);
			}
			System.out.println("**************************************");
		}
	}
}
