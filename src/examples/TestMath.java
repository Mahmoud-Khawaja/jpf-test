import java.lang.reflect.Method;

//check if the model classes is being used
public class TestMath {

    public static void main(String[] args) {
        System.out.println("=== Testing JPF Math Model ===");

        // methods implemented in peer
        int maxVal = Math.max(10, 20);
        System.out.println("Math.max(10, 20) = " + maxVal);

        int minVal = Math.min(10, 20);
        System.out.println("Math.min(10, 20) = " + minVal);

        double sqrtVal = Math.sqrt(16.0);
        System.out.println("Math.sqrt(16.0) = " + sqrtVal);

        int absVal = Math.abs(-42);
        System.out.println("Math.abs(-42) = " + absVal);

        // reflection to avoid compile-time error
        try {
            Method getModelInfo = Math.class.getMethod("getModelInfo");
            String info = (String) getModelInfo.invoke(null);
            System.out.println("Model info: " + info);
            System.out.println("SUCCESS: JPF Math model class loaded!");
        } catch (NoSuchMethodException e) {
            System.out.println("FAILURE: Standard Math class loaded (model not working)");
            System.out.println("(Method getModelInfo() not found)");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("=== Test Complete ===");
    }
}