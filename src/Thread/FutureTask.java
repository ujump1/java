package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Future可用来接收ExecutorService.submit 和 invokeAll,接收返回值submit不阻塞，invokeAll阻塞，他们都会在get地方阻塞。
 * FutureTask 实现了了RunnableFuture其余用法参见RunnableAndCallable
 */
public class FutureTask {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long sum = 0;
        ExecutorService exec = Executors.newCachedThreadPool();
        List<Callable<Long>> callList = new ArrayList<Callable<Long>>();
        callList.add(new Callable<Long>(){
            public Long call(){
                long sum = 0;
                for(long i=0;i<50;i++){
                    sum+=i;
                }
                return sum;
            }
        });
        callList.add(new Callable<Long>(){
            public Long call(){
                long sum = 0;
                for(long i=50;i<=100;i++){
                    sum+=i;
                }
                return sum;
            }
        });
        List<Future<Long>> futureList=exec.invokeAll(callList);
        for(Future<Long> future:futureList){
            sum+=future.get();
        }
        System.out.println(sum);
        exec.shutdown();
    }
}
