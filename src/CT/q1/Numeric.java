package CT.q1;

public class Numeric {
    public static double intPower(double x, int n){
        if(n < 0){
            return (1 / Math.pow(x, -n));
        } else if(n == 0){
            return 1;
        } else {
            if(n % 2 == 0){
                double r = Math.pow(x, n / 2);
                return r * r;
            } else {
                return Math.pow(x, n - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Numeric.intPower(0.1, 12));
        System.out.println(Numeric.intPower(2, 10));
        System.out.println(Numeric.intPower(-1, 1000));
        System.out.println(Numeric.intPower(2, -5));
    }
}
