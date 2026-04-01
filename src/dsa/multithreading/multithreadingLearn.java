package dsa.multithreading;

public class multithreadingLearn extends Thread{
    @Override
    public void run(){
        System.out.println("Code executed by thread : "+Thread.currentThread().getName());
    }
}
