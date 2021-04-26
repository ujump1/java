package Concurrency.SynchronizationContainer.Vector;

import java.util.Vector;

public class RemoveThread extends Thread {

	private Vector<Integer> vector = new Vector<>();

	public RemoveThread(Vector<Integer> vector){
		this.vector = vector;
	}

	@Override
	public void run(){
		for(int i=0;i<vector.size();i++){
			 vector.remove(i);
		}
	}
}
