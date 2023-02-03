package task_01;

// Исправьте ошибки.
public class Robot {

    Robot(String str) {
        super(str);
    }

    public void run() {
        System.out.println(Thread.currentThread()./* метод взврата имени потока **/ + " Started");
        try {
            Robot./* поток засыпает на 1,5 секунды **/
            System.out.println(Thread.currentThread()/* метод взврата имени потока **/ + " Waiting...");
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println(Thread.currentThread()/* метод взврата имени потока **/ + " Stopped");
    }
}
