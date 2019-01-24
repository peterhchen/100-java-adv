import java.util.*;
// Do not define class HashMap, it will hide the HashMap in util.HashMap
public class HashMapDemo {
    public static void main (String[] args) {
        HashMap<Integer, String> hmap = new HashMap <Integer, String>();
        hmap.put (19, "Jonathan Chen");
        hmap.put (31, "Jessica chen");
        hmap.put (62, "Peter Chen");
        // DIsplay content using Iterator
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println ("Key is: " + mentry.getKey());
            System.out.println ("Value is: " + mentry.getValue());
        }

    }
}
