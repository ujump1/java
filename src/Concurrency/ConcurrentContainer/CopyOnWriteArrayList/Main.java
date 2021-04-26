package Concurrency.ConcurrentContainer.CopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWriteArrayList学习：主要使用在读多写少的场景，因为耗用内存大
 */
public class Main {

	public static void main(String args[]){
		// 1. iterator
		//  CopyOnWriteArrayList的iterator不是直接继承Iterator接口，而是有个内部类COWIterator来实现了继承Iterator的ListIterator接口
		CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		for(int i=0;i<100;i++){
			copyOnWriteArrayList.add(i);
		}
		// 删除操作,使用增强for循环，增强for循环的下一个是使用的Iterator（内部实现类COWIterator） 的hasNext和Next方法，不会报错（modeCount的错)
		for(Integer integer:copyOnWriteArrayList){
			copyOnWriteArrayList.remove(integer);
		}

		for(int i=0;i<100;i++){
			copyOnWriteArrayList.add(i);
		}
		// 删除操作,使用Iterator（内部实现类COWIterator）
		Iterator iterator = copyOnWriteArrayList.iterator();
		while(iterator.hasNext()){
			Integer integer = (Integer) iterator.next();
			// 和ArrayList 不同的是这里不能用iterator.remove()方法，因为COWIterator是生成一个快照，是final的，不能改变,调用一次就会生成一个新的
			copyOnWriteArrayList.remove(integer);
			// 这个方法是不能用的,直接抛异常
			iterator.remove();
		}
		System.out.println(copyOnWriteArrayList.size());

	}


}
