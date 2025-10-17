package java.lang;

// this should replace java.lang.Math wile jpf execution
public final class Math {

    private Math() {}

    // Native methods delegated to peer class
    public static native int max(int a, int b);
    public static native int min(int a, int b);
    public static native double sqrt(double a);

    // Pure Java implementation
    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }

    public static long abs(long a) {
        return (a < 0) ? -a : a;
    }

    // Diagnostic method for testing
    public static String getModelInfo() {
        return "JPF-TEST Math Model - Loaded Successfully";
    }
}