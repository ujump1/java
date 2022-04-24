package Thread.WaitNotify;

/**
 * wait/notifyAll例子
 * 调用obj的wait(), notifyAll()方法前，必须获得obj锁，也就是必须写在synchronized(obj) 代码段内。
 * @author yj
 */
public class NotifyAllWaitThreadDemo {

	private int count;

	public static void main(String[] args) {

		NotifyAllWaitThreadDemo demo = new NotifyAllWaitThreadDemo();

		Thread t1 = new Thread("t1") {
			public void run() {
				synchronized (demo) {
					for (int i = 0; i < 100; i++) {
						demo.count = i;
						if (demo.count == 50) {
							System.out.println(Thread.currentThread().getName()+"发出通知");
							//demo.notify();
							demo.notifyAll();
						}
					}
				}

			}
		};

		Thread t2 = new Thread("t2") {
			public void run() {
				while (true) {
					synchronized (demo) {
						System.out.println(Thread.currentThread().getName() + "开始等待");
						try {
							demo.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName() + "跳出等待");
					System.out.println("demo.count" + demo.count);
					break;
				}

			}
		};

		Thread t3 = new Thread("t3") {
			public void run() {
				while (true) {
					synchronized (demo) {
						System.out.println(Thread.currentThread().getName() + "开始等待");
						try {
							demo.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName() + "跳出等待");
					break;
				}

			}
		};
		t2.start();
		t3.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();

	}
}