package GenericType;


/**
 * 泛型学习
 * 参考 https://shuyi.tech/archives/head-first-of-java-generic
  */

public class Main {

	public static void main(String args[]){
		// 1.编译时类型和运行时类型
		// 这里编译时apple是Fruit，但是运行时apple还是是Apple类型
		Fruit apple = new Apple("红富士");
		Class appleClass = apple.getClass(); // 这里appleClass是Apple
		Apple apple1 = new Apple("红富士1");
		// 也可以直接转换
		apple1 = (Apple) apple; // apple1.getType 是红富士
		// 2.泛型的向上转型
		Plate<Fruit> plate = new Plate<>();
		plate.add(new Fruit());
		plate.add(new Apple()); // 可以加苹果哟
		// Java并不支持支持泛型的向上转型，所以不能够使用上面的写法，这样的写法在Java中是不被支持的。
		// Plate<Fruit> plate1 = new Plate<Apple>(); // 这样定义是不行的
		// 使用泛型通配符，来向上转型
		Plate<? extends Fruit> plate1 = new Plate<Apple>(); // extends通配符无法向 Plate 中添加任何对象，只能从中读取对象
		//plate1.add(new Apple()); //Compile Error
		plate1.get(0);    // Compile Success
		Plate<? super Apple> plate2 = new Plate<Fruit>(); // super通配符可以存入对象，但是取出对象的时候受到限制。
		plate2.add(new Apple());
		// plate2.add(new Fruit()); //Error

		// PECS 原则
		// 对于 extends 通配符，我们无法向其中加入任何对象，但是我们可以进行正常的取出。
		// 对于 super 通配符，我们可以存入 T 类型对象或 T 类型的子类对象，但是我们取出的时候只能用 Object 类变量指向取出的对象。
		// 从上面的总结可以看出，extends 通配符偏向于内容的获取，而 super 通配符更偏向于内容的存入。我们有一个 PECS 原则（Producer Extends Consumer Super）很好的解释了这两个通配符的使用场景。
		//Producer Extends 说的是当你的情景是生产者类型，需要获取资源以供生产时，我们建议使用 extends 通配符，因为使用了 extends 通配符的类型更适合获取资源。
		//Consumer Super 说的是当你的场景是消费者类型，需要存入资源以供消费时，我们建议使用 super 通配符，因为使用 super 通配符的类型更适合存入资源。
		//但如果你既想存入，又想取出，那么你最好还是不要使用 extends 或 super 通配符。

		System.out.println("结束");
	}
}
