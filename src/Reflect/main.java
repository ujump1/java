package Reflect;

import Entity.student;

public class main {
    //获得类并实例化
    public void reflectNewInstance(){
        //第一种
        Class Student=null;
        Object student1=null;
        try {
            Student = Class.forName("Entity.student");
            student1=Student.newInstance();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(student1);
        student s=(student) student1;
        s.setAge(100);
        System.out.println(s.getAge());
        //第二种
        student s1=new student();
        student s2=new student();
        Class c1=s1.getClass();
        Class c2=s2.getClass();
        System.out.println(c1==c2);
        Object student2=null;
        try {
            student2=c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        student s3=(student) student2;
        //第三种
        Class c=student.class;
        //Class<student> c=student.class;
        Object student3=null;
        try {
            student3=c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        student s4=(student) student3;

    }
    public static void main(String args[]){
       main main=new main();
       main.reflectNewInstance();
    }
}
