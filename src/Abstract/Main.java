package Abstract;

public class Main {

	public static void main(String args[]){

		// 抽象类不能实例化，需要实例化就相当于继承他，并实现它
		AbstractDemo abstractDemo = new AbstractDemo() {
			@Override
			public void sayHello() {

			}
		};
		ExtendAbstract extendAbstract = new ExtendAbstract("Michael");

	}
}
