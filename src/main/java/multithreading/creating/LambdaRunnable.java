package multithreading.creating;

public class LambdaRunnable
{
    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("Thread running");
            System.out.println("Lambda example");
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
