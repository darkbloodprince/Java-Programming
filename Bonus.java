import java.util.Scanner;
class Bonus  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee's no of years of Experience:");
		int years=sc.nextInt();
		if(years>=3)
		{
			System.out.println("Enter Employee's Monthly Salary");
			int salary=sc.nextInt();
			if(salary<60000)
			{
				System.out.println("Employee is Eligible for Bonus");
				int bonus=salary/4;
				System.out.println("Bonus= "+bonus);
			}
			else
				System.out.println("Employee is Not Eligible for Bonus");
		}
		else
			System.out.println("Employee is Not Eligible for Bonus");
	}
}
