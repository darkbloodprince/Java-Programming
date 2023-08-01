import java.util.Scanner;
class SI
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount:");
		double p=sc.nextDouble();
		System.out.println("Enter Time in years:");
		double t=sc.nextDouble();
		System.out.println("Enter Rate of Interest:");
		double r=sc.nextDouble();
		double si=(p*t*r)/100;
		System.out.println("Simple Interest= "+si);
	}
}
