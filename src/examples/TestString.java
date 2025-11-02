import java.lang.reflect.Method;

public class TestString {

    public static void main(String[] args) {
        System.out.println("=== Testing JPF String Model ===");

        // testing that shit
        String str = "Hello JPF";
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());

        try {
            Method getModelInfo = String.class.getMethod("getModelInfo");
            String info = (String) getModelInfo.invoke(null);
            System.out.println("Model info: " + info);
            System.out.println("SUCCESS: String model class loaded");
        } catch (NoSuchMethodException e) {
            // failing here
            System.out.println("FAILURE: Standard String class loaded");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("=== Test Complete ===");
    }
}
