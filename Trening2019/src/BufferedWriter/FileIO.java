package BufferedWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {

        FileIO fi = new FileIO();

        String strTextFile = "C:\\Users\\pawel\\Desktop\\Java_Pliki/record";

        fi.ReadFile(strTextFile);


    }

    public void ReadFile(String strFile){
        String strBuffer;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(strFile)))
        {
            while ((strBuffer = bufferedReader.readLine())!=null){
                System.out.println(strBuffer);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
