class PalindromeRange
{
	public static void main(String[] args) 
	{
		int sln=1;
		for (int i=1;sln<=1000;i++ )
		{
			int n=i;
			int rem=0;
			int rev=0;
			while(n!=0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if (rev==i)
			{
				System.out.println(sln+". "+i);
				sln++;
			}
		}
	}
}
