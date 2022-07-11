/**
 * Created by : Naveen Pabhath
 * Date : 7/11/2022
 * Time : 1:12 PM
 * Project Name : Thread
 **/
import java.lang.Thread;
class MyTask extends Thread{
    void executeTask() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Execute " + i + " Task2");
        }
    }
}

class App {
    public static void main(String[] args) {
        // Task 1
        System.out.println("---Application started---");

        // Task 2
        MyTask mt = new MyTask();
        mt.start();


        // until Task2 is complete, Task 3 and Task 4 should be waitng
        // Task 3
        for (int i = 1; i < 10; i++) {
            System.out.println("Execute " + i + " Task3");
        }

        // Task 4
        System.out.println("---Application Ended---");
    }
}
