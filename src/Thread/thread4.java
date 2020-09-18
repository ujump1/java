package Thread;

import java.util.concurrent.Callable;

public class thread4 implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            System.out.println(Thread.currentThread().getName()+"\t coming in");
            return 1024;
        }
    }

