package Otional;

import Map.Entity.User;

import java.util.Optional;
import java.util.function.Consumer;

public class optional {

    public static void main (String args[]){
        // 参数不能是null
        Optional<Integer> optional11 = Optional.of(1);

        // 参数可以是null
        Optional<Integer> optional12 = Optional.ofNullable(null);

        // 参数可以是非null
        Optional<Integer> optional3 = Optional.ofNullable(2);

        Optional<Integer> optional1 = Optional.ofNullable(null);
        Optional<Integer> optional2 = Optional.ofNullable(null);
        System.out.println(optional1 == optional2);// true
        System.out.println(optional1 == Optional.<Integer>empty());// true

        Object o1 = Optional.<Integer>empty();
        Object o2 = Optional.<String>empty();
        System.out.println(o1 == o2);// true
        // isPresent判断值是否存在
        System.out.println(optional1.isPresent() == true);
        System.out.println(optional2.isPresent());

        Optional<Integer> optional123 = Optional.ofNullable(1);
        Optional<Integer> optional22 = Optional.ofNullable(null);

        // 如果不是null,调用Consumer
        optional123.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("value is " + t);
            }
        });

        // null,不调用Consumer
        optional22.ifPresent(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("value is " + t);
            }
        });
        //orElse 如果optional对象保存的值不是null，则返回原来的值，否则返回value
        Optional<Integer> optional15 = Optional.ofNullable(1);
        Optional<Integer> optional25 = Optional.ofNullable(null);

        System.out.println(optional15.orElse(1000) == 1);// true
        System.out.println(optional25.orElse(1000) == 1000);// true


        //orElseGet 功能与orElse一样，只不过orElseGet参数是一个对象
        Optional<Integer> optional16 = Optional.ofNullable(1);
        Optional<Integer> optional26 = Optional.ofNullable(null);

        System.out.println(optional16.orElseGet(() -> {
            return 1000;
        }) == 1);//true

        System.out.println(optional26.orElseGet(() -> {
            return 1000;
        }) == 1000);//true

        //orElseThrow()：值不存在则抛出异常，存在则什么不做，有点类似Guava的Precoditions
        Optional<Integer> optional17 = Optional.ofNullable(1);
        Optional<Integer> optional27 = Optional.ofNullable(null);
        //这里未捕获异常 实际要捕获的
//        //optional17.orElseThrow(()->{throw new IllegalStateException();});
//
//        try
//        {
//            // 抛出异常
//            optional27.orElseThrow(()->{throw new IllegalStateException();});
//        }
//        catch(IllegalStateException e )
//        {
//            e.printStackTrace();
//        }



        //正确使用,比如get函数



    }
    //正确使用,比如get函数
    public String getName(User u)
    {
        if (u==null){
            return "unknow";
        }
        else
            return u.getName();

    }
    //使用Optional
    public String getName1(User u)
    {
      Optional<User> u1=Optional.ofNullable(u);
      return u1.map(user -> user.getName()).orElse("unknow");

    }
}
