public class practice {
    public static void main(String[] args) {
        thre t1 = new thre();
        threa t2 = new threa();
        for (int i = 0; i < 3; i++){ t1.run();
        t2.run();}

    }
}

class thre extends Thread {
    public void run() {

            System.out.println("thread");
    }
}

class threa implements Runnable {

    @Override
    public void run() {

            System.out.println("runnable");
    }
}
