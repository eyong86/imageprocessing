
import java.io.*;

public class ReadFile {

    public static void main(String[] args) {
        try {
            FileHeader newFile = new FileHeader("image/yoda.tif");
                
            
            FileInputStream myInputFile = new FileInputStream("image/yoda.tif");
            int value;
            int count = 0;
            while ((value = myInputFile.read()) != -1) {
                System.out.printf("%02X", value);
                count++;
                if (count % 2 != 1) {
                    System.out.print(" ");
                }
                if (count > 15) {
                    count = 0;
                    System.out.println("");
                }
            }
            System.out.println("");
            myInputFile.close();
        } catch (IOException ex) {
            System.out.println("File error!");
        }
    }
}
