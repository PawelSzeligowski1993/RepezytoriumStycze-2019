package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("C:\\Users\\pawel\\Desktop\\Java_Pliki/test1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String myArray[] = {"one", "two", "three"};
        String wirtableString ="";

        for (String item : myArray){
            wirtableString += item + ",";
        }

        wirtableString = wirtableString.substring(0, wirtableString.length() - 1);
        System.out.println(wirtableString);

        bw.write(wirtableString);
        bw.close();


    }
}
