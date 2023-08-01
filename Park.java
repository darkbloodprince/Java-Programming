import java.util.Scanner;
class Park 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Category type:");
		char cat=sc.next().charAt(0);
		int can;
		if(cat=='M'||cat=='m')
		{
			System.out.println("Ticket price for Male is rs:100");
			System.out.println("Enter total number of candidates:");
			can=sc.nextInt();
			System.out.println("Total ticket price is: "+(can*100));
			if(can==1)
				System.out.println("Total ticket price after discount: "+(can*100)*0.95);
			else if(can>=2&&can<=5)
				System.out.println("Total ticket price after discount: "+(can*100)*0.9);
			else if(can>=6&&can<=10)
				System.out.println("Total ticket price after discount: "+(can*100)*0.85);
			else if(can>=11)
				System.out.println("Total ticket price after discount: "+(can*100)*0.8);
		}
		else if(cat=='F'||cat=='f')
		{
			System.out.println("Ticket price for Female is rs:80");
			System.out.println("Enter total number of candidates:");
			can=sc.nextInt();
			System.out.println("Total ticket price is: "+(can*80));
			if(can==1)
				System.out.println("Total ticket price after discount: "+(can*80)*0.95);
			else if(can>=2&&can<=5)
				System.out.println("Total ticket price after discount: "+(can*80)*0.9);
			else if(can>=6&&can<=10)
				System.out.println("Total ticket price after discount: "+(can*80)*0.85);
			else if(can>=11)
				System.out.println("Total ticket price after discount: "+(can*80)*0.8);
		}
		else if(cat=='T'||cat=='t')
		{
			System.out.println("Ticket price for Transgender is rs:20");
			System.out.println("Enter total number of candidates:");
			can=sc.nextInt();
			System.out.println("Total ticket price is: "+(can*20));
			if(can==1)
				System.out.println("Total ticket price after discount: "+(can*20)*0.95);
			else if(can>=2&&can<=5)
				System.out.println("Total ticket price after discount: "+(can*20)*0.9);
			else if(can>=6&&can<=10)
				System.out.println("Total ticket price after discount: "+(can*20)*0.85);
			else if(can>=11)
				System.out.println("Total ticket price after discount: "+(can*20)*0.8);
		}
		else if(cat=='C'||cat=='c')
		{
			System.out.println("Ticket price for Children is rs:5");
			System.out.println("Enter total number of candidates:");
			can=sc.nextInt();
			System.out.println("Total ticket price is: "+(can*5));
			if(can==1)
				System.out.println("Total ticket price after discount: "+(can*5)*0.95);
			else if(can>=2&&can<=5)
				System.out.println("Total ticket price after discount: "+(can*5)*0.9);
			else if(can>=6&&can<=10)
				System.out.println("Total ticket price after discount: "+(can*5)*0.85);
			else if(can>=11)
				System.out.println("Total ticket price after discount: "+(can*5)*0.8);
		}
		else if(cat=='S'||cat=='s')
			System.out.println("Ticket price for Senior citizen is free");
		else
			System.out.println("Please enter valid input");
	}
}
