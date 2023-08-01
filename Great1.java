class Great1 
{
	public static void main(String[] args) 
	{
		int n1=20;
		int n2=30;
		int n3=10;
		int large=(n1>n2&&n1>n3)?n1:(n2>n3)?n2:n3;
		System.out.println("Greater number is: "+large);
	}
}
