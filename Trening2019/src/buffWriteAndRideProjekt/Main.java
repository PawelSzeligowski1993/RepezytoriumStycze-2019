package buffWriteAndRideProjekt;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        MethodWrite methodWrite = new MethodWrite();
        MethodRead methodRead = new MethodRead();
        MethodOfCount methodOfCount = new MethodOfCount();

        Boolean odczyt = false;
        Boolean zapis = false;

        try {
            int i = 0;

            do {
                System.out.println("\nSiemka, co chcesz zrobić?");
                System.out.println("Zapis = 1 , Odczyt = 2, Obliczanie rozmiaru pliku 3 ");
                i = scanner.nextInt();


                if (i==1){
                    System.out.println("Wybrano Zapis");
                    methodWrite.zapis();
                    //i++;
                }else if (i==2){
                    System.out.println("Wybrano Odczyt");
                    methodRead.odczyt();
                    //i++;
                }else if(i==3){
                    System.out.println("Wybrano Obliczanie rozmiaru tekstu");
                    methodOfCount.countReader();

                }

                else {
                    i = 0;
                    zapis = false;
                    odczyt = false;
                }

            } while (i != 0);
        }catch (InputMismatchException ex){
            System.out.println("Błąd struktury danych, nie wprowadzono liczby");
        }
    }


        // methodWrite.zapis();
}



