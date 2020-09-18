package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class thread3 {
    public static void main(String args[]){
        FutureTask<Integer> task=new FutureTask<>(()->{System.out.println(Thread.currentThread().getName() + "   " + "开始执行任务！");
        return 0;});
        new Thread(task,"线程1 ").start();

        thread4 callT=new thread4();
        FutureTask<Integer> task1=new FutureTask<>(callT);
        new Thread(task1,"线程2").start();

        thread4 callT1=new thread4();
        FutureTask<Integer> task11=new FutureTask<>(callT);
        ExecutorService executor = Executors.newCachedThreadPool();
        executor.submit(task11);
        try
        {
            System.out.print(task.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
