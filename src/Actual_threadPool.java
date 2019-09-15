
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Actual_threadPool {
    public static void main(String[] args) {


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        for (int i = 1; i < 10; i++) {
            NTask nTask = new NTask("Task= " + i);
            System.out.println("Created" + nTask.getName());
            executor.execute(nTask);
        }
        executor.shutdown();
    }
}

class NTask implements Runnable {
    String name;
    static int value = 0;

    public String getName() {
        return name;
    }

    public NTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try{
        System.out.println("Executing " + name);
        for (int i = 0; i < 100; i++) {
            value++;
            System.out.println("Name= " + name + " value= " + value);

        }
          TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

/*
class Test extends abcsss{

    Test(){
        super();
       // this(10);  // calling constructor with one parameter

        System.out.println("This is Default Constructor");
    }

    Test(int number1){
        this(10,20);   // calling constructor with two parameter
        System.out.println("This is Parametrized Constructor with one argument "+number1);
    }

    Test(int number1,int number2){
        System.out.println("This is Parametrized  Constructor  with two argument"+number1+" , "+number2);
    }


    public static void main(String[] args){
        Test t = new Test();
        // first default constructor,then constructor with 1 parameter , then constructor with 2 parameters will be called
    }

}
class abcsss {
    abcsss(){
        System.out.println("aaaaa");
    }

}
*/
