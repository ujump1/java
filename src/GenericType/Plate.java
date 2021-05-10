package GenericType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *盘子容器
 * @author YJ
 * @version 1.0.0 2021/5/10
 */
public class Plate<T> implements Serializable {
	private List<T> list ;
	public Plate(){}
	public void add(T item){
		if(list == null){
			list = new ArrayList<>();
		}
		list.add(item);
	}
	public T get(int x){
		return list.get(x);
	}

}
