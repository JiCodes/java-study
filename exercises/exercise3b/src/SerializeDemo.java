import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {

        // Test serialization of the created rectangle object
        Shape rectangle = new Rectangle( "black", 4, 5);

        try {
            FileOutputStream fileOut = new FileOutputStream("rectangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(rectangle);
            out.close();
            fileOut.close();
            System.out.print("Serialized data is saved in rectangle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}




