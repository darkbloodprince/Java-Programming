import java.util.Scanner;
class Park1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO PARK");
		System.out.println("======================================");
		System.out.println("Ticket Price:");
		System.out.println((char)4+" Rs.100 for Male");
		System.out.println((char)4+" Rs.80 for Female");
		System.out.println((char)4+" Rs.20 for Transgender");
		System.out.println((char)4+" Rs.5 for Children");
		System.out.println((char)4+" Free for Senior Citezen");
		System.out.println("======================================");
		System.out.println("Enter number of Male candidates:");
		double m=sc.nextDouble();
		System.out.println("Enter number of Female candidates:");
		double f=sc.nextDouble();
		System.out.println("Enter number of Transgender candidates:");
		double t=sc.nextDouble();
		System.out.println("Enter number of Children:");
		double c=sc.nextDouble();
		System.out.println("Enter number of Senior Citezens:");
		int s=sc.nextInt();
		double can=m+f+t+c;
		if(can==1)
		{
			m=(m*100)*0.95;
			f=(f*80)*0.95;
			t=(t*20)*0.95;
			c=(c*5)*0.95;
		}
		else if(can>=2&&can<=10)
		{
			m=(m*100)*0.9;
			f=(f*80)*0.9;
			t=(t*20)*0.9;
			c=(c*5)*0.9;
		}
		else if(can>=6&&can<=10)
		{
			m=(m*100)*0.85;
			f=(f*80)*0.85;
			t=(t*20)*0.85;
			c=(c*5)*0.85;
		}
		else if(can>=11)
		{
			m=(m*100)*0.8;
			f=(f*80)*0.8;
			t=(t*20)*0.8;
			c=(c*5)*0.8;
		}
		System.out.println("Total ticket price: "+(m+f+t+c));
	}
}
