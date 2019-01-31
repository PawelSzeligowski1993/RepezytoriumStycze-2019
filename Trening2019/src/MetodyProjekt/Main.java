package MetodyProjekt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczakol;
        int liczbaprostokatow;
        int liczbatrujkatow = 10;
        int a;
        int h;
        String kolor ;



//        String name;
//        System.out.println("Podaj kolor");
//        kolor = scanner.nextLine();
//        System.out.println("Podaj a");
//        a= scanner.nextInt();
//        System.out.println("Podaj h");
//        h = scanner.nextInt();
//
//
//
//        Trójkąty trójkąty = new Trójkąty(a,h,kolor);
//
//        System.out.println(trójkąty.getA());
//        System.out.println(trójkąty.getH());
//        System.out.println(trójkąty.getKolor());
//        //trójkąty.getA();
//
//        for (int i = 0; i<10; i++){
//            System.out.println("Sey my name");
//            name = scanner.nextLine();
//
//
//        }




        List<Trójkąty> ListaTrojkatow = new ArrayList<>();


//        ListaTrojkatow.add(new Trójkąty(a,h,kolor));
//        System.out.println(ListaTrojkatow);





        ListaTrojkatow.add(new Trójkąty(4,4,"niebieski"));
        ListaTrojkatow.add(new Trójkąty(5,5,"niebieski"));
        ListaTrojkatow.add(new Trójkąty(5,5,"niebieski"));
        ListaTrojkatow.add(new Trójkąty(5,5,"niebieski"));

        System.out.println(ListaTrojkatow.size());
        for (Trójkąty s: ListaTrojkatow){
            System.out.println(s +" ");
        }









//        Kola[] kolas = new Kola[0];
//        Prostokąty[] prostokąties = new Prostokąty[0];
//        Trójkąty[] trójkąties = new Trójkąty[0];
//        Kola kolo2 = new Kola("Niebieski", 5);
//
//
//
//        //System.out.println(kolo1.powierzchniaKola());
//        //kolo1.powierzchniaKola();
//        //System.out.println(kolo2.powierzchniaKola());
//        //kolo2.powierzchniaKola();
//
//        System.out.println("Podaj liczbę kół do wprowadzenia");
//        liczakol = scanner.nextInt();
//        for (int x = 0; x <liczakol; x++ ){
//
//          //  kolas[x] = new Kola();
//        }
//

    }
}
