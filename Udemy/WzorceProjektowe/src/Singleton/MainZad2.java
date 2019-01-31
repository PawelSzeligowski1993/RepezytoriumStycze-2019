package Singleton;
import java.util.LinkedList;
import java.util.Random;

import Singleton.patern.sinletonsZad2.GuessGame2;

public class MainZad2 {
    public static void main(String[] args) {
        GuessGame2 guessGame2 = GuessGame2.getInstance();
        //guessGame2.play();


        LinkedList m = new LinkedList();
        Random generator = new Random();

        for (int i = 0; i<36; i++){
            m.add(generator.nextDouble()*10);

            if (i==35) {
                System.out.println(m);
            }
        }

    }
}
