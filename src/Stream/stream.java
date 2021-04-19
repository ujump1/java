package Stream;

import java.awt.*;
import java.security.acl.Group;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {

    public static void main(String args[]){
        //Stream 获取
        //① 通过集合Collection获取
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> stream = list.stream();
        //② 通过数组获取
        String[] array={"are","you","ready"};
        Stream<String> stream1= Arrays.stream(array);
        int[] arrayInt={1,2,3,4};
        Stream<Integer>  stream2=Arrays.stream(arrayInt).boxed();
        //③ 直接通过值获取
        Stream<String> arrayvalue=Stream.of("are","you","ready");
        //筛选 filter
        List<String> test=new ArrayList<>(Arrays.asList("1","2","333","4313","1"));
        List<String> fileted=test.stream().filter(e->e.equals("1")).collect(Collectors.toList());
        System.out.println("筛选");
        for(String s:fileted){
            System.out.print(s+" ");
        }
        //去重   相同的删除，部分字段相同的不能用此方法
        List<String> distinctList=test.stream().distinct().collect(Collectors.toList());
        //部分字段用这个
       // List<FarmProduceUseRate> list = list1.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o -> o.getCompanyCode() + ";" + o.getProduceName()+ ";" + o.getUseProduceName()+ ";" + o.getMatterCode()+ ";" + o.getCheckUnitNum()))), ArrayList::new));
        System.out.println(" ");
        System.out.println("去重");
        for(String s:distinctList){
            System.out.print(s+" ");
        }
        //排序
        List<String> sortedList=test.stream().sorted((Comparator.reverseOrder())).collect(Collectors.toList());
        //List的排序.reversed()是对当前结果反转，Comparator.reverseOrder()是对当前字段反转
//        List<Person> collect = list.stream().sorted(Comparator.comparing(Person::getSalary).reversed().thenComparing(Person::getGender).reversed()).collect(Collectors.toList());
//        List<Person> collect1 = list.stream().sorted(Comparator.comparing(Person::getSalary,Comparator.reverseOrder()).thenComparing(Person::getGender),Comparator.reverseOrder()).collect(Collectors.toList());
        //Collections.sort(test,(a,b)->Integer.parseInt(a)+Integer.parseInt(b));
        System.out.println(" ");
        System.out.println("排序");
        for (String s:sortedList) {
            System.out.print(s+" ");
        }
        //截取
        List<String> limitList=test.stream().limit(3).collect(Collectors.toList());
        System.out.println(" ");
        System.out.println("截取");
        for (String s: limitList) {
            System.out.print(s+" ");
        }
        //提取
        List<String> getList=test.stream().map(t->t.substring(0,1)).collect(Collectors.toList());
        System.out.println(" ");
        System.out.println("提取");
        for (String s: getList) {
            System.out.print(s+" ");
        }
        //统计
        int count=test.stream().mapToInt(t->Integer.parseInt(t)).sum();   //t->Integer.parseInt(t))这里表示根据什么统计 可以改成想要的字段 后面的类似
        System.out.println(" ");
        System.out.println("统计");
        System.out.print(count);
        //分组
        Map<Integer,List<String>> groupList=test.stream().collect(Collectors.groupingBy(s->Integer.parseInt(s)));
        System.out.println(" ");
        System.out.println("分组");
        for (Map.Entry<Integer,List<String>> entry: groupList.entrySet()){
            System.out.print(entry.getKey()+" ");
            for(String s:entry.getValue()){
                System.out.print(s+" ");
            }
            System.out.println(" ");
        }
        //多重分组，就是根据两个或多个字段分组
        Map<Integer, Map<String, List<String>>> groupMap =test.stream().collect(Collectors.groupingBy(t -> Integer.parseInt(t), Collectors.groupingBy(t -> t)));
        //多重分组统计
        List<testmodel> testmodel = new  ArrayList();
        testmodel testStreamModel = new testmodel();
        testStreamModel.setId(2);/*主键*/
        testStreamModel.setName("张三");/*姓名*/
        testStreamModel.setClasses(1);/*班级*/
        testStreamModel.setGrade(1);/*年级*/
        testStreamModel.setScore(80);/*成绩*/
        testStreamModel.setName(null);
        testmodel.add(testStreamModel);
        Map<Integer/*年级id*/, Map<Integer/*班级id*/, Double>> sumMap = testmodel.stream().collect(Collectors.groupingBy(t -> t.getGrade(), Collectors.groupingBy(t -> t.getClasses(), Collectors.summingDouble(t -> t.getScore()))));
        //跳过 skip
        List<String> skipList=test.stream().skip(1).limit(3).collect(Collectors.toList());
        System.out.println(" ");
        System.out.println("跳过加截取");
        for (String s : skipList){
            System.out.print(s+" ");
        }
        //映射Map
        List<Integer> mapList=testmodel.stream().filter(t->t.getId()!=2).map(t->(t.getId())).collect(Collectors.toList());
        System.out.println(" ");
        System.out.println("映射");
        for (Integer s : mapList){
            System.out.print(s+" ");
        }
        //findany findone 还有match 这里略
        // 并行(存在并发多线程安全问题)
        List<Integer> integers = new ArrayList<>();
        for(int i=0;i<1000;i++){
            integers.add(i);
        }
        List<Integer> integerList = new ArrayList<>();
        integers.stream().parallel().forEach(s->{
            // 这里使用不安全得List 会使最后得integerList不会是100个数字
            integerList.add(s);
        });
        for (Integer s : integers){
            System.out.println(s+" ");
        }
        for (Integer s : integerList){
            System.out.println(s+" ");
        }


    }

}
