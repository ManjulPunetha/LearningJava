package multithreading.threadMethods;

public class ThreadJoin implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        ThreadJoin threadJoin = new ThreadJoin();
        Thread thread1 = new Thread(threadJoin, "Thread1");
        Thread thread2 = new Thread(threadJoin, "Thread2");
        thread1.start();
        try {
            thread1.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}