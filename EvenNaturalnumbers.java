import java.util.Scanner;
class EvenNaturalnumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter minimum range:");
		int m=sc.nextInt();
		System.out.println("Enter maximum range:");
		int n=sc.nextInt();
		for (int i=m;i<=n ;i++ )
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
