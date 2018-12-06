package runnable;

class MultithreadingDemo implements Runnable {
    public void run() {
        try {
            System.out.println ("Thread " +
                    Thread.currentThread().getId() + " is running");
            for (int i=0;i<3;i++) {
                System.out.println(Thread.currentThread().getId() +
                        " Thread - Time " + i);
            }
        }
        catch (Exception e) {
            System.out.println ("Exception is caught");
        }
    }
}