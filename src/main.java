import Entity.student;
import Map.Entity.User;
import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class main {
    public static void main(String args[]) throws ParseException, IOException, InterruptedException {


        List<String> list1 = new ArrayList();
        list1.add("123");
        // List不要用等于（对象赋值都不要用等于赋值)，是直接指向同一个列表
        List<String> list2 = new ArrayList<>();
        list2=list1;
        List<String> list3 = list1;

        int a111 =2;
        int b111 = a111;
        a111 = 1;

        Integer a1111 =2;
        Integer b1111 = a1111;
        a1111 = 1;



        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        int size = copyOnWriteArrayList.size();
        copyOnWriteArrayList.add(123);
        copyOnWriteArrayList.add(456);
        Iterator iterator = copyOnWriteArrayList.iterator();
        while(iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
            Boolean b  = copyOnWriteArrayList.remove(integer);
        }




        Map<String,String> stringStringMap = new HashMap<>(16);
        stringStringMap.put("1","1");
        stringStringMap.put("2","1");
        stringStringMap.put("3","1");
        stringStringMap.put("4","1");
        stringStringMap.put("5","1");
        stringStringMap.put("6","1");
        stringStringMap.put("17","1");
        stringStringMap.put("18","1");
        stringStringMap.put("19","1");
        stringStringMap.put("20","1");
        stringStringMap.put("21","1");


        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");



        for (int j=0; j < 10; j++ ){
            if(j==1){
                continue;
            }
            System.out.println(j);
        }


        long expires = System.currentTimeMillis();
        Thread.sleep(10);
        long expires1 = System.currentTimeMillis();


        Map<String,String> invoiceCodeAndNumber = new HashMap<>();
        invoiceCodeAndNumber.put("","");

        student student1 = new student();
        student1.setName("123");
        student student12 = new student();
        student12.setName("123");
        Map <student,String>  map1= new HashMap<>();
        map1.put(student1,"1");

        Map <student,String>  map2= new HashMap<>();
        map2.put(student12,"2");
        for(student student : map1.keySet()){
            map2.get(student);
        }

        String test1111 = "";
        String test1112 = "123";
        test1111 = test1112;
        test1112 = "123445";

        BigDecimal bigDecimal11111= new BigDecimal("1.111");
        BigDecimal bigDecimal11112 = bigDecimal11111.setScale(-1);
        Calendar now = Calendar.getInstance();
        String timeStampNow = String.valueOf(now.getTime().getTime());
        now.add(Calendar.MINUTE, 5);
        String timeStampAfter = String.valueOf(now.getTime().getTime());
        now.add(Calendar.MINUTE,-10);//减去五分钟
        String timeStampBefore = String.valueOf(now.getTime().getTime());
        System.out.println(timeStampBefore);
        System.out.println(timeStampNow);
        System.out.println(timeStampAfter);

        String sqdh = "A123-1-1";
        if( sqdh.contains("-") && sqdh.length()>1) {
            String oaSerialnumber = sqdh.substring(1,sqdh.indexOf("-"));
        }

        BigDecimal amount123 =new BigDecimal("100");
        BigDecimal bigDecimalnull = null;
        int aaaaaaa = amount123.divide(bigDecimalnull).intValue();


        double numericCellValue = 1111111111.1;
         new BigDecimal(Double.toString(numericCellValue)).toString();

        Calendar calendarNow = Calendar.getInstance();
        calendarNow.set(Calendar.YEAR,calendarNow.get(Calendar.YEAR)-1);
        calendarNow.add(Calendar.MINUTE,-1);
        Date dateNow = calendarNow.getTime();
        Date datNow1 = new Date();
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss");
        String datedate = dateFormat2.format(dateNow);


        Map<String,String> map111 = new HashMap();
        String sInMap =  map111.get("1");
        student studentTest = new student();

        String s12311 =null;
        s12311= (s12311 == null ? "":s12311)+"123";
        s12311 = s12311.substring(0,1);
        s12311 = s12311 + "\n"+"2";
        BigDecimal halfUp1 = new BigDecimal("1.411");
        BigDecimal halfUp3 = halfUp1.setScale(3, BigDecimal.ROUND_HALF_UP);
        halfUp3 = halfUp3.setScale(2,BigDecimal.ROUND_HALF_UP);
        BigDecimal halfUp2 = new BigDecimal("1.6");
        int halfUp11 = halfUp1.setScale(0,BigDecimal.ROUND_HALF_UP).intValue();
        int halfUp12 = halfUp2.setScale(0,BigDecimal.ROUND_HALF_UP).intValue();

        String spilt123="1";
        List<String> idList1111 = Arrays.asList(spilt123.split(","));
        List<String> idList1112 = new ArrayList<>();
        idList1112.addAll(idList1111);   // 用addAll 来赋值 如果用等于的话 两个列表其实就是一个




        BigDecimal amount1 =new BigDecimal("100");

        amount1=  amount1.multiply(new BigDecimal("0")).divide(new BigDecimal("100"), 2, 2);
        amount1 = new BigDecimal("0").divide(new BigDecimal("100"));

        StringBuilder DK = new StringBuilder();
        String nnnnn = null;
        DK.append(nnnnn);
        String Dks = DK.toString();

        String indexString = "aaabbcddadaaabbcm";
        int index = indexString.indexOf("aabbc");
        BigDecimal temp = new BigDecimal("11,222.00".replace(",",""));
        //  if里面不能传null
        Boolean testttt = null;
        if(testttt){
           System.out.println("123");
        }
        String skey = "";
        String skey2 = "1";
        System.out.println(skey.compareTo(skey2));




        String integerTest = "1";
        Integer integerTest1 = 1000;
        System.out.println(integerTest1.equals(1000));

        String yearmonth="201902";
        int adad = yearmonth.indexOf("2");
        int year = Integer.parseInt(yearmonth.substring(0, 4));
        int month = Integer.parseInt(yearmonth.substring(4, 6));

        Calendar cal = Calendar.getInstance();
        // 设置年份
        cal.set(Calendar.YEAR, year);
        // 设置月份
        cal.set(Calendar.MONTH, month - 1);

        cal.set(Calendar.DAY_OF_MONTH, 1);
        // 获取某月最大天数
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        // 设置日历中月份的最大天数
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //格式化日期
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfMonth = sdf2.format(cal.getTime());
        String equals ="111";
        equals.equals("1111");

        User user11=new User(1,"1",1);
        User user12=new User(1,"1",1);
        User user13=new User(1,"12",12);
        List<User> userList=new ArrayList<>();
        userList.add(user11);
        userList.add(user12);
        userList.add(user13);
        System.out.println(userList);
        System.out.println(userList.toString());
        List<String> tttttttt= new ArrayList<>();
        tttttttt.add("1");
        tttttttt.add("2");
        System.out.println(tttttttt.toString());
        List<User> userLis1t=new ArrayList<>();
        userLis1t.add(user11);
        List<List<User>> xx =new ArrayList<>();
        xx.add(userLis1t);
        xx.add(userList);
        userList=xx.stream().flatMap(i -> i.stream()).collect(Collectors.toList());

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.MONTH,12);
       String mxt= new StringBuilder("CMS")
                .append(String.valueOf(calendar1.get(Calendar.YEAR)))
                .append(String.format("%02d", calendar1.get(Calendar.MONTH) + 1))
                .append(String.format("%04d", 1 + 1))
                .toString();

        Integer s111111 = null;
//        int sssssssssssss= s111111.intValue();

//        Pattern pattern = Pattern.compile("[0-9]{4}[-][0-9]{1,2}[-][0-9]{1,2}");
//        String patterns =null;
//        User user =new User();
//        if (pattern.matcher("").matches()) {
//            System.out.println("111");
//        }
//
//        String key1="eyJSRVFVRVNUX0NPTU1PTl9GUEtKIjogeyJDQUxMQkFDS19VUkwiOiIiLCJTS1BfTk8iOiI2NjE4MTE4MTMzNTMiLCJGUFFRTFNIIjogIjIwMjAwNTE5MTMyODMwNzY4ODAwIiwiRlBMWERNIjogIjAwNCIsIlpTRlMiOiAiMCIsIktQTFgiOiAiMSIsIlhTRl9OU1JTQkgiOiAiOTE1MTAxMjQzOTY5NDM1MjJIIiwiWFNGX01DIjogIuWbm+W3neaWsOWNjuilv+S5s+S4muaciemZkOWFrOWPuCIsIlhTRl9EWkRIIjogIuaIkOmDveW4gumDq+mDveWMuuW3neiPnOWbreWMuuawuOWFtOS4nOi3rznlj7cwMjgtODc5Njg4NjYiLCJYU0ZfWUhaSCI6ICLkuK3lm73lhpzkuJrpk7booYzogqHku73mnInpmZDlhazlj7jpg6vljr/lronlvrfmlK/ooYwyMjg1NzUwMTA0MDAwMzU4NSIsIkdNRl9OU1JTQkgiOiAiOTE1MTAxMDQzNDMwNTg4MjkxIiwiR01GX01DIjogIuaIkOmDveato+Wkp+WNnOWzsOi0uOaYk+i/numUgeaciemZkOWFrOWPuCIsIkdNRl9EWkRIIjogIuaIkOmDveW4gumUpuaxn+WMuuaYreW/oOeloOihlzg45Y+3MeW5ojTlsYIwMjgtODUxMDA3MjIiLCJHTUZfWUhaSCI6ICLkuK3lm73lhpzkuJrpk7booYzmiJDpg73luILlhYnljY7mlK/ooYwyMjgwNDEwMTA0MDAyNjkzNiIsIkdNRl9TSkgiOiAiMTgxODA0ODUxODIiLCJHTUZfRFpZWCI6ICIiLCJGUFRfWkgiOiAiIiwiV1hfT1BFTklEIjogIiIsIktQUiI6ICLnjovmrKIiLCJTS1IiOiAi6YKT6JOJIiwiRkhSIjogIuaImua1t+aihSIsIllGUF9ETSI6ICI1MTAwMTkzMTMwIiwiWUZQX0hNIjogIjI1MTQ5NzA1IiwiSlNISiI6ICItNTAxNC4xOSIsIkhKSkUiOiAiLTQ2MDAuMTEiLCJISlNFIjogIi00MTQuMDgiLCJLQ0UiOiAiIiwiQloiOiAiNTEwMDE5MzEzMCAyNTE0OTcwNSIsIkhZTFgiOiAiMCIsIkJZMSI6ICIiLCJCWTIiOiAiIiwiQlkzIjogIiIsIkJZNCI6ICIiLCJCWTUiOiAiIiwiQlk2IjogIiIsIkJZNyI6ICIiLCJCWTgiOiAiIiwiQlk5IjogIiIsIkJZMTAiOiAiIiwiV1hfT1JERVJfSUQiOiAiIiwiV1hfQVBQX0lEIjogIiIsIlpGQl9VSUQiOiAiIiwiVFNQWiI6ICIwMCIsIlFEQloiOiAiMSIsIlRaREJIIjogIjUxMDEwNDIwMDUwMjA5MDkiLCJDT01NT05fRlBLSl9YTVhYUyI6IHsiQ09NTU9OX0ZQS0pfWE1YWCI6IFt7IkZQSFhaIjogIjAiLCJTUEJNIjogIjEwMzAyMDQwMTAwMDAwMDAwMDAiLCJaWEJNIjogIiIsIllIWkNCUyI6ICIiLCJMU0xCUyI6ICIiLCJaWlNUU0dMIjogIiIsIlhNTUMiOiAi5Y2O6KW/5bGL6aG255uS5paw6bKc5bGL57qv54mb5aW2NTAwbWwiLCJHR1hIIjogIjUwMG1sIiwiRFciOiAi55uSIiwiWE1TTCI6ICItMTgiLCJYTURKIjogIjYuODUyNzc3NzgiLCJTTCI6ICIwLjA5IiwiU0UiOiAiLTExLjExIiwiWE1KRSI6ICItMTIzLjM1IiwiQlkxIjogIiIsIkJZMiI6ICIiLCJCWTMiOiAiIiwiQlk0IjogIiIsIkJZNSI6ICIifSx7IkZQSFhaIjogIjAiLCJTUEJNIjogIjEwMzAyMDQwMTAwMDAwMDAwMDAiLCJaWEJNIjogIiIsIllIWkNCUyI6ICIiLCJMU0xCUyI6ICIiLCJaWlNUU0dMIjogIiIsIlhNTUMiOiAi5Y2O6KW/5bGL6aG255uS5paw6bKc5bGL57qv54mb5aW2OTgwbWwiLCJHR1hIIjogIjk4MG1sIiwiRFciOiAi55uSIiwiWE1TTCI6ICItOTciLCJYTURKIjogIjExLjMzOTM4MTQ0IiwiU0wiOiAiMC4wOSIsIlNFIjogIi05OSIsIlhNSkUiOiAiLTEwOTkuOTIiLCJCWTEiOiAiIiwiQlkyIjogIiIsIkJZMyI6ICIiLCJCWTQiOiAiIiwiQlk1IjogIiJ9LHsiRlBIWFoiOiAiMCIsIlNQQk0iOiAiMTAzMDIwNDAxMDAwMDAwMDAwMCIsIlpYQk0iOiAiIiwiWUhaQ0JTIjogIiIsIkxTTEJTIjogIiIsIlpaU1RTR0wiOiAiIiwiWE1NQyI6ICLmlrDluIzmnJso5Y2O6KW/KeWxi+mhtuebkjI05bCP5pe26bKc54mb5aW2OTUwbWwiLCJHR1hIIjogIjk1MG1sIiwiRFciOiAi55uSIiwiWE1TTCI6ICItODEiLCJYTURKIjogIjE1LjYwNTQzMjEiLCJTTCI6ICIwLjA5IiwiU0UiOiAiLTExMy43NyIsIlhNSkUiOiAiLTEyNjQuMDQiLCJCWTEiOiAiIiwiQlkyIjogIiIsIkJZMyI6ICIiLCJCWTQiOiAiIiwiQlk1IjogIiJ9LHsiRlBIWFoiOiAiMCIsIlNQQk0iOiAiMTAzMDIwNDAxMDAwMDAwMDAwMCIsIlpYQk0iOiAiIiwiWUhaQ0JTIjogIiIsIkxTTEJTIjogIiIsIlpaU1RTR0wiOiAiIiwiWE1NQyI6ICLmlrDluIzmnJso5Y2O6KW/KeWxi+mhtuebkua0qumbheeJp+WcuumynOeJm+WltjUwMG1sIiwiR0dYSCI6ICI1MDBtbCIsIkRXIjogIuebkiIsIlhNU0wiOiAiLTEzIiwiWE1ESiI6ICI4LjY2OTIzMDc3IiwiU0wiOiAiMC4wOSIsIlNFIjogIi0xMC4xNSIsIlhNSkUiOiAiLTExMi43IiwiQlkxIjogIiIsIkJZMiI6ICIiLCJCWTMiOiAiIiwiQlk0IjogIiIsIkJZNSI6ICIifSx7IkZQSFhaIjogIjAiLCJTUEJNIjogIjEwMzAyMDQwMTAwMDAwMDAwMDAiLCJaWEJNIjogIiIsIllIWkNCUyI6ICIiLCJMU0xCUyI6ICIiLCJaWlNUU0dMIjogIiIsIlhNTUMiOiAi5paw5biM5pybKOWNjuilvynlsYvpobbnm5LmtKrpm4XniaflnLrpspzniZvlpbY5NTBtbCIsIkdHWEgiOiAiOTUwbWwiLCJEVyI6ICLnm5IiLCJYTVNMIjogIi0yNyIsIlhNREoiOiAiMTQuNzgyNTkyNTkiLCJTTCI6ICIwLjA5IiwiU0UiOiAiLTM1LjkzIiwiWE1KRSI6ICItMzk5LjEzIiwiQlkxIjogIiIsIkJZMiI6ICIiLCJCWTMiOiAiIiwiQlk0IjogIiIsIkJZNSI6ICIifSx7IkZQSFhaIjogIjAiLCJTUEJNIjogIjEwMzAyMDQwMTAwMDAwMDAwMDAiLCJaWEJNIjogIiIsIllIWkNCUyI6ICIiLCJMU0xCUyI6ICIiLCJaWlNUU0dMIjogIiIsIlhNTUMiOiAi5paw5biM5pyb77yI5Y2O6KW/77yJ5rSq6ZuF54mn5Zy65bGL6aG255uS5L2O6ISC6bKc54mb5aW2OTUwbWwiLCJHR1hIIjogIjk1MG1sIiwiRFciOiAi55uSIiwiWE1TTCI6ICItMjgiLCJYTURKIjogIjE1LjU5NjA3MTQzIiwiU0wiOiAiMC4wOSIsIlNFIjogIi0zOS4zMSIsIlhNSkUiOiAiLTQzNi42OSIsIkJZMSI6ICIiLCJCWTIiOiAiIiwiQlkzIjogIiIsIkJZNCI6ICIiLCJCWTUiOiAiIn0seyJGUEhYWiI6ICIwIiwiU1BCTSI6ICIxMDMwMjA0MDEwMDAwMDAwMDAwIiwiWlhCTSI6ICIiLCJZSFpDQlMiOiAiIiwiTFNMQlMiOiAiIiwiWlpTVFNHTCI6ICIiLCJYTU1DIjogIuaWsOW4jOacmyjljY7opb8p5bGL6aG255uSMjTlsI/ml7bpspzniZvlpbY1MDBtbCIsIkdHWEgiOiAiNTAwbWwiLCJEVyI6ICLnm5IiLCJYTVNMIjogIi0yNiIsIlhNREoiOiAiOS40OTUzODQ2MiIsIlNMIjogIjAuMDkiLCJTRSI6ICItMjIuMjIiLCJYTUpFIjogIi0yNDYuODgiLCJCWTEiOiAiIiwiQlkyIjogIiIsIkJZMyI6ICIiLCJCWTQiOiAiIiwiQlk1IjogIiJ9LHsiRlBIWFoiOiAiMCIsIlNQQk0iOiAiMTAzMDIwNDAxMDAwMDAwMDAwMCIsIlpYQk0iOiAiIiwiWUhaQ0JTIjogIiIsIkxTTEJTIjogIiIsIlpaU1RTR0wiOiAiIiwiWE1NQyI6ICLmlrDluIzmnJvloZHnk7blt7TmsI/pspzniZvlpbYyNTBtbCIsIkdHWEgiOiAiMjUwbWwiLCJEVyI6ICLnk7YiLCJYTVNMIjogIi03NSIsIlhNREoiOiAiNC43NzA1MzMzMyIsIlNMIjogIjAuMDkiLCJTRSI6ICItMzIuMjEiLCJYTUpFIjogIi0zNTcuNzkiLCJCWTEiOiAiIiwiQlkyIjogIiIsIkJZMyI6ICIiLCJCWTQiOiAiIiwiQlk1IjogIiJ9LHsiRlBIWFoiOiAiMCIsIlNQQk0iOiAiMTAzMDIwNDAxMDAwMDAwMDAwMCIsIlpYQk0iOiAiIiwiWUhaQ0JTIjogIiIsIkxTTEJTIjogIiIsIlpaU1RTR0wiOiAiIiwiWE1NQyI6ICLmlrDluIzmnJvnoJblvaLljIXnuq/niZvlpbYyNTBtbCoyNCIsIkdHWEgiOiAiMjUwbWwiLCJEVyI6ICLnm5IiLCJYTVNMIjogIi0xNDQiLCJYTURKIjogIjEuOTgxNTk3MjIiLCJTTCI6ICIwLjA5IiwiU0UiOiAiLTI1LjY5IiwiWE1KRSI6ICItMjg1LjM1IiwiQlkxIjogIiIsIkJZMiI6ICIiLCJCWTMiOiAiIiwiQlk0IjogIiIsIkJZNSI6ICIifSx7IkZQSFhaIjogIjAiLCJTUEJNIjogIjEwMzAyMDQwMTAwMDAwMDAwMDAiLCJaWEJNIjogIiIsIllIWkNCUyI6ICIiLCJMU0xCUyI6ICIiLCJaWlNUU0dMIjogIiIsIlhNTUMiOiAi5paw5biM5pyb6IuX5p2h56CW5r6z54m55YWw5LiJ5Liq5pyI57qv54mb5aW2MjUwbWwqMTIiLCJHR1hIIjogIjI1MG1sIiwiRFciOiAi55uSIiwiWE1TTCI6ICItMTUiLCJYTURKIjogIjMuNDIyIiwiU0wiOiAiMC4wOSIsIlNFIjogIi00LjYyIiwiWE1KRSI6ICItNTEuMzMiLCJCWTEiOiAiIiwiQlkyIjogIiIsIkJZMyI6ICIiLCJCWTQiOiAiIiwiQlk1IjogIiJ9LHsiRlBIWFoiOiAiMCIsIlNQQk0iOiAiMTAzMDIwNDAxMDAwMDAwMDAwMCIsIlpYQk0iOiAiIiwiWUhaQ0JTIjogIiIsIkxTTEJTIjogIiIsIlpaU1RTR0wiOiAiIiwiWE1NQyI6ICLljY7opb/oi5fmnaHnoJbmtKrpm4XniaflnLrnuq/niZvlpbYyNTBtbCoxMiIsIkdHWEgiOiAiMjUwbWwiLCJEVyI6ICLnm5IiLCJYTVNMIjogIi02MCIsIlhNREoiOiAiMy43MTU1IiwiU0wiOiAiMC4wOSIsIlNFIjogIi0yMC4wNyIsIlhNSkUiOiAiLTIyMi45MyIsIkJZMSI6ICIiLCJCWTIiOiAiIiwiQlkzIjogIiIsIkJZNCI6ICIiLCJCWTUiOiAiIn1dfX19";
//        byte[] keyde= new BASE64Decoder().decodeBuffer(key1);
//
//        String res = new String(keyde,"UTF-8");
//
//        //所有的税率
//        List<Integer> bigDecimalsaaaaa=new ArrayList<>();
//        bigDecimalsaaaaa.add(11);
//        bigDecimalsaaaaa.add(12);
//        bigDecimalsaaaaa.add(10);
//
//
//        for (int key : bigDecimalsaaaaa) {
//            switch (key) {
//                //借方票据编号
//                case 12:
//                    System.out.println("123");
//                    break;
//                // 总账标识为W
//                case 11:
//                    if (true) {
//                        System.out.println("456");
//                    }
//                    break;
//                case 13:
//                    if (true) {
//                        System.out.println("456");
//                        break;
//                    }
//            }
//        }
//
//        Map<String, String> groups = new HashMap<>();
//        String beforeMaterialCode ="00000000050001481";
//        String newStr = beforeMaterialCode.replaceAll("^(0+)", "");
//        groups.put(beforeMaterialCode, newStr.substring(0, 1));
//        List<String> stringsssss= new ArrayList<>();
//        stringsssss.add("1111");
//        stringsssss.add("2222");
//        System.out.println(stringsssss.toString());
//        Date datex=null;
//        datex=new Date();
//        String dataee="1"+datex.toString();
//        System.out.println(dataee);
        byte bytes[] = {(byte) 0xC2,(byte) 0xA0};
        String s1231= "工行苏州分行  1 102020609000433742";
       // String UTFSpace = new String(bytes,"utf-8");
       // String m= s1231.replaceAll(UTFSpace, " ");

        char[] chars_test1 = s1231.toCharArray();
        for (int i = 0; i < chars_test1.length; i++) {
            int charValue = (int) chars_test1[i];
            // 判断是全角字符
            if (charValue >= 65281 && charValue <= 65374 || charValue == 12288) {
                System.out.println("全角  " + (char) charValue);
            }
            // 判断是半角字符
            else if (charValue >= 33 && charValue <= 126 || charValue == 32) {
                System.out.println("半角  " + (char) charValue);
            }
        }
//        供应商编号：225070 
//        4月
        int a12311=2;
        if(a12311==1 || a12311==3 ||(a12311!=1&&a12311!=2))
        {
            System.out.println("a");
        }
        // 全角符号
        for (int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; ++i) {
            System.out.println(i + "    " + (char)i);}

            BigDecimal bigDecimal123=new BigDecimal("1911.00000000");
            String B="111"+bigDecimal123.stripTrailingZeros().toString();
            System.out.println(B);

            String dateStr ="2019-10-32";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = simpleDateFormat.parse(dateStr);
            } catch (ParseException e) {
                simpleDateFormat = new SimpleDateFormat("yyyy-MM");
                try {
                    date = simpleDateFormat.parse(dateStr);
                } catch (ParseException e1) {

                }
            }



        BigDecimal b123456;
        //所有的税率
        List<Integer> bigDecimals=new ArrayList<>();
        bigDecimals.add(11);
        bigDecimals.add(12);
        bigDecimals.add(10);
        //减去rate的  列表
        List<BigDecimal> subTaxRates=new ArrayList<>();
            for(int taxRates1:bigDecimals){
                subTaxRates.add(new BigDecimal(String.valueOf(taxRates1)).subtract(new BigDecimal("10.12")));
        }
        //subTaxRates按绝对值排序
        List<BigDecimal> sortTaxRates=new ArrayList<>();
        sortTaxRates= subTaxRates.stream().sorted(Comparator.comparing(BigDecimal::abs)).collect(Collectors.toList());
        if(sortTaxRates.get(0).abs().compareTo(new BigDecimal("0.5"))==-1)
        {
             BigDecimal b1234567= sortTaxRates.get(0).add(new BigDecimal("10.12"));
            System.out.println(b1234567);
            b123456=b1234567;
        }
        BigDecimal x=new BigDecimal(0.5);
       BigDecimal bigDecimal1123=new BigDecimal(String.valueOf(-2));
        BigDecimal ccccccc=bigDecimal1123.abs();
        List<String> toSpilt=new ArrayList<>();
        List<String> toSpilt2=new ArrayList<>();
        toSpilt.add("123");
        toSpilt.add("");
        toSpilt.add("2311");
        String s123 =new String();
        String S1234;
        String spilt="";
        spilt= String.join(",",toSpilt);
        String spilt2= String.join(",",toSpilt2);
        String[] split1 = spilt.split(",");
        List<String> idList = Arrays.asList(split1);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String startDate = "";//上次成功执行的日期，如果没上次执行时间，则获取配置或者当前日期
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 0-1, 32);
        Date startTime;
        //int a2 =Integer.parseInt("null");
        startTime = calendar.getTime();
        startDate = dateFormat.format(startTime);
        BigDecimal bbbbb=new BigDecimal("101");
        BigDecimal ddddd=bbbbb.divide(new BigDecimal("100"),0,BigDecimal.ROUND_UP);
        BigDecimal ccccc= bbbbb.setScale(2,BigDecimal.ROUND_UP);
        int aaaa = bbbbb.intValue();
        Date date1=new Date();

        String sssss="123213213123五月";
        String SSSS=sssss.substring(0,5 );


        Integer aaa=null;
        String.valueOf(0.01 * aaa);
        aaa=1;
        if(false||true&&false)
        {
            System.out.println("1");
        }

        List<student> testaaa=new ArrayList<>();
       // testaaa.addAll(null);
        testaaa.add(new student("yu",15));
        testaaa.get(0).setName(null);

        boolean bbb="青岛海源工程造价咨询有限公司".equals("青岛海源工程造价咨询有限公司");
        String result1 = "";
        my: for(int i=1; i<4; i++)
        {
            for(int j=1; j<6; j++)
            {
                result1 = i+";"+j;
                if (i==2)
                {
                    continue my;

                }
                System.out.println(result1);
            }
            System.out.println(i);
        }
        BigDecimal bigDecimal=new BigDecimal("111");
        BigDecimal bigDecimal1=new BigDecimal("1.111");
        BigDecimal v=bigDecimal.divide(bigDecimal1,3,5);
//        List<String> test111=null;
//        test111.add("2");
//        test111.add("3");
//        test111.add(null);
       // System.out.println(test111.indexOf("2"));
        System.out.println("开始喝酒?️...\t" + new Date());
        Date d3=new Date();
        Calendar c3=Calendar.getInstance();
        c3.set(Calendar.DAY_OF_MONTH,1);
        c3.set(Calendar.DATE,2);
        System.out.println(d3);
        System.out.println(d3.getTime());
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmssSSS") .format(new Date() ));
        System.out.println(c3);
        d3=c3.getTime();
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmssSSS") .format(d3 ));
        List<String> testLenth=new ArrayList<>();
        System.out.println(testLenth.size());
        String minDate="2019-10";
        String maxDate="2019-10";
        ArrayList<String> result = new ArrayList<String>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月

        Calendar min = Calendar.getInstance();
        Calendar max = Calendar.getInstance();

        try {
            min.setTime(sdf.parse(minDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

        try {
            max.setTime(sdf.parse(maxDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);
        max.add(Calendar.DATE,1);
        Calendar curr = min;
        while (curr.before(max)) {
            result.add(sdf.format(curr.getTime()));
            curr.add(Calendar.MONTH, 1);
        }





        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        Date d1=sdf1.parse("20181111 12:11:11");

        new BigDecimal("555");
        System.out.println(new BigDecimal("555").setScale(2));
        Date d= new Date();
        System.out.println(d);
        System.out.println(d.toString());
        UUID.randomUUID();
        for(int i=0;i<10;i++)
          System.out.println(UUID.randomUUID());

        System.out.println(new BigDecimal(10).negate());
        System.out.println(new BigDecimal(-3).negate());
        System.out.println(new BigDecimal(0).negate());
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("i="+i+"j="+j);
                if(j==3){
                    break;
                }
            }
        }



        BigDecimal a=new BigDecimal("100");
        BigDecimal c=new BigDecimal("200");
        System.out.println(a.subtract(c));
        BigDecimal b=null;
        List<Integer> list=new ArrayList<Integer>();
        student student=new student();
        student.getFrozen();
        Boolean b1 = Boolean.parseBoolean(null);
        System.out.println(b1);
       String s="000000000050000647";

        System.out.println(s.length());
       StringBuffer stringBuffer=new StringBuffer("050000647");
       while(stringBuffer.length()<18)
       {
           stringBuffer.append("'-1'");
       }
       s=stringBuffer.toString();
       System.out.println(s.length());

        System.out.println("0".equals(null));
        if(true){
            int i=1;
        }
        else
        {
            int j=2;
        }
        System.out.println(false||true);

            // 创建线程池
          //  ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("test-%d").build();
            ThreadPoolExecutor threadPool  = new ThreadPoolExecutor(
                    5,
                    20,
                    70,
                    TimeUnit.SECONDS,
                    new SynchronousQueue<Runnable>());
//                    namedThreadFactory);


            int i = 0;
            do{
                while (threadPool.getActiveCount()>10){
                    try {
                        Thread.sleep(1 * 1000);
                        System.out.println("reach max pool size:"+threadPool.getPoolSize()+", wait 1 second...");
                        System.out.println("getCompletedTaskCount:"+threadPool.getCompletedTaskCount()+", wait 1 second...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                threadPool.execute(()->{
                    work();
                });
                i++;
            }while (i<1000000);
        }

        private static void work(){
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" is over");
        }


}
