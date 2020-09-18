package Map.HashMap;



import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 大屎蛋教程网-dashidan.com
 * HashMap与ConcurrentHashMap的区别于应用场景
 * Created by 大屎蛋 on 2018/5/18.
 */
//HashpMap多线程情况下的ConcurrentModificationException
//当方法检测到对象的并发修改(单线程情况也可能)，但不允许这种修改时，抛出
//
//ConcurrentModificationException异常。

//final Node<K,V> nextNode() {
//        Node<K,V>[] t;
//        Node<K,V> e = next;
//        if (modCount != expectedModCount)
//        throw new ConcurrentModificationException();
//        if (e == null)
//        throw new NoSuchElementException();
//        if ((next = (current = e).next) == null && (t = table) != null) {
//        do {} while (index < t.length && (next = t[index++]) == null);
//        }
//        return e;
//        }
//        复制代码
//        　　如果HashMap中modCount和expectedModCount不相等，则会抛出异常
//
//        查看modCount：
//        　　具体用途是记录该HashMap修改次数，比如在对一个HashMap put操作时，会对modCount进行++modCount操作（红色标注的地方）,　而在remove操作的时候，也会对modCount进行同样的操作：　HashMap迭代遍历的时候，会初始化expectedModCount=modCount，这时候对HashMap进行修改操作，modCount会+1，继续遍历的时候expectedModCount!=modCount，继而抛出java.util.ConcurrentModificationException异常。
public class hashmapdemo3 {

    public static void main(String[] args) {
        /** 全局HashMap*/
        HashMap<Integer, Integer> hashMap = new HashMap();

        /** 多线程编辑100次*/
        for (int i = 0; i < 1000; i++) {
            hashMap.put(i, i);
        }

        new Thread(new AddThread(hashMap)).start();
        new Thread(new RemoveThread(hashMap)).start();

        /** 读取线程*/
        new Thread(new IteratorThread(hashMap)).start();
        /** 输出最终结果*/
    }
}

class AddThread implements Runnable {
    Map<Integer, Integer> hashMap;

    public AddThread(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        while (true) {
            int random = new Random().nextInt();
            hashMap.put(random, random);
        }
    }
}

class RemoveThread implements Runnable {
    Map<Integer, Integer> hashMap;

    public RemoveThread(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        int random = new Random().nextInt(1000);
        while (true) {
            hashMap.remove(random);
        }
    }
}


class IteratorThread implements Runnable {

    Map<Integer, Integer> hashMap;

    public IteratorThread(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        System.out.println("------------------ " + hashMap.size());
        for (Integer value : hashMap.values()) {
//            System.out.println("value " + value);
        }
        System.out.println("+++++++++++++++++++ " + hashMap.size());
    }
}
