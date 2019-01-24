package Review.Generic;

public class ComparablePet implements Comparable<ComparablePet>{
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}

class Cat extends  ComparablePet implements Comparable<ComparablePet> {

}
