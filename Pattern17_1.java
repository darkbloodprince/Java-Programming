class Pattern17_1
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5;j++ )
			{
				if (j==1||j==5)
				{
					System.out.print(" "+(char)3+" ");
				}
				else if (i==j)
				{
					System.out.print(" "+(char)3+" ");
				}
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
