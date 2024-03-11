package SerializationAndDeserialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Serialize an integer
        serializeInteger(42, "number.ser");

        // Deserialize the integer
        int loadedNumber = deserializeInteger("number.ser");

        // Display the loaded number
        System.out.println("Loaded number: " + loadedNumber);
    }

    
 // Method to serialize an integer
    public static void serializeInteger(int number, String filename) {
        try {
            // Create FileOutputStream to write object data to a file
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\CADD CENTRE\\Desktop\\number.ser");

            // Create ObjectOutputStream to write serialized objects
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Write the integer to the file
            out.writeObject(number);

            // Close the streams
            out.close();
            fileOut.close();

            System.out.println("Integer serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Method to deserialize an integer
    public static int deserializeInteger(String filename) {
        int number = 0;
        try {
            // Create FileInputStream to read object data from the file
            FileInputStream fileIn = new FileInputStream(filename);

            // Create ObjectInputStream to read serialized objects
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Read the object (integer) from the file
            number = (int) in.readObject();

            // Close the streams
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return number;
    }
}
