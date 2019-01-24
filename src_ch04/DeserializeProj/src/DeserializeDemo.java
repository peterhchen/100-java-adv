import java.io.*;
public class DeserializeDemo {
    public static void main (String[] args) {
        Employee e = null;
        try {
            FileInputStream fIn =
                    new FileInputStream("C:/Work/MicroService/java/tutorialspoint/03_JavaAdv/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fIn);
            e = (Employee)in.readObject();
            in.close();
            fIn.close();

        } catch (IOException err) {
            err.printStackTrace();
            return;
        } catch (ClassNotFoundException cErr) {
          cErr.printStackTrace();
          return;
        }

        System.out.println("Deserialized data saved in: ");
        System.out.println("C:/Work/MicroService/java/tutorialspoint/03_JavaAdv/employee.ser");
        System.out.println ("Name: " + e.name);
        System.out.println ("Address: " + e.address);
        System.out.println ("SSN: " + e.SSN);
        System.out.println ("NUmber: " + e.number);
    }
}


