package Review.Collection;

import java.util.Objects;
import java.util.WeakHashMap;

class Element {
    private String indent;

    public Element(String indent) {
        this.indent = indent;
    }

    @Override
    public String toString() {
        return indent;
    }

    @Override
    public int hashCode() {
        return indent.hashCode();
    }

    @Override
    public boolean equals(Object o) {
      return o instanceof Element && indent.equals(((Element) o).indent);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + getClass().getSimpleName() + " " + indent);
    }
}
class Key extends Element {
    public Key(String indent) {
        super(indent);
    }
}

class Value extends Element {

    public Value(String indent) {
        super(indent);
    }
}
public class CanonicalMapping {
    public static void main(String[] args) {
        int size = 10;
        Key [] kets = new Key[size];
        WeakHashMap<Key, Value> map = new WeakHashMap<Key, Value>();
        for (int i = 0; i< size; i++) {
            Key k = new Key(Integer.toString(i));
            Value v = new Value(Integer.toString(i));
            if (i%3==0)
                kets[i] = k;
            map.put(k,v);
        }
        System.gc();
    }
}
