package GenericType;

/**
 *苹果
 * @author YJ
 * @version 1.0.0 2021/5/10
 */
public class Apple extends Fruit {
	// 品种类型
	private String type;

	public Apple() {
	}

	public Apple(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
