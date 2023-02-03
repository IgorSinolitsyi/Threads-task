package task_04;

// Исправьте ошибки.
class Fruits {

    public void run() {
        for (String fruit : getFruits()) {
            System.out.println(fruit);
        }
        try {
            Thread./* поток засыпает на 2 секунды **/
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted");
        }
    }

    private /* ??? **/ getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
