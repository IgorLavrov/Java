package ee.sda.javaee10.exercise38;

public class Main {
/*

    public synchronized void something() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("Thread " + Thread.currentThread().getName() + ", iteration number " + i);
        }
    }
*/



    public static void main(String[] args) throws Exception {
  /*      Main main = new Main();

        new Thread(() -> main.something()).start();
        new Thread(() -> main.something()).start();
        new Thread(() -> main.something()).start();
        new Thread(() -> main.something()).start();
        new Thread(() -> main.something()).start();
        new Thread(() -> main.something()).start();
        new Thread(() -> main.something()).start();
        new Thread(() -> main.something()).start();


        Thread.sleep(20000000);

        System.exit(1);*/





        Object lock = new Object();


        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i < 100; i++) {

                    if (CoffeeMachine.waterTank <= 0) {
                        System.out.println("Water tank needs refill..");
                        try {
                            lock.wait(); //thread will WAIT, until it's EXPLICITLY notified to be resumed.
                        } catch (Exception e) {

                        }
                    }
                    coffeeMachine.brew();
                    System.out.println("Brewing coffee cup number " + i);
                }
            }


        });


        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("===========Refilling now!!!!!!!!======================");
                CoffeeMachine.waterTank = 10;
                lock.notify();
            }
        });

        t1.start();
        Thread.sleep(2000);
        t2.start();

    }

}
