package buffWriteAndRideProjekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MethodRead  {

    String fileName;
    BufferedReader bf = null;

    public void odczyt() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku");
        fileName = scanner.nextLine();

        try{
            bf = new BufferedReader(new FileReader(fileName));
            String linia = null;
            do {
                linia = bf.readLine();
                if(linia!=null) {
                    System.out.println(linia);
                }
            } while (linia != null);
        } catch (IOException ex){
            System.out.println("Problem z dostempem do pliku");
        } finally {
            bf.close();
        }
    }
}
