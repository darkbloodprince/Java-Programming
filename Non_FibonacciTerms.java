class Non_FibonacciTerms 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=0;i<=100 ;i++ )
		{
			if (i!=sum)
			{
				System.out.println(i);
			}
			else
			{
				sum=a+b;
				a=b;
				b=sum;
			}
		}
	}
}
