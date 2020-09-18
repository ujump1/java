package Concurrency;

import java.util.ArrayList;

public class inserData {
    private  ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public synchronized void  insert(Thread thread){
        for(int i=0;i<20;i++){
            System.out.println(thread.getName()+"在插入数据"+i);
            arrayList.add(i);
        }
    }
    public  void  insert1(Thread thread){
        for(int i=20;i<40;i++){
            System.out.println(thread.getName()+"在插入数据"+i);
            arrayList.add(i);
        }
    }
}
