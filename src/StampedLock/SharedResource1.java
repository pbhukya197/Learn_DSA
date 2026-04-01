package StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource1 {
    int a = 10;
    StampedLock lock = new StampedLock();
    public void producer(){
        long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Taken Optmistic Lock");
            a = 11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("Updated a value successfully");
            }else{
                System.out.println("rollback of work");
                a = 10; // rollback
            }
        }catch (Exception e){
            // exception goes here
        }
    }
    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by : "+Thread.currentThread().getName());
        try{
            System.out.println("performing work");
            a = 9;
        }catch (Exception e){
            // exception goes here
        }
        finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock release by : "+Thread.currentThread().getName());
        }
    }
}
