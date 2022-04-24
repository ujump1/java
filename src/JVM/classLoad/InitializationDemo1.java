package JVM.classLoad;

class Grandpa1
{
	static
	{
		System.out.println("爷爷在静态代码块");
	}
}
class Father1 extends Grandpa1
{
	static
	{
		System.out.println("爸爸在静态代码块");
	}

	public static int factor = 25;

	public Father1()
	{
		System.out.println("我是爸爸~");
	}
}
class Son1 extends Father1
{
	static
	{
		System.out.println("儿子在静态代码块");
	}

	public Son1()
	{
		System.out.println("我是儿子~");
	}
}
public class InitializationDemo1
{
	public static void main(String[] args)
	{
		System.out.println("爸爸的岁数:" + Son1.factor);	//入口
	}
}