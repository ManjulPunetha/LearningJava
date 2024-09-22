package multithreading.stopping;

public class StoppableRunnable implements Runnable
{
    private boolean isThreadStopped = false;

    public synchronized void doStopThread() { //synchronized ensures only single thread
        // can use this method at a time
        isThreadStopped = true;
    }

    public synchronized boolean getIsThreadStopped() {
        return isThreadStopped;
    }

    private void sleep(long milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        System.out.println("StoppableRunnable Running");
        while (!getIsThreadStopped()) {
            System.out.println("Still running");
            sleep(1000);
        }
        System.out.println("StoppableRunnable Stopped");
    }

    public static void main(String[] args) throws InterruptedException {
        StoppableRunnable stoppableRunnable1 = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable1, "Defined Thread");
        //start the defined thread
        thread.start();

        //pause the main thread not the Defined Thread
        Thread.sleep(6000);

        stoppableRunnable1.doStopThread();
    }
}
