import java.util.Date;

public class GreetingRunnable implements Runnable{
    public static final int REPETITION = 10;
    public static int delay;

    private String greeting;

    public GreetingRunnable(String aGreeting, int delays) {
        this.greeting = aGreeting;
        this.delay = delays;
    }
    public void run(){
        try{
            for(int i = 0; i < REPETITION; i++){
                Date now = new Date();
                System.out.println(now + " " + greeting + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception){
        }
    }
}
