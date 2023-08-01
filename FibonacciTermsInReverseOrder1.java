class FibonacciTermsInReverseOrder1
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(sum);
			for (int j=1;j<=100 ;j++ )
			{
				if (sum==j)
				{
					System.out.println(j);
				}
				a=b;
				b=sum;
				sum=a+b;
			}
		}
	}
}
