public class threadClass extends Thread {
   public void run(){
       for(int i=0;i<5;i++)
       System.out.println("hello");
       System.out.println(threadClass.currentThread().getId());
   }

   static threadClass first(){
       System.out.println("from t1");
       threadClass t1=new threadClass();
       t1.start();
       return t1;


   }
   static void second(){
       System.out.println("from t2");
       threadClass t2=new threadClass();
       t2.start();

   }
   static void third(){
       System.out.println("from t3");
       threadClass t3=new threadClass();
       t3.start();
   }
    public static void main(String[] args) throws InterruptedException {
      threadClass t1= first();
        Thread.sleep(12);
      t1.run();

       second();
       // sleep(1);
       third();
       Thread thread=new Thread("yo");         /*to display the threads value*/
       Thread thread1=new Thread("whats_up");
       thread.start();
       thread1.start();
        System.out.println(thread.getName());
        System.out.println(thread1.getName());

    }

}
/*
class MultithreadingDemo extends Thread
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }
}

// Main Class
public class threadClass
{
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i=0; i<8; i++)
        {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
        }
    }
}
*/
