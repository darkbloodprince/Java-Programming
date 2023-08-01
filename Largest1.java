class Largest1
{
	public static void main(String[] args) 
	{
		//int n=054321;
		//int n=08;
		int n=07341;
		int rem=0;
		int large=0;
		int small=9;
		while (n!=0)
		{
			rem=n%10;
			System.out.println("Rem: "+rem);
			if (large<rem)
			{
				large=rem;
			}
			if (small>rem)
			{
				small=rem;
			}
			n=n/10;
		}
		System.out.println("Largest digit: "+large);
		System.out.println("Small digit: "+small);
	}
}
