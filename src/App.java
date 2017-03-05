/**
 * Created by valmach on 05/03/2017.
 */
public class App {
    public static void main(String[] args) {
        /* recursion occurs when subroutine calls a subroutine */

/* E.g. 4! = 4*3*2*1 is (factorial 4) */
        System.out.println(factorial(2));

    }

    private static int factorial(int value) {
        System.out.println(value);

        if (value == 1) {
            return 1;
        }
        return factorial(value - 1) * value;
    }
}
