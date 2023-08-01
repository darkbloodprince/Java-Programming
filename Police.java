import java.util.Scanner;
class Police 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your Gender:\n1. Male\n2. Female");
		int gen=sc.nextInt();
		if(gen==1)
		{
			System.out.println("Please Enter your Degree percentage:");
			double per=sc.nextDouble();
			if(per>59)
			{
				System.out.println("Please Enter your height in cm:");
				int hei=sc.nextInt();
				if(hei>167)
					System.out.println("Eligible for Police exam");
				else
					System.out.println("Not Eligible for Police exam since your height is less than 168");
			}
			else
				System.out.println("Not Eligible for Police exam since your percentage is less than 60");
		}
		else if(gen==2)
		{
			System.out.println("Please Enter your 12th Percentage:");
			double per1=sc.nextDouble();
			if(per1>59)
			{
				System.out.println("Please Enter your height in cm:");
				int hei1=sc.nextInt();
				if(hei1>144)
					System.out.println("Eligible for Police exam");
				else
					System.out.println("Not Eligible for Police exam since your height is less than 145");
			}
			else
				System.out.println("Not Eligible for Police exam since your percentage is less than 60");
		}
		else
			System.out.println("Please Enter correct value");
	}
}
