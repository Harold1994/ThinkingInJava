package Review.TypeInfo;
class baseclass {
    static int i = 0;
    static {
        System.out.println("i=" + i);
        System.out.println("baseclass static");
    }
    int j = 0;
    public baseclass() {
        System.out.println("construct base class");
    }
}
class other {
    int j = 0;
    static {
        System.out.println("other static");
    }
    public other() {
        System.out.println("construct other");
    }
    public void getj (){
        System.out.println(j + "");
    }

}
public class LoadSequence extends baseclass{
    other o = new other();

    static int i = 6;
    static {
        System.out.println("i = " + i);
        System.out.println("loadsequence static");
    }


    public static void main(String[] args) {
        LoadSequence ls = new LoadSequence();
    }

}
