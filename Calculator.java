import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO SIMPLE CALCULATOR");
		System.out.println("======================================");
		System.out.println((char)4+" Enter 1 for Addition");
		System.out.println((char)4+" Enter 2 for Subtraction");
		System.out.println((char)4+" Enter 3 for Multiplication");
		System.out.println((char)4+" Enter 4 for Division(Quotient)");
		System.out.println((char)4+" Enter 5 for Division(Remainder)");
		System.out.println("======================================");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: System.out.println("You selected Addition operation");
					System.out.println("Enter 1st number");
					num1=sc.nextInt();
					System.out.println("Enter 2nd number");
					num2=sc.nextInt();
					System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
					break;
			case 2: System.out.println("You selected Subtraction operation");
					System.out.println("Enter 1st number");
					num1=sc.nextInt();
					System.out.println("Enter 2nd number");
					num2=sc.nextInt();
					System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
					break;
			case 3: System.out.println("You selected Multiplication operation");
					System.out.println("Enter 1st number");
					num1=sc.nextInt();
					System.out.println("Enter 2nd number");
					num2=sc.nextInt();
					System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
					break;
			case 4: System.out.println("You selected Division (Quotient) operation");
					System.out.println("Enter 1st number");
					num1=sc.nextInt();
					System.out.println("Enter 2nd number");
					num2=sc.nextInt();
					System.out.println("Quotient of "+num1+" and "+num2+" is "+(num1/num2));
					break;
			case 5: System.out.println("You selected Division (Remainder) operation");
					System.out.println("Enter 1st number");
					num1=sc.nextInt();
					System.out.println("Enter 2nd number");
					num2=sc.nextInt();
					System.out.println("Remainder of "+num1+" and "+num2+" is "+(num1%num2));
					break;
			default: System.out.println("Enter valid input");
		}
		System.out.println("Thank you");
		System.out.println("======================================");
	}
}
