package multithreading.creating;

public class ExtendThread
{
    public static class ExtendThreadExample extends Thread
    {
        @Override
        public void run() {
            System.out.println("Thread running");
            System.out.println("Thread stopped");
        }
    }

    public static void main(String[] args) {
        ExtendThreadExample extendThreadExample = new ExtendThreadExample();
        extendThreadExample.start();
    }
}