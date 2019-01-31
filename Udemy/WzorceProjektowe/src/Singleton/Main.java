package Singleton;

import Singleton.patterns.singleton.GameEngine;

public class Main {
    public static void main(String[] args) {

        GameEngine engine1 = GameEngine.getInstance();

        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine1==engine2);
    }
}
