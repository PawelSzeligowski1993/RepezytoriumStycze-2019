package aPomoce.start;


import java.util.Scanner;

public class Petle3 {
    public static void main(String[] args) {
        /*
        14. ** Na bazie zadania 12 dokonaj niezbędnych modyfikacji, aby otrzymać piramidę:
            @
           @@@
          @@@@@
         @@@@@@@
        @@@@@@@@@
       @@@@@@@@@@@
15. ** Zmodyfikuj zadanie 14, aby pobierać od użytkownika liczbę która określi wielkość piramidy (wysokość) – nie więcej niż 12
         */
        Scanner skaner = new Scanner(System.in);
        int index;
        char znak = '_';
        char znak2 = 'x';
        System.out.println("Znak tła piramidy to: " + znak);
        znak = skaner.next().charAt(0);
        System.out.println("Znak wypełnienia piramidy to: " + znak2);
        znak2 = skaner.next().charAt(0);


        System.out.println("Podaj wysokość piramidy");
        int osY = skaner.nextInt();
        char tab[] = new char[(2*osY)-1];

       int osX = tab.length;

        System.out.println(osX);

        int srodek = (osX/2)+1;



//        ustawiam macierz dowolnych znaków
        for (int i = 0; i<osX; i++){
            tab[i] = znak;


         if (i==osX-1){
            for(int j = 0; j<osY; j++) {
              //  System.out.println(tab);
            }
            }

        }

        //Nadpisywanie macierzy
        System.out.println("Srodek wynosi: " + srodek);


        for(int i = 0;i<osY;i++){
            tab[srodek-1]=znak2;
            tab[(srodek-1)-i]=znak2;
            tab[(srodek-1)+i]=znak2;

            System.out.println(tab);

        }


    }
}
