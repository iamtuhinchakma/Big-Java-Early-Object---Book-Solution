package CT.q1;

public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;
    private int dial;
    private int passed;
    public ComboLock(int secret1, int secret2, int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        dial = 0;
        passed = 0;
    }

    public void reset(){
        dial = 0;
        passed = 0;
    }
    public void turnRight(int ticks){
        if(passed == 0){
            if((dial+ticks)%39 == secret1){
                dial = secret1;
                passed++;
            }
        }
        if(passed == 2){
            if((dial+ticks)%39 == secret3){
                dial = secret3;
                passed++;
            }
        }

    }

    public void turnLeft(int ticks){
        if(passed == 1){
            int temp = dial - ticks;
            if(temp < 0)
                temp = -temp;
            if(temp%39 == secret2){
                dial = secret2;
                passed++;
            }
        }
    }

    public boolean open(){
        if(passed == 3)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        ComboLock comboLock = new ComboLock(2, 0, 3);
        comboLock.turnRight(2);
        comboLock.turnLeft(2);
        comboLock.turnRight(3);
        System.out.println(comboLock.open());

        comboLock.turnLeft(3);
        comboLock.turnRight(2);
        comboLock.turnRight(39);
        System.out.println(comboLock.open());
    }
}
