package Review.Generic;

class SelfBounded<T extends SelfBounded<T>> {
    T element;

    SelfBounded set (T element) {
        this.element = element;
        return this;
    }

    T get() {
        return element;
    }
}

class A extends SelfBounded<A>{}
class B extends SelfBounded<B>{}
class C extends SelfBounded<C>{
    C setAndGet(C arg) {
        set(arg);
        return get();
    }
}
class D {}
//class E extends SelfBounded<D>
