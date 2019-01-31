package buffWriteAndRideProjekt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MethodWrite  {

    String fileName;
    FileWriter fileWriter = null;
    int liczbaLini;
    String napis;

    public  void zapis() throws IOException

    {

        try {
            fileWriter = new FileWriter(fileName);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwe Pliku");
            fileName = scanner.nextLine();
            System.out.println("Podaj liczbe lini do wprowadzenia");
            liczbaLini = scanner.nextInt();

            for (int i=0; i<liczbaLini;i++) {
                System.out.println("Napis nr: " +i);
                int j =0;
                do {
                    System.out.println("Podaj napis i = " + j);
                    napis = scanner.nextLine();
                    if (napis.length() !=0){
                        j++;
                        System.out.println(napis);
                        fileWriter.write(napis + "\n");
                    }else {
                        System.out.println("Pusty Napis");
                    }
                }while (j == 0) ;
            }
        } catch (IOException ex) {
            System.out.println("Problem z dostepem do pliku");
        } finally {
            if (fileWriter == null){
                System.out.println("Problem");
                fileWriter.close();
            }else
                fileWriter.close();

        }
    }
}
