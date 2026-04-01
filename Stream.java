import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("Xyz.txt");
            fos = new FileOutputStream("Abc.txt");

            int temp;
            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }

            System.out.println("File copied successfully!");

        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}
