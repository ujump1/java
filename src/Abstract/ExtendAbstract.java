package Abstract;

/**
 * 继承抽象类
 * @author YJ
 * @version 1.0.0 2021/5/12
 */
// 继承抽象接口必须实现所有抽象方法，不然就只能定义成抽象类，接口可以实现多个，抽象类只能继承一个
public class ExtendAbstract extends AbstractDemo {

	public ExtendAbstract() {
	}

	public ExtendAbstract(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.println("");
	}

	// 可重写和调用父方法
	public void askName() {
		System.out.println("I am "+super.getName() +" what is your name");
	}
}
