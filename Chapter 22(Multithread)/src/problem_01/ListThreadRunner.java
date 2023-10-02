package problem_09;
import java.util.LinkedList;
import java.util.List;
public class ListThreadRunner{
    public static void main(String[] args){
        List<Integer> lst = new LinkedList<Integer>();
        final int VAL = 100;
        final int REPEAT = 50;
        final int THREADS = 100;

        for(int i = 1; i <= THREADS; i++) {
            AddRunnable<Integer> a = new AddRunnable<Integer>(lst, VAL, REPEAT);
            RemoveRunnable<Integer> r = new RemoveRunnable<Integer>(lst, VAL, REPEAT);
            Thread at = new Thread(a);
            at.start();
            Thread rt = new Thread(r);
            rt.start();
        }
    }
}
