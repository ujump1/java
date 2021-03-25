package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class RunnableAndCallable {
    public static void main(String args[]){
        //1 callable 使用FutureTask包装变成runnable，再使用Thread.start启动可以获得结果，返回0
        FutureTask<Integer> callTask=new FutureTask<>(()->{System.out.println(Thread.currentThread().getName() + "   " + "开始执行任务！");
        return 0;});
        new Thread(callTask,"线程1 ").start();

        // 2.和1一样，callable 使用FutureTask包装变成runnable，再使用Thread.start启动可以获得结果,返回1024
        ImplementsCallable call=new ImplementsCallable();
        FutureTask<Integer> callTask1=new FutureTask<>(call);
        new Thread(callTask1,"线程2").start();

        // 3.callable使用ExecutorService.submit方法可以获取到返回值
        ImplementsCallable call1=new ImplementsCallable();
        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<Integer> callTask2 = (FutureTask<Integer>) executor.submit(call1);


        // 4.runnable用ExecutorService.submit 返回的是空的,但是runnable本身是可以取到返回值的
        ImplementsCallable call3=new ImplementsCallable();
        FutureTask<Integer> callTask3=new FutureTask<>(call3);
        FutureTask<Integer> callTask4 = (FutureTask<Integer>) executor.submit(callTask3);

        try
        {
            System.out.println("使用Thread启动runnable：");
            System.out.println(callTask.get());
            System.out.println("使用Thread启动runnable：");
            System.out.println(callTask1.get());
            System.out.println("使用ExecutorService.submit启动callable：");
            System.out.println(callTask2.get());
            System.out.println("使用ExecutorService.submit启动runnable：");
            System.out.println(callTask3.get());
            System.out.println("使用ExecutorService.submit启动runnable,返回：");
            System.out.println(callTask4.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
