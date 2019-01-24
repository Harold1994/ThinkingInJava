package Review.TypeInfo;

public class Person {
    public final String first;
    public final String second;
    public final String address;

    public Person(String first, String second, String address) {
        this.first = first;
        this.second = second;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class NullPerson extends Person implements Null {

        public NullPerson() {
            super("None", "None", "None");
        }
    }
}
