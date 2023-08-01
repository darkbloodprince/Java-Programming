class PerfectNumbersBetween
{
	public static void main(String[] args) 
	{
		int sln=1;
		for (int i=1;sln<=10;i++ )
		{
			int fact=0;
			for (int j=1;j<=(i/2) ;j++ )
			{
				if(i%j==0)
				{
					fact=fact+j;
				}
			}
			if (fact==i)
			{
				System.out.println(sln+". "+i);
				sln++;
			}
		}
	}
}
