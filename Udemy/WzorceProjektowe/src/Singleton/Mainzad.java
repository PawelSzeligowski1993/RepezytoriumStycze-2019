package Singleton;

import Singleton.patern.singletonsZad.GuessGame;

public class Mainzad {
    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if (game == anotherGameReference){
            System.out.println("Singleton!");
            if (score == anotherGameReference.getScore()){
                System.out.println("I punkty się nie zgadzają !");
            }
        }
    }
}
