package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;


// those will be executed on host JVM
public class JPF_java_lang_Math extends NativePeer {

    @MJI
    public static int max__II__I(MJIEnv env, int clsRef, int a, int b) {
        System.out.println("[JPF-TEST] Math.max() called via peer: " + a + ", " + b);
        return Math.max(a, b);
    }

    @MJI
    public static int min__II__I(MJIEnv env, int clsRef, int a, int b) {
        System.out.println("[JPF-TEST] Math.min() called via peer: " + a + ", " + b);
        return Math.min(a, b);
    }

    @MJI
    public static double sqrt__D__D(MJIEnv env, int clsRef, double a) {
        System.out.println("[JPF-TEST] Math.sqrt() called via peer: " + a);
        return Math.sqrt(a);
    }
}