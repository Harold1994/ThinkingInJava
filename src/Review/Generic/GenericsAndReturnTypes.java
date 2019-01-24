package Review.Generic;
interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface SelfBoundingSetter<T extends SelfBoundingSetter<T>>{
    void set(T arg);
}

interface Setter extends SelfBoundingSetter<Setter> { }

interface Getter extends GenericGetter<Getter> {

}
public class GenericsAndReturnTypes {
   static void test (Getter g) {
       Getter result = g.get();
       GenericGetter gg = g.get();
   }

   void testA(Setter s1, Setter s2, SelfBoundingSetter sbs) {
       s1.set(s2);
   }

    public static void main(String[] args) {

    }
}
