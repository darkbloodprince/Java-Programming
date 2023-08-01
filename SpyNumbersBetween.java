class SpyNumbersBetween
{
	public static void main(String[] args) 
	{
		int sln=1;
		for (int i=1;i<=50000 ;i++ )
		{
			int rem=0;
			int sum=0;
			int product=1;
			int num=i;
			while(num!=0)
			{
				rem=num%10;
				sum=sum+rem;
				product=product*rem;
				num=num/10;
			}
			if (sum==product)
			{
				System.out.println(sln+". "+i);
				sln++;
			}
		}
	}
}
