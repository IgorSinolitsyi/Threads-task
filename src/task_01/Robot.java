package task_01;

import static java.lang.Thread.sleep;

// Исправьте ошибки.
public class Robot extends Thread {

    Robot(String str) {
        super(str);
    }
    @Override
    public void run() {

        System.out.println(currentThread().getName()/* метод взврата имени потока **/ + " Started");
        try {/* поток засыпает на 1,5 секунды **/
            sleep(1500);
            System.out.println(currentThread().getName()/* метод взврата имени потока **/ + " Waiting...");
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
        System.out.println(currentThread().getName()/* метод взврата имени потока **/ + " Stopped");
    }
}
