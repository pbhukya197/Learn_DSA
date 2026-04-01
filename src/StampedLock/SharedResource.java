package StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();
    public void producer(){
        long stamp = lock.readLock();
        try{
            System.out.println("Read Lock acquired by : "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        }catch (Exception e){
            // exception here
        }
        finally {
            lock.unlockRead(stamp);
            System.out.println("Read lock release by : "+Thread.currentThread().getName());
        }
    }
    public void consumer(){
        long stamp = lock.writeLock();
        try{
            System.out.println("Write lock acquired by : "+Thread.currentThread().getName());
            isAvailable = false;
        }catch (Exception e){
            // exception goes here
        }
        finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock release by : "+Thread.currentThread().getName());
        }
    }
}
