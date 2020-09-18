package Map.HashMap;



import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by bj on 2018/5/18.
 */
//Demo2类，验证ConcurrentHashMap多线程操作数据不同步.
public class hashmapdemo2 {

    public static void main(String[] args) {
        /** 全局ConcurrentHashMap*/
        ConcurrentHashMap<Integer, Integer> hashMap = new ConcurrentHashMap();
        hashMap.put(0, 0);

        /** 多线程编辑100次*/
        for (int i = 0; i < 100; i++) {
            new Thread(new EditThread(hashMap)).start();
        }

        /** 读取线程*/
        new Thread(new ReadThread(hashMap)).start();
        /** 输出最终结果*/
        System.out.println("Demo2 main value " + hashMap.get(0));
    }
}
