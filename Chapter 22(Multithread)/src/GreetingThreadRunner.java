public class GreetingThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before");
        GreetingRunnable r1 = new GreetingRunnable("Hello", 1000);
        GreetingRunnable r2 = new GreetingRunnable("Jhu Jhu", 500);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        //Thread.sleep(1000);
        t2.start();
        System.out.println("After");
    }
}
