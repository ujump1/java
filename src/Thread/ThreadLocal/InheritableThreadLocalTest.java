package Thread.ThreadLocal;

import java.util.ArrayList;
import java.util.List;

public class InheritableThreadLocalTest {



	public static void main(String args[]) throws InterruptedException {
		System.out.println("当前用户:"+StaticThreadLocal.getUserName());
		ThreadLocal<String> s = new ThreadLocal<>();
		s.set("ThreadLocal");
		InheritableThreadLocal<String> s1 = new InheritableThreadLocal<>();
		s1.set("ThreadLocal");
		Thread thread = new ExtendThreadForThreadLocal("测试InheritableThreadLocal",s,s1);
		thread.start();
		Thread.sleep(1000);
		System.out.println(s.get());
		// s1不会变
		System.out.println(s1.get());
		System.out.println("子进程修改用户后父进程当前用户:"+StaticThreadLocal.getUserName());

		// 修改当前用户
		StaticThreadLocal.setUserName("父进程");
		System.out.println("当前用户:"+StaticThreadLocal.getUserName());
		Thread thread1 = new ExtendThreadForThreadLocal("测试InheritableThreadLocal1",s,s1);
		thread1.start();
		Thread.sleep(1000);
		System.out.println(s.get());
		// s1不会变
		System.out.println(s1.get());
		System.out.println("子进程修改当前用户:"+StaticThreadLocal.getUserName());
	}


}
