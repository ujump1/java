package Abstract;

/**
 * 接口
 * @author YJ
 * @version 1.0.0 2021/5/12
 */
// 没有构造函数
public interface InterfaceDemo {

	// 变量只能是 public static final
	String name = "123";

	// 声明的方法只能是public，默认是public abstract
	void sayWelcome();

	void sayNotWelcome();
}
