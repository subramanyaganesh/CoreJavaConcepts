public class thread1 {
    public static void main(String[] args) {
        imp i1 = new imp();
        for (int i = 0; i < 6; i++)
            try {
                i1.run();
                Thread.sleep(1000);
                new happy();
                Thread.sleep(1000);
                veryHappy.calledfunction();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


    }
}

class imp implements Runnable {

    @Override
    public void run() {

        System.out.println("hi");
            try {
                Thread.sleep(1000);
                veryHappy.anotherfunctioncalled();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}

class happy {
    static {
        System.out.println("bye");
    }

    happy() {
        //do nothing
    }

}
/*All functions that are called in the run method are static*/
class veryHappy {
     static void calledfunction() {
        System.out.println("calledfunction");
    }
    static void anotherfunctioncalled(){
        for (int i=0;i<2;i++) {
            try {
                Thread.sleep(1000);
                System.out.println("anotherfunctioncalled");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
