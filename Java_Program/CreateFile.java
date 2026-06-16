// This is the create file code by the file handling Method.

import java.io.File;
public class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("Test.txt");
            if(obj.createNewFile()) {
                System.out.println("File Created = "+obj.getName());
            } else {
                System.out.println("File Already Exist");
            }
        } catch(Exception e) {
            System.out.println("Some Error is Occured");
            e.printStackTrace();
        }
    }
}
