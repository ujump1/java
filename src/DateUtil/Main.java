package DateUtil;

import Entity.student;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        // Calendar只有在使用任意get的时候，才会更新自己，更新自己的year，day，month等信息。
        Calendar calendar=Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, 2017);
        calendar.set(Calendar.DAY_OF_MONTH,32);
        calendar.getTime();
        //calendar.set(Calendar.MONTH, 1);
        //int month  = calendar.get(Calendar.MONTH);
      //  int day  = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.MONTH, 1);
        int firstDay=calendar.getActualMinimum(calendar.DAY_OF_MONTH);
        int lastDay=calendar.getActualMaximum(calendar.DAY_OF_MONTH);
        System.out.println(2+"月第一天是："+firstDay);
        System.out.println(2+"月最后一天是："+lastDay);
        calendar.set(Calendar.DAY_OF_MONTH, lastDay);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(calendar.getTime()));

        for(int i=0;i<10;i++){

            for(int j=0;j<5;j++) {
                if (j == 2) {
                    System.out.println("j="+j);
                    break;
                }
            }
            System.out.println(i);
            if(i==2){
                continue;
            }
            System.out.println("i="+i);
            }

//        Map<String, String> map = new HashMap<String, String>();
//        map.put("b", "4");
//        map.put("a", "5");
//        map.put("c", "3");
//        map.put("d", "5");
//        // 根据key获取 其value
//        System.out.println("通过key获取 其value");
//        System.out.println("key 'what'的value为："+map.get("a")+"\n");
//        String b = map.get("x");
//
//        String monthId="200002";
//        int year = Integer.parseInt(monthId.substring(0, 4));
//        int month = Integer.parseInt(monthId.substring(4, 6));
//        Calendar cal = Calendar.getInstance();
//        // 设置年份
//        cal.set(Calendar.YEAR, year);
//        // 设置月份
//        cal.set(Calendar.MONTH, month - 1);
//        // 获取某月最大天数
//        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//        // 设置日历中月份的最大天数
//        cal.set(Calendar.DAY_OF_MONTH, lastDay);
//        // 格式化日期
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
//        Date data=cal.getTime();
//        String lastDayOfMonth = sdf.format(data);
//        String lastDayOfMonth1 = sdf1.format(data);
//        List<student> studentList=new ArrayList<>();
//        List<student> studentList1=null;
//
//       // System.out.println(lastDay);
//        System.out.println(lastDayOfMonth);
//       // System.out.println(lastDayOfMonth1);
//       // System.out.println(cal.getTime());
//        System.out.println(data);
//      //  System.out.println(studentList);
//      //  System.out.println(studentList.size());
//      //  System.out.println(studentList1);
//       // System.out.println(studentList1.size());
//        System.out.println("Hello World!");
    }
}
