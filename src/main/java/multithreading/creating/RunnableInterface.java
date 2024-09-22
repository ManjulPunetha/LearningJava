package multithreading.creating;

public class RunnableInterface
{
    public static class RunnableInterfaceExample implements Runnable
    {
        @Override
        public void run() {
            System.out.println("Thread running");
            System.out.println("Thread stopped");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableInterfaceExample());
        thread.start();
    }
}
