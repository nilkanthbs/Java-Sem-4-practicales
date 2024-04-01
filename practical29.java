

class CountingThread extends Thread {
    private int start;
    private String threadName;

    public CountingThread(String threadName, int start) {
        this.threadName = threadName;
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= start + 4; i++) {
            System.out.println(threadName + "\tCount :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class practical29 {
    public static void main(String[] args) {
        CountingThread thread1 = new CountingThread("Thread A", 1);
        CountingThread thread2 = new CountingThread("Thread B", 6);

        thread1.start();
        thread2.start();
    }
}