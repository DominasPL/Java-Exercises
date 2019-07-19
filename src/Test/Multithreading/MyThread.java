package Test.Multithreading;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("I am inside thread!");
    }

}
