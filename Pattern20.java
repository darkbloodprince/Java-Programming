class Pattern20
{
	public static void main(String[] args) 
	{
		int n=10;
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=4;j++ )
			{
				while (true)
				{
					n++;
					int count=0;
					for (int i1=1;i1<=n ;i1++ )
					{
						if (n%i1==0)
						{
							count++;
						}
					}
					if (count==2)
					{
						System.out.print(" "+n);
						break;
					}
				}
			}
			System.out.println();
		}
	}
}
