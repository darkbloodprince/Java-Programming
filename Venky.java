class Venky 
{
	public static void main(String[] args) 
	{
		int a=55;
		int b=37;
		System.out.println(test1(a,b));
		System.out.println(test2(a,b));
		System.out.println(test3(a,b));
		System.out.println(test4(a,b));
		System.out.println(test5(a,b));
	}
	public static int test1(int a,int b)
	{
		return (a++ + --a);
	}
	public static int test2(int a,int b)
	{
		return (--b + ++b);
	}
	public static int test3(int a,int b)
	{
		return (a++ + ++b + a + b + b-- + ++a);
	}
	public static int test4(int a,int b)
	{
		return (++a + --b + b + a + ++b + --a);
	}
	public static int test5(int a,int b)//a=55 b=37
	{
		return ((a++ + b++)/(++a + ++b)*a+b-(--a));//
		//a=5 b=38
		//BODMAS
	}
}


