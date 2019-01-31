package Moj_Pakiet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Do wyboru masz następujące klasy, każda posiada jakieś metody");
        System.out.println("klasa1 = Metody Matematyczne)");
        System.out.println("klasa2 = Oblicze  twój współczynnik BMI");
        System.out.println("klasa3 = Slowa- zabawa ze Stringiem");
        System.out.println("Wybierz klasę");



        String nrKlasy = skaner.nextLine();
        String klasa1 = "klasa1";
        String klasa2 = "klasa2";
        String klasa3 = "klasa3";
        String Met1 = "Metoda1";
        String Met2 = "Metoda2";

        if (nrKlasy.equals(klasa1)){
            System.out.println("ta klasa posiada 2 metody");
            System.out.println("Metoda1 - Równanie kwadratowe");
            System.out.println("Metoda2 - Obwód + Polę okręgu");
            System.out.println("Wybierz Metodę");

            String nrMet = skaner.nextLine();
            if (nrMet.equals(Met1)){
                interfejs interfejs = new interfejs() {
                    @Override
                    public void WywolajMetode() {
                        MetodyMatematyxzne.metoda1();
                    }
                };
                interfejs.WywolajMetode();
            }
            else if (nrMet.equals(Met2)){
                interfejs interfejs = new interfejs() {
                    @Override
                    public void WywolajMetode() {
                        MetodyMatematyxzne.metoda2();
                    }
                };
                interfejs.WywolajMetode();

            }


        }
        else if(nrKlasy.equals(klasa2)){
            interfejs interfejs = new interfejs() {
                @Override
                public void WywolajMetode() {
                    wspolczynikBMI.metoda3();
                }
            };
            interfejs.WywolajMetode();

        }
        else if (nrKlasy.equals(klasa3)){
            interfejs interfejs = new interfejs() {
                @Override
                public void WywolajMetode() {
                    Jakiespentle.metoda4();
                }
            };
            interfejs.WywolajMetode();
        }


/////////////////////////////////////////////////////////
       /* interfejs interfejs = new interfejs() {
            @Override
            public void WywolajMetode() {
                Scanner skaner = new Scanner(System.in);

                MetodyMatematyxzne.metoda1();
                MetodyMatematyxzne.metoda2();
                wspolczynikBMI.metoda3();
                Jakiespentle.metoda4();

            }
        };
        interfejs.WywolajMetode();
*/
        //MetodyMatematyxzne.metoda1();

    }
}

//-------------------------   Klasa Metody Matematyczne     ----------------------
class MetodyMatematyxzne{
    public static void metoda1(){
        System.out.println("Metoda liczy miejsca zerowe równaia kwadratowego");
        System.out.println("Podaj parametry równania kwadratowego ax^2+bx+c");
        Scanner skaner = new Scanner(System.in);
        // Pobieram A
        System.out.println("Podaj a");
        double a = skaner.nextDouble();
        // Pobieram B
        System.out.println("Podaj b");
        double b = skaner.nextDouble();
        // Pobieram C
        System.out.println("Podaj c");
        double c = skaner.nextDouble();

        double delta = b*b -4*a*c;

        if(delta>0)
        {
            delta = Math.sqrt(delta);
            double x1 = (-b - delta)/(2*a);
            double x2 = (-b + delta)/(2*a);
            System.out.println("Delta wynosi " + delta + "Miejsca zerowe funkcji to x1= " + x1 + ", x2= "+x2);
        }
        else if(delta == 0){
            double x1 = (-b - delta)/(2*a);
            double x2 = x1;
            System.out.println("Delta wynosi " + delta + "Miejsca zerowe funkcji to x1 = x2 = " +x1);
        }
        else {
            System.out.println("Delta < 0 brak miejsc zerowych ");
        }

    }

    public static void metoda2(){
        Scanner skaner = new Scanner(System.in);
        System.out.println("Metoda liczy obwód i promień koła o danym promieniu");
        System.out.println("Podaj promien danego koła");
        double Promien = skaner.nextDouble();

        double obwodKola = 2*Math.PI*Promien;
        double promienKola = Math.PI*Promien*Promien;

        System.out.println("Obwód koła wynosi: " + obwodKola+ "Pole kola wynosi" + promienKola);

    }
}

class wspolczynikBMI {
    public static void metoda3() {
        System.out.println("Ta metoda3 liczy twoj wspólczynnik BMI");
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj twoj wzrost w cm");
        double wzrost = skaner.nextDouble();

        System.out.println("Podaj wage");
        double waga = skaner.nextDouble();

        wzrost = wzrost / 100; //Do wyliczenia BMI
        double BMI = waga / (Math.pow(wzrost, 2)); // Math.pow -potega

        if (BMI < 18.5) {
            System.out.println("Twoje BMI wynosi: " + BMI + "jestes zbyt Szczupły / Sczupła");

        } else if (BMI > 25) {
            System.out.println("Twoje BMI wynosi: " + BMI + "jesteś zbyt otyły/otyła");
        } else {

            System.out.println("Twoje BMI wynosi: " + BMI + "God Job your weight is alright");
        }
    }

}

class Jakiespentle{
        public static void metoda4(){

            Scanner skaner = new Scanner(System.in);
            System.out.println("Podaj jakies slowo");

            String slowo = skaner.nextLine();
            int dlogoscSlowa = slowo.length();
            System.out.println("dlugosc towjego slowa wynosi" + (dlogoscSlowa+1));

            System.out.println("A teraz zagadka: co było pierwsze kura czy jajko?");
            String odpowiedz = skaner.nextLine();

            String odp1= "jajko";
            String odp2= "kura";

            if (odpowiedz.equals(odp1)){
                System.out.println("To kto wysiadowyał pierwsze jajko ?");
            }
            else if (odpowiedz.equals(odp2)){
                System.out.println("To z czego wyklula się pierwsza kura?");
            }
            else {
                System.out.println("pierwszy raz slyszę taką odpowiedz");
            }

            System.out.println("A teraz pobawimy się slowami, podaj jakieś slowo");
            String JakiesSlowo = skaner.nextLine();
            String space =" ";

            for (int i = 0; i<20; i++){
                JakiesSlowo = JakiesSlowo.concat(space);
                JakiesSlowo = JakiesSlowo.concat(JakiesSlowo) ;
                System.out.println(JakiesSlowo);
            }


            //System.out.println(tekst1.concat(tekst6));



            //String slowo = "siema";



        }
}


interface interfejs{
    void WywolajMetode();
}

