
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


public class trying {
    public static void main(String[] args) {
        Instant start = Instant.now();
        /*ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        for (int i=0;i<5;i++){
            task t1=new task();
            executor.execute(t1);
        }
        executor.shutdown();*/
            for (int i=0;i<250;i++)
                System.out.println(i);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).getNano();
        System.out.println(timeElapsed);
    }
}
class task implements Runnable{
    static int value=0;

    @Override
    public void run() {
        for (int i=0;i<50;i++){
            System.out.println(value);value++;}

    }
}
class callthis{

    public static void make(){
        for (int i=0;i<50;i++)
        System.out.println("hi");

    }
}
