package multithreading.threadMethods;

public class CurrentThreadMethod
{
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String currentThread = Thread.currentThread().getName();
            System.out.println("Thread running is : " + currentThread);
        };

        Thread thread1 = new Thread(runnable,"1st");
        thread1.start();

        Thread thread2 = new Thread(runnable,"2nd");
        thread2.start();
    }
}
