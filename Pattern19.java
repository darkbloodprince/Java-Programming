class Pattern19
{
	public static void main(String[] args) 
	{
		char x='A';
		int n=11;
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=1;j<=5;j++ )
			{
				if (i%2==1)
				{
					System.out.print(" "+x+" ");
					x++;
				}
				else
				{
					System.out.print(" "+n);
					n=n+2;
				}
			}
			System.out.println();
		}
	}
}
