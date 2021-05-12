package Abstract;

/**
 * 抽象类
 * @author YJ
 * @version 1.0.0 2021/5/12
 */
// 含有abstract修饰的类是抽象类
public abstract class AbstractDemo {

	//抽象类可以有普通属性
	private String name;

	// 抽象类中有构造方法，当然类中都有默认的构造方法，但不能实例化，接口根本无构造函数
	public AbstractDemo() {
	}

	public AbstractDemo(String name) {
		this.name = name;
	}

	// 抽象类中可以有非抽象方法，接口不行，接口中的都是默认public abstract
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sayHello();

	public  void askName(){
		System.out.println("I am "+name +" what is your name");
	}
	// 抽象类中还可以有静态方法,接口不行
	public static void sayGoodBye(){
		System.out.println("good bye");
	}

}
