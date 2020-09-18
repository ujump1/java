package Map;

import Map.Entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class map {

    public static void main(String args[]){
        //分组
        User user1=new User(1,"余江",15);
        User user2=new User(2,"罗军",16);
        User user3=new User(3,"罗志祥",17);
        User user4=new User(4,"李军",15);
        User user5=new User(5,"余江",18);
        User user6=new User(6,"冯二",17);
        User user7=new User(7,"李四",15);
        List<User> users=new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        //List转Map
        Map<Integer,User>  usersMap =users.stream().collect(Collectors.toMap(User::getId,a->a,(k1,k2)->k1)); //a->a为值参数，表示本身，等
                                                                    // 于Function.identity(),也可以用User::getAge等，(k1,k2)->k1)表示去重
        //Map基本方法
        //put
        usersMap.put(8,new User(8,"周星驰",61));
        //put key一样的会覆盖
        usersMap.put(8,new User(8,"周星驰",60));
        //get
        System.out.println(usersMap.get(8).getAge());
        //remove
        usersMap.remove(8);
        usersMap.remove(8,new User(8,"周星驰",60));
        if (usersMap.get(8)!=null) {
            System.out.print(usersMap.get(8).getAge());
        }
        else
        {
            System.out.println("key为8的已被删除");
        }
        //遍历1
        System.out.print("遍历1 ");
       for (int key: usersMap.keySet())
       {
           User user  =usersMap.get(key);
           System.out.print(user.getId());
       }
       //遍历2
        System.out.println();
        System.out.print("遍历2 ");
        for(Map.Entry<Integer,User> entry :usersMap.entrySet()){
            int key=entry.getKey();
            User user=entry.getValue();
            System.out.print(user.getId());
        }
        //分组
        System.out.println();
        System.out.print("分组 ");
        System.out.println();
        Map<Integer,List<User>> usersGroupMap=users.stream().collect(Collectors.groupingBy(User::getAge));
        for (int key: usersGroupMap.keySet())
        {
            List<User> users1  =usersGroupMap.get(key);
            System.out.print(key+" ");
            System.out.println();
            for (User user: users1)
            {
                System.out.println(user.getId()+user.getName()+user.getAge());
            }
        }
    }
}
