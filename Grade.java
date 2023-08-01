import java.util.Scanner;
class Grade  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade=sc.next().charAt(0);
		if(grade=='A'||grade=='a')
			System.out.println("You secured first rank");
		else if(grade=='B'||grade=='b')
			System.out.println("You secured second rank");
		else if(grade=='C'||grade=='c')
			System.out.println("You secured first class");
		else if(grade=='D'||grade=='d')
			System.out.println("You secured second class");
		else if(grade=='E'||grade=='e')
			System.out.println("You are just passed");
		else if(grade=='F'||grade=='f')
			System.out.println("You are failed");
	}
}
