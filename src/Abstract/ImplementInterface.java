package Abstract;

/**
 * 接口实现
 * @author YJ
 * @version 1.0.0 2021.5/12
 */
// 必须实现所有方法
public class ImplementInterface implements InterfaceDemo {
	@Override
	public void sayWelcome() {
		System.out.println("I am "+name +" what is your name");
	}

	@Override
	public void sayNotWelcome() {
		System.out.println("I am "+name +" what is your name");
	}
}
