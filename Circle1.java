import java.util.Scanner;
class Cirle1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius value:");
		int r=sc.nextInt();
		double area=3.14*r*r;
		System.out.println(area);
	}
}
