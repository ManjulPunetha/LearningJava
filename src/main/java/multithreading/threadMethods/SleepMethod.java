package multithreading.threadMethods;

public class SleepMethod
{
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Thread running");
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread finished");
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
