class StaticDemo
{
	static int i=0;
	public StaticDemo(){
		i++;
	}
}
class Lab93
{
	public static void main(String[] args)
	{
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		StaticDemo s4 = new StaticDemo();
		StaticDemo s5 = new StaticDemo();
		System.out.println("You have created "+ StaticDemo.i + " Object.");
	}
}