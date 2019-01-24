import java.util.*;
// HashTable is Synchronized and HashMap is asynchronized.
public class HashTableDemo {
    public static void main (String[] args) {
        Hashtable balance = new Hashtable ();
        Enumeration names;
        String str;
        double bal;

        balance.put ("Peter", new Double (100000.00));
        balance.put ("Jessica", new Double (80000.00));
        balance.put ("Jonathan", new Double (1000.00));
        names = balance.keys();
        while (names.hasMoreElements ()) {
            str = (String) names.nextElement();
            System.out.println (str + ": " + balance.get(str));
        }

    }
}
