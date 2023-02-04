package task_02;

// Исправьте ошибки.
class Fruits extends Thread {
    @Override
    public void run() {
        for (String fruit : getFruits()) {
            System.out.println(fruit);
            try {
                sleep(500);
            } catch (InterruptedException ie) {
                System.out.println("Exception" + ie);
            }
        }
    }

    private String[] getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
