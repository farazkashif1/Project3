public class ThreadMain extends Thread {
    public static void main(String[] args) {
        Th1 thread = new Th1();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
//public class Main implements Runnable {
//    public static void main(String[] args) {
//        Th1 obj = new Th1();
//        Thread thread = new Thread(obj);
//        thread.start();
//        System.out.println("This code is outside of the thread");
//    }
//    public void run() {
//        System.out.println("This code is running in a thread");
//    }
//}