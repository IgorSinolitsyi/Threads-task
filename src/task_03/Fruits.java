package task_03;

// Исправьте ошибки.
class Fruits extends Thread{

    public Fruits(ThreadGroup group, String name) {
        super(group, name);
    }
    @Override
    public void run() {
        System.out.println(currentThread().getName());
        for (String fruit : getFruits()) {
            System.out.println(fruit);
            try {
                sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(currentThread().getName());
            }
        }
    }

    private  String[] getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
