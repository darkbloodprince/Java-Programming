class Logical
{
	public static void main(String[] args) 
	{
		System.out.println("AND:");
		System.out.println(4<5&&5!=5);
		System.out.println(10!=10&&8>5);
		System.out.println(5==5&&6==6);
		System.out.println(6==3&&8==3);
		System.out.println("OR:");
		System.out.println(12==12||5<3);
		System.out.println(10>12||18<=20);
		System.out.println(10==10||20==20);
		System.out.println(4!=4||2!=2);
		System.out.println("NOT:");
		System.out.println(!(5!=5));
		System.out.println(!(9==9));
	}
}
