package Map.HashMap;



import java.util.concurrent.ConcurrentHashMap;

/**
 * 大屎蛋教程网-dashidan.com
 * HashMap与ConcurrentHashMap的区别于应用场景
 * Created by 大屎蛋 on 2018/5/18.
 */
//每次运行输出结果可能会不一致。这个是多线程操作下，不能保证插入顺序，所以插入的随机值位置不固定。输出遍历前h后的ConcurrentHashMap长度不一致。
//        这种情况说明，在遍历ConcurrentHashMap时如果遍历过程中，该集合的机构发生变化，比如put,remove数据。这时不会抛出ConcurrentModificationException，能够正常遍历完成ConcurrentHashMap.
public class hashmapdemo4 {

    public static void main(String[] args) {
        /** 全局ConcurrentHashMap*/
        ConcurrentHashMap<Integer, Integer> hashMap = new ConcurrentHashMap();

        /** 多线程编辑1000次*/
        for (int i = 0; i < 1000; i++) {
            hashMap.put(i, i);
        }

        new Thread(new AddThread(hashMap)).start();
        new Thread(new RemoveThread(hashMap)).start();

        /** 读取线程*/
        new Thread(new IteratorThread(hashMap)).start();
    }
}

