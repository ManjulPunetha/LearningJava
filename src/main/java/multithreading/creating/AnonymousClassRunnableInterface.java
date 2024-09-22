package multithreading.creating;

public class AnonymousClassRunnableInterface
{
    public static void main(String[] args) {
        Runnable runnable = new Runnable()
        {
            @Override
            public void run() {
                System.out.println("Thread running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
