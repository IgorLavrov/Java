package ee.sda.javaee10.exercise38;

public class CoffeeMachine implements Runnable {

    static int waterTank = 10;

    Object lock = new Object();

    public void brew() {
        if (waterTank == 0) {
            System.out.println("Water tank is empty.. wait for refill..");
        }
        waterTank--;
    }


    public int refill(int liters) throws Exception {
        if (liters <= 0) {
            throw new IllegalArgumentException("Liters must be positive number");
        }
        Thread.sleep(5000);
        System.out.println("Refilling the tank..! Please wait!...");
        this.waterTank = liters;
        return liters;
    }

    @Override
    public void run() {
    }

}


