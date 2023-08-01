import java.util.Scanner;
class Circle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius value:");
		int r=sc.nextInt();
		double area=(3.14D)*r*r;
		System.out.println(area);
	}
}
