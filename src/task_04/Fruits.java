package task_04;

// Исправьте ошибки.
class Fruits extends Thread{
    @Override
    public void run() {
        for (String fruit : getFruits()) {
            System.out.println(fruit);
        }
        try {
            sleep(2000);/* поток засыпает на 2 секунды **/
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted");
        }
    }

    private String[] getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
