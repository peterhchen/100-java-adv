import java.util.*;
// Dictionary is obsolete. Use Map and HashMap instead.
public class DictDemo {
    public static void main (String[] args) {
        Map m1 = new HashMap ();
        m1.put ("Peter Chen", "62");
        m1.put ("Jasmine Chen", 24);
        m1.put ("Jessica Chen", 31);
        m1.put ("Jason Chen", 28);
        m1.put ("Jonatha Chen", 19);
        System.out.println ("Map Elements: ");
        System.out.println (m1);
    }
}
