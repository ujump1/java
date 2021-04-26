package Concurrency.SynchronizationContainer.Vector;

import java.util.Vector;

/**
 * 获取最后一个元素
 */
public class GetThread extends Thread {

	private Vector<Integer> vector = new Vector<>();

	public GetThread(Vector<Integer> vector){
		this.vector = vector;
	}

	@Override
	public void run() {
		for(int i=0;i<vector.size();i++){
			Integer integer = vector.get(i);
		}
	}

}
