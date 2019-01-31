package ObserwatorZad;


import ObserwatorZad.notification.InternetNews;
import ObserwatorZad.notification.RadioNews;
import ObserwatorZad.notification.TvNews;
import ObserwatorZad.weather.Weather;
import ObserwatorZad.weather.WeatherStatus;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather(10,120, WeatherStatus.SLONECZNIE);

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weather.registerObserver(internetNews);
        weather.registerObserver(tvNews);
        weather.registerObserver(radioNews);
        weather.notifyObservers();
        System.out.println("----------");

        Scanner scanner = new  Scanner(System.in);

        boolean runAgain = true;
        boolean zlaOdpowiedz = true;
        boolean zlaOdpowiedz2 = true;
        boolean zlaOdpowiedz3 = true;
        int przekaz = 0;
        String stan;
        String zmiana;
        do{
            do {




                    System.out.println("Jak jest na dworze? : slonce/chmury/wiatr/deszcz/snieg ");
                    stan = scanner.nextLine();
                    if (stan.equals("slonce")) {
                        weather.setPressure(1008);
                        weather.setTemperature(25);
                        weather.setWeatherStatus(WeatherStatus.SLONECZNIE);
                        zlaOdpowiedz = false;
                    } else if (stan.equals("chmury")) {
                        weather.setPressure(1007);
                        weather.setTemperature(20);
                        weather.setWeatherStatus(WeatherStatus.POCHMURNIE);
                        zlaOdpowiedz = false;
                    } else if (stan.equals("wiatr")) {
                        weather.setPressure(1006);
                        weather.setTemperature(15);
                        weather.setWeatherStatus(WeatherStatus.WIETRZNIE);
                        zlaOdpowiedz = false;
                    } else if (stan.equals("deszcz")) {
                        weather.setPressure(1005);
                        weather.setTemperature(10);
                        weather.setWeatherStatus(WeatherStatus.DESZCZOWO);
                        zlaOdpowiedz = false;
                    } else if (stan.equals("snieg")) {
                        weather.setPressure(1004);
                        weather.setTemperature(0);
                        weather.setWeatherStatus(WeatherStatus.SNIEGOWO);
                        zlaOdpowiedz = false;
                    } else {
                        System.out.println(stan + " = zla odpowiedz");
                        zlaOdpowiedz = true;
                }

               // System.out.println("\nPowtorzenie pytania = " + zlaOdpowiedz);
            }while (zlaOdpowiedz == true);

            do {
                System.out.println("Wybierz forme przekazu stanu pogody");
                System.out.println("InternetNews = 1 \nRadioNews = 2 \nTvNews = 3 \nWszytskie Media = 4");
                przekaz = scanner.nextInt();

                try {

                    switch (przekaz) {
                        case 1:
                            weather.registerObserver(internetNews);
                            weather.unregisterObserver(tvNews);
                            weather.unregisterObserver(radioNews);
                            weather.notifyObservers();
                            zlaOdpowiedz2 = false;
                            break;
                        case 2:
                            weather.unregisterObserver(internetNews);
                            weather.unregisterObserver(tvNews);
                            weather.registerObserver(radioNews);
                            weather.notifyObservers();
                            zlaOdpowiedz2 = false;
                            break;
                        case 3:
                            weather.unregisterObserver(internetNews);
                            weather.registerObserver(tvNews);
                            weather.unregisterObserver(radioNews);
                            weather.notifyObservers();
                            zlaOdpowiedz2 = false;
                            break;
                        case 4:
                            weather.registerObserver(internetNews);
                            weather.registerObserver(tvNews);
                            weather.registerObserver(radioNews);
                            weather.notifyObservers();
                            zlaOdpowiedz2 = false;
                            break;
                        default:
                            System.out.println(przekaz + " = zla odpowiedz");
                            zlaOdpowiedz2 = true;


                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Error = nie zostala wprowadzona liczba");
                    zlaOdpowiedz2 = true;
                }


            } while (zlaOdpowiedz2 == true);

           do{
               System.out.println("\nCzy pogoda uległa zmianie?:t/n");
               zmiana = scanner.nextLine();
               if (zmiana.equals("t")){
                   System.out.println("\nPogoda ulegla zmianie\n");
                   runAgain = true;
                   zlaOdpowiedz3 =false;
               }else if (zmiana.equals("n")){
                   System.out.println("Koniec programu");
                   runAgain = false;
                   zlaOdpowiedz3 = false;
               }else {
                   System.out.println("Zla odpowiedz");
                   zlaOdpowiedz3 = true;
               }
           }while (zlaOdpowiedz3 == true);



        }while (runAgain == true );

    }

}
