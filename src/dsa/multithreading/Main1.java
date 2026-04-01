package dsa.multithreading;

public class Main1 {
    public static void main(String[] args){
        System.out.println("Going inside main method : "+Thread.currentThread().getName());
        multithreadingLearn myThread = new multithreadingLearn();
        myThread.start();
        // Her u dont create Thread y because u are extending Thread class. Thread class has all the methods
        System.out.println("Finish main method : "+Thread.currentThread().getName());
    }
}
/*
    Why we have 2 ways to create Threads ?
        A class can implement more than 1 interface
        but
        A class can extend only 1 class

        So, In industries most preferable is --> implements Runnable Interface
 */