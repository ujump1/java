package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExtendThread extends Thread{
//    //可修改名字
//    public thread1(String name){
//        super(name);
//    }
//    public thread1()
//    {
//
//    }
//    public void run(){
//        for(int i=0;i<5;i++){
//            //使用线程的getName()方法可以直接获取当前线程的名称
//            System.out.println(this.getName() + "   " + i);
//        }
//    }
//    public static void main(String args[]){
//        System.out.println(Thread.currentThread().getName());
//        thread1 ttt=new thread1("ttt");
//        thread1 ttt1=new thread1();
//        ttt.run();
//        ttt1.setName("ttt1");
//        ttt1.run();
//
//    }
    public ExtendThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(this.getName()+"  "+i);
        }
    }
    public static void main(String args[]){
        System.out.println(Thread.currentThread().getName());
        ExecutorService cachedThreadPools= Executors.newCachedThreadPool();
        ExtendThread ttt=new ExtendThread("tttt");
        ttt.start();
        ExtendThread ttt1=new ExtendThread("tttt1");
        cachedThreadPools.execute(ttt1);
        cachedThreadPools.execute(ttt);
        cachedThreadPools.submit(ttt1);
        cachedThreadPools.shutdown();
    }
}
