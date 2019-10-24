public class Factorial {

    public static int operar(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res = res * i;
        }
        return res;
    }

}