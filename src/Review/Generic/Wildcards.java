package Review.Generic;

import static javafx.scene.input.KeyCode.T;

public class Wildcards {
    static void rawArgs(Holder holder, Object arg) {
        holder.set(arg);
        holder.set(new Wildcards());
        Object obj = holder.get();
    }

    static void unboundedArg(Holder<?> holder, Object arg) {
//        holder.set(arg);
//        holder.set(new Wildcards());
        Object obj = holder.get();
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T wildSubType(Holder<? extends T> holder, T arg) {
//        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> void  wildSuperType(Holder<? super T> holder, T arg) {
        holder.set(arg);
        Object obj = holder.get();
    }

    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getName());
    }

    static <T> void f2(Holder<?> holder)
    {
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Long>();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long lng = 1l;

//        rawArgs(raw, lng);
//        rawArgs(qualified, lng);
//        rawArgs(bounded, lng);

//        unboundedArg(raw,lng);
//        unboundedArg(qualified,lng);
//        unboundedArg(unbounded,lng);
//        Object r1 = exact1(raw);
//        Long r2 = exact1(qualified);
//        Object r3 = exact1(unbounded);
//        Long r4 = exact1(bounded);

//        Long r5 = exact2(raw,lng);
//        Long r6 = exact2(qualified,lng);
////        Long r7 = exact2(, lng);

//        Long r9 = wildSubType(raw, lng);
//        Long r10 =  wildSubType(qualified, lng);
//        Object r11 = wildSubType(unbounded, lng);
//        Long r12 = wildSubType(bounded, lng);

//        wildSuperType(unbounded,lng);
        Holder raw2 = new Holder<Integer>(1);
        f2(raw2);
        Holder raw3 = new Holder();
        raw3.set(new Object());
        f2(raw3);

        Holder<?> raw4 = new Holder<Double>(1.0);
        f2(raw4);

    }

    interface  Payable<T> {}
    class Employee implements Payable{}
    class Hourly extends Employee implements Payable {}
}
