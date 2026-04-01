package ReadWrite.Lock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;
    public void producer(ReadWriteLock lock){
        try {
            lock.readLock().lock();
            System.out.println("Read lock acquired by : " + Thread.currentThread().getName());
//            isAvailable = true;
            Thread.sleep(4000);
        }catch (Exception e){
           // exception handling here
        }
        finally {
            lock.readLock().unlock();
            System.out.println("Read Lock release by : "+Thread.currentThread().getName());
        }
    }
    public void consume(ReadWriteLock lock){
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by : "+Thread.currentThread().getName());
            isAvailable = false;
        }catch (Exception e){
            // exception handling here
        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock release by : "+Thread.currentThread().getName());
        }
    }
}
