// This is the Writting File code by File Handling Method.

import java.io.FileWriter;

public class WrittingFile {
    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("Test.txt");
            Writer.write("Hello, Gourav kumar Prajapati ❤️");
            Writer.close();
            System.out.println("Successfully Write");
        } catch(Exception e) {
            System.out.println("Some Error Occured");
            e.printStackTrace();
        }
    }
}
