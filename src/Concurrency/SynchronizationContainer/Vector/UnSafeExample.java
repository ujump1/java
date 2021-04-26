package Concurrency.SynchronizationContainer.Vector;

import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import static java.lang.Thread.sleep;

/**
 * 多线程下导致的异常
 */
public class UnSafeExample {

	public static void main(String[] args) throws InterruptedException {
		// 声明一个vector
		Vector<Integer> vector = new Vector<>();
		for(int i=0;i<100;i++){
			vector.add(i);
		}
		Thread removeThread = new RemoveThread(vector);
		removeThread.start();
		sleep(1000);
		System.out.println(vector.size());
	}
}
