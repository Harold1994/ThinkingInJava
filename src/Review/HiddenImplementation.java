package Review;

import Review.TypeInfo.A;
import Review.TypeInfo.HiddenC.*;
import Review.TypeInfo.HiddenC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HiddenImplementation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object a , String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
}

