package Chapter1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String name = "Tuhin Pravati";
        char f = name.charAt(0);
        char l = name.charAt(name.length() - 1);
        System.out.println(f + "" + l);
        System.out.println(name);
        String sub = name.substring(name.length() - 1);
        System.out.println(sub);
        System.out.println(Math.floor(2.4));

        //String s = "Hello";
        //String firstLast = s.charAt(0) + "" +s.charAt(s.length() - 1);
        //System.out.println(firstLast);
        //System.out.println(s.substring(1, s.length() - 1));
        //System.out.println(s.substring(0, s.length() / 2));
        //System.out.println(s.substring(s.length()/ 2 + 1, s.length()));
        Scanner in = new Scanner(System.in);
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number between 0 and 99
        int randomNumber = random.nextInt(100);

        // Add 1 to the random number to make it between 1 and 100
        randomNumber += 1;

        // Print the random number
        System.out.println("Random number: " + randomNumber);
        for (int i = 0; i < 6; i++) {
            int randomNumber1 = random.nextInt(100) + 1;
            System.out.println(randomNumber1);
        }
        System.out.println();
        int[] ar = new int[5];
        for(int i = 0; i < 5; i++){
            int num = random.nextInt(100);
            num++;
            ar[i] = num;
        }
        for(int ans : ar){
            System.out.println(ans);
        }
        ArrayList<String> names = new ArrayList<String>();
        names.add("Tuhin");
        names.add("Pravati");
        for(int i = 0; i < names.size(); i++){
            String ans = names.get(i);
            System.out.print(ans + " ");
        }
        System.out.println();
        names.set(1, "Babee");
        names.remove(0);
        for(String a : names){
            System.out.println(a);
        }

        ArrayList<String> aa = names;
        for(String anss : aa){
            System.out.println(anss);
        }
        //1 2 3 4 5 6 7 8 9 10
        int[] b = new int[100];
        System.out.println();
        //0 2 4 6 8 10 12 14 16 18 20
        for(int i = 0; i <= 21; i += 2){
            b[i] = i;
            System.out.printf("%d ", i);
        }
        System.out.println();
        //1 4 9 16 25 36 49 64 81 100
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d ", i * i);
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            b[i] = i % 5;
            System.out.printf("%d ", b[i]);
        }
        System.out.println();
        System.out.println();
        int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        for (int i = 8; i >= 0; i--) {
            a[i] = a[i + 1];
            System.out.printf("%d ", a[i]);
        }
        for (int i = 9; i > 0; i--) { a[i] = a[i - 1];

        }
        System.out.println();
        int[] p = new int[11];
        for(int i = 0; i < 10; i++){
            int n = random.nextInt(100);
            n++;
            p[i] = n;
            int count = 0;
            for(int j = 0; j < i; j++){
                if(p[j] == p[i]){
                    count++;
                }
            }
            if(count > 0){
                i--;
            }
            System.out.printf("%d ", p[i]);
        }
        System.out.println();
        int mx = p[0];
        int mn = p[0];
        for(int aaa : p){
            if(aaa > mx){
                mx = aaa;
            }
            if(aaa < mn){
                mn = aaa;
            }
        }
        System.out.println(mx + " " + mn);

    }
}
