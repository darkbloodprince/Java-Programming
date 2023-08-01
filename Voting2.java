import java.util.Scanner;
class Voting2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		String result=(age>17)?"Eligible":"Not Eligible";
		System.out.println(result);
	}
}
