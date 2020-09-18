package Concurrency;

public class test {
    public static void main(String[] args)  {
        final inserData insertData = new inserData();

        new Thread() {
            public void run() {
                insertData.insert(Thread.currentThread());
            };
        }.start();
        new Thread() {
            public void run() {
                insertData.insert(Thread.currentThread());
            };
        }.start();
    }
}



