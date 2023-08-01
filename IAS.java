import java.util.Scanner;
class IAS 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>20&&age<33)
			System.out.println("Eligible for IAS Exam");
		else
			System.out.println("Not Eligible for IAS Exam");
	}
}
