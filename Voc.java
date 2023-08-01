import java.util.Scanner;
class Voc 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius value:");
		double r=sc.nextDouble();
		System.out.println("Enter height value:");
		double h=sc.nextDouble();
		double voc=3.14*r*r*h;
		System.out.println("Volume of Cylinder= "+voc);
	}
}
