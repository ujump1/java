package Concurrency;

import java.util.ArrayList;

public class AddThread extends Thread {
    private  ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private  Integer begin = 0;

    public AddThread(ArrayList<Integer> arrayList,Integer begin){
        this.arrayList =arrayList;
    }
    @Override
    public void run(){
        for(int i=begin;i<begin+1000;i++){
            arrayList.add(i);
        }
    }


}
