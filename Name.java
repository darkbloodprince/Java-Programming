import java.util.Scanner;
class Name 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		if(name.equals("Hi"))
		{
			System.out.println("Hi");
		}
		else
		{
			System.out.println("Bye");
		}
	}
}
