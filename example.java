class  example
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=10;
		//System.out.println(a++ + ++b + a + + b + ++a); //10+11+11+11+12
		//a=12 b=11
		//System.out.println(++a + --b + b + a + ++b + --a); //11+9+9+11+10+10
		//a=10 b=10
		System.out.println((a++ + b++)/(++a + ++b)*a+b-(--a)); 
		//a=11 b=12
		//BODMAS
	}
}
