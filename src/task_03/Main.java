package task_03;

// Вывод групп товаров.
// Исправьте ошибки.
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        getFruits(group);
        getVeges(group);
        getBerries(group);
    }

    private static void getFruits(ThreadGroup group) throws InterruptedException {
        Fruits fruits = new Fruits(group, "\nFruits:");
        fruits.start();
        fruits.join();/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }

    private static void getVeges(ThreadGroup group) throws InterruptedException {
        Veges veges = new Veges(group, "\nVeges:");
        veges.start();
        veges.join();/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }

    private static void getBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(group, "\nBerries:");
        berries.start();
        berries.join();/* метод ждет пока этот поток умрет, и подсоединяет другой поток **/
    }
}
