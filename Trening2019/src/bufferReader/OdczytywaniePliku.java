package bufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class OdczytywaniePliku {
    public static void main(String[] args) throws IOException {

        String fileName = "plik.txt";
        BufferedReader bf = null;

        try {
            bf = new BufferedReader(new FileReader(fileName));
            String linia = null;
            do {
                    linia = bf.readLine();
                    if(linia!=null) {
                        System.out.println(linia);
                    } 

                } while (linia !=null);

        } catch (IOException ex) {
            System.out.println("Problem z dostępem do pliku");

        } finally {
//            if(bf != null){
//                System.out.println("Problem z dostepem do pliku");
//                bf.close();
//            }else {
//                bf.close();
//            }
            bf.close();
        }
    }
}
