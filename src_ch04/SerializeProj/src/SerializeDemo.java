import java.io.*;
public class SerializeDemo {
    public static void main (String[] args) {
        Employee e = new Employee ();
        e.name = "Peter Chen";
        e.address = "652 Calle Victoria, Sunnyvale, CA 94089";
        e.SSN = 123567871;
        e.number = 101;
        try {
            FileOutputStream fOut =
                    new FileOutputStream ("C:/Work/MicroService/java/tutorialspoint/03_JavaAdv/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream (fOut);
            out.writeObject (e);
            out.close();
            fOut.close();
            System.out.println ("Serialized data saved in: ");
            System.out.println ("CC:/Work/MicroService/java/tutorialspoint/03_JavaAdv/employee.ser");

        }
        catch (IOException err) {
            err.printStackTrace();
        }

    }
}
