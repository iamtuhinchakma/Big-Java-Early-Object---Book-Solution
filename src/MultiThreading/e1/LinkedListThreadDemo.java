package MultiThreading.e1;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListThreadDemo implements Runnable{
    private static LinkedList<String> list;
    private static Random randomizer;
    public void run(){
        int choices = list.size();
        if(choices > 0){
            choices = randomizer.nextInt(choices + 1);
        }
        if(choices == list.size()){
            String token = randomizer.nextInt(1000) + "";
            list.add(token);
            System.out.println("Added: " + token);
        } else{
            String token = list.remove(choices);
            System.out.println("Removed: " + token);
        }
        if(choices > 0){
            run();
        }
    }

    public static void main(String[] args) {
        randomizer = new Random();
        list = new LinkedList<>();
        Thread t1 = new Thread(new LinkedListThreadDemo());
        t1.start();
        Thread t2 = new Thread(new LinkedListThreadDemo());
    }
}
