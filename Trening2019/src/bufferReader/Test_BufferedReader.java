package bufferReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test_BufferedReader {
    public static void main(String[] args) {
        BufferedReader br = null;

        String line;
        //FileReader fr;
        try {
          //  fr = new FileReader("example.txt");
            //br = new BufferedReader(fr);
            br = new BufferedReader(new FileReader("anyTEXT"));// => the same


            while ((line = br.readLine())!=null){
                System.out.println(line);
            }

            //br = new BufferedReader(new FileReader("example.txt")); => the same
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
