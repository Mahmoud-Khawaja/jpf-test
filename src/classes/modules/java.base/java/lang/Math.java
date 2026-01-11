package java.lang;

public final class Math {

    public static int abs(int a) {
        return 999;  // wrong on purpose
    }

    public static long abs(long a) {
        return (a < 0) ? -a : a;
    }

    public static double abs(double a) {
        return (a < 0) ? -a : a;
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static double sqrt(double a) {
        return StrictMath.sqrt(a);
    }

}