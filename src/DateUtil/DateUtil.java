package DateUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {

    /**
     * 输入yyyymm的月份字符串，输出yyyy-mmd-d该月最后一天
     * @param yearmonth
     * @return
     */
    public static String lastDayMonth(String yearmonth){
        int year = Integer.parseInt(yearmonth.substring(0, 4));
        int month = Integer.parseInt(yearmonth.substring(4, 6));
        Calendar cal = Calendar.getInstance();
        // 设置年份
        cal.set(Calendar.YEAR, year);
        // 设置月份
        cal.set(Calendar.MONTH, month - 1);
        //设置1号，在31号获取天数只有30号和29号的会出错
        cal.set(Calendar.DAY_OF_MONTH, 1);
        // 获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        // 设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf.format(cal.getTime());
        return lastDayOfMonth;
    }

    /**
     * 输入yyyymm的月份字符串，输出yyyy-mm-dd该月第一天
     * @param yearmonth
     * @return
     */
    public static String FirstDayMonth(String yearmonth){
        int year = Integer.parseInt(yearmonth.substring(0, 4));
        int month = Integer.parseInt(yearmonth.substring(4, 6));
        Calendar cal = Calendar.getInstance();
        // 设置年份
        cal.set(Calendar.YEAR, year);
        // 设置月份
        cal.set(Calendar.MONTH, month - 1);
        // 设置日历中月份的第一天
        cal.set(Calendar.DAY_OF_MONTH, 1);
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String firstDayOfMonth = sdf.format(cal.getTime());
        return firstDayOfMonth;
    }

}
