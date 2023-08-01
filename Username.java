import java.util.Scanner;
class Username 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("How many times you want to print:");
		int n=sc.nextInt();
		for (int i=0;i<n ;i++ )
		{
			System.out.println(name);
		}
	}
}
