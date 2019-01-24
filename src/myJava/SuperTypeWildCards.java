package myJava;
import java.util.*;
class fruit{}
class apple extends fruit{}
class jonathan extends apple{};
public class SuperTypeWildCards {
static void  writeTo(List<? super apple> apples){
	apples.add(new apple());
}
}
