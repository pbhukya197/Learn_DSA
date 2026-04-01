package ReadWrite.Lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args){
        SharedResource resource = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread t1 = new Thread(() ->{
           resource.producer(lock);
        });

        Thread t2 = new Thread(() ->{
           resource.producer(lock);
        });

        SharedResource resource1 = new SharedResource();
        Thread t3 = new Thread(() ->{
           resource1.consume(lock);
        });
                                // ReadLock -> More than 1 thread can acquire the read lock
                                // WriteLock -> Only 1 thread can acquire the write lock
        t1.start();
        t2.start();
        t3.start();
    }
}

// ReadWriteLock allows multiple threads to read shared data simultaneously
// while ensuring that only one thread can write at a time to maintain data consistency.
