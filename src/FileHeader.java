
import java.io.*;

public class FileHeader {

    private static byte HEADER_SIZE = 8;
    private static byte BYTE_ORDER = 2;
    private static byte VERSION = 2;
    private static byte FIRST_OFFSET = 4;
    

    public FileHeader(String fileName) {
        try {
            FileInputStream myInputFile = new FileInputStream(fileName);
            for (int i = 0; i < BYTE_ORDER; i++) {
                System.out.printf("%02X", myInputFile.read());
            }
            myInputFile.close();
        } catch (IOException ex) {
            System.out.println("File Error!");
        }
    }

}
