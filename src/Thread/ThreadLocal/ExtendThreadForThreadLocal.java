package Thread.ThreadLocal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExtendThreadForThreadLocal extends Thread{

	public ExtendThreadForThreadLocal(String name,ThreadLocal<String> stringThreadLocal,InheritableThreadLocal<String> inheritableThreadLocal){
		super(name);
		setThreadLocal(stringThreadLocal);
		setInheritableThreadLocal(inheritableThreadLocal);
	}
	private ThreadLocal<String> threadLocal;
	private InheritableThreadLocal<String>   InheritableThreadLocal;

	public ThreadLocal<String> getThreadLocal() {
		return threadLocal;
	}

	public void setThreadLocal(ThreadLocal<String> threadLocal) {
		this.threadLocal = threadLocal;
	}

	public InheritableThreadLocal<String> getInheritableThreadLocal() {
		return InheritableThreadLocal;
	}

	public void setInheritableThreadLocal(InheritableThreadLocal<String> listInheritableThreadLocal) {
		this.InheritableThreadLocal = listInheritableThreadLocal;
	}

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(this.getName()+"  "+i);
			// 第一次获取为空
			System.out.println(threadLocal.get());
			threadLocal.set(String.valueOf(i));
			// 第一次可以获取到父线程的
			System.out.println(InheritableThreadLocal.get());
			// 不能改变父线程的InheritableThreadLocal值，InheritableThreadLocal相当于是threadLocal的前提下把父线程的值复制一下
			InheritableThreadLocal.set(String.valueOf(i));
		}
		System.out.println("子进程中用户："+StaticThreadLocal.getUserName());
		// 修改当前用户
		StaticThreadLocal.setUserName("子进程");
		System.out.println("子进程中用户："+StaticThreadLocal.getUserName());
	}
}
