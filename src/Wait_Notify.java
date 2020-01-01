public class Wait_Notify {

    static Object lock;
    static boolean status=false;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread Running " + status);
        lock=new Object();

        Thread waiting=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    try {
                        System.out.println("Waiting...");
                        lock.wait(2000);
                        System.out.println("Resumed...");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread notifying=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(2100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock){
                    System.out.println("Notified");
                    status=true;
                    lock.notify();
                }
            }
        });

        waiting.start();
        notifying.start();
        waiting.join();

        System.out.println("Exiting "+ status);

    }


}
