package task_01;

// Исправьте ошибки.
public class Main {

    static String name;

    public static void main(String[] args) {

        name = "Robot 1.0";
        getRobotInfo(/* ??? **/);

        name = "Robot 2.0";
        getRobotInfo(/* ??? **/);
    }

    private static /* ??? **/ getRobot(String name) {
       return new Robot(name);
    }

    private static void getRobotInfo(Robot robot) {
        System.out.println(robot/* метод взврата имени потока **/ + " state: " + robot/* метод взврата состояния потока **/);
        robot./* поток стартует **/
        System.out.println(robot./* метод взврата имени потока **/ + " state: " + robot./* метод взврата состояния потока **/
    }
}
