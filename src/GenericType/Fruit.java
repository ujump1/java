package GenericType;

import java.io.Serializable;

/**
 *水果类
 * @author YJ
 * @version 1.0.0 2021/5/10
 */
public class Fruit implements Serializable {

	// 名称
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
