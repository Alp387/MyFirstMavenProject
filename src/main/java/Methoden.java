public class Methoden {

    public static boolean smallerThanZero(int i) {
        return i < 0;
    }

    public static int sumSquareOrSubstract(int a, int b) {
        if (a > b) {
            return a + b;
        } else return a * b;
    }

    public static int sumSquareOrSubstract(int a, int b, boolean c) {

        if (c == true) {
            return a - b;
        } else {
            return sumSquareOrSubstract(a, b);
        }
    }
}
