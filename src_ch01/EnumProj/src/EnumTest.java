import java.util.Vector;
import java.util.Enumeration;

public class EnumTest {
    public static void main (String[] args) {
        Enumeration days;
        Vector dayNames = new Vector();

        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();

        System.out.println ("Vector Element:");
        for (int i = 0; i < dayNames.size(); i++) {
            System.out.println (dayNames.elementAt(i));
        }
        System.out.println ("Enumeration Element:");
        while (days.hasMoreElements()) {
            System.out.println (days.nextElement());
        }

    }
}
