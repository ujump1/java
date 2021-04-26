package Concurrency;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

/**
 * 多线程下向arrayList添加元素存在null
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList arrayList  = new ArrayList();

        Thread addThread = new AddThread(arrayList,0);
        addThread.start();

        Thread addThread1 = new AddThread(arrayList,1000);
        addThread1.start();
        // 等待一下
        sleep(1000);
        for(int i =0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}



