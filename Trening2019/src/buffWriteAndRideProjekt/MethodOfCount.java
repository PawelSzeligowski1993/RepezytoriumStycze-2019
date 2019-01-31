package buffWriteAndRideProjekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MethodOfCount {
    //String fileName;
    //int x =0;
    BufferedReader bf = null;
    public int countReader ()throws IOException {
        int x = 100000;
        int y = 0;


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj nazwe pliko którego zawartość chcesz poddać procesowi liczenia");
            String fileName = scanner.nextLine();

            bf = new BufferedReader(new FileReader(fileName));
            String linia = null;
            String linia1 = null;
            int countline = 0;
            int linelenght = 0;

           // String[] lineTab= new String[countline];
            do {
                linia = bf.readLine();
                if (linia!=null){
                    countline ++;
                    //lineTab[countline] = linia;
                }
            }while (linia !=null);

            String[] lineTab= new String[countline];

            int k=0;
            do{

              linia1 = bf.readLine();
              if(linia!=null){

                  lineTab[k] = linia1;
                  System.out.println(lineTab[k] + k);
                  k++;
              }
            }while (linia !=null);




            System.out.println("Tekst posiada " + countline + " zapisanych lini");

            int[] lineLenghtTab = new int[countline];
            for (int i = 0; i<countline; i++){
                //NULPOINTEREXCEPTION
                //lineLenghtTab[i] = lineTab[i].length();
                linelenght = i;//lineTab[i].length();

                //lineLenghtTab[i] = linelenght;
                System.out.println("dlugosc lini nr "+ i + "wynosi" + linelenght);
                System.out.println(lineLenghtTab[i]);
            }
            x = countline;

            return x;



        }catch (IOException ex){
            System.out.println("Problem z odczytem pliku");
            x=0;
            return x;

        }
        finally {
            bf.close();
        }
    }
}
