public class InterruptEx {

    public static void main(String[] args) throws InterruptedException { // 4
        Thread threadToInterrupt = new Thread(() -> {
            while (true) {
                System.out.println("Working hard");
                try {
                    Thread.sleep(300); // 1
                } catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                    break; // 2
                }
            }
        });

        threadToInterrupt.start();
        Thread.currentThread().sleep(700); // 3
        threadToInterrupt.interrupt(); // 5
    }
}
