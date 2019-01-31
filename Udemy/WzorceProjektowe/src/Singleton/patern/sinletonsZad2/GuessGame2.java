package Singleton.patern.sinletonsZad2;


import java.util.Random;
import java.util.Scanner;

public class GuessGame2 {

    private static GuessGame2 instance =new GuessGame2();
    private int score = 0;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int[] Tab = new int[50];


    private GuessGame2(){
    }

    public static GuessGame2 getInstance(){
        return instance;
    }

    public int getScore(){
        return score;
    }

    public void play(){
        int index1; int index2; int index3; int index4; int index5;

        System.out.println(Tab.length);
        for (int i = 0; i<Tab.length;i++){
            Tab[(i)] = i+1;
            System.out.print(Tab[i] + " ");
        }

        System.out.println("Podaj 5 liczb");
        index1 = scanner.nextInt();
        scanner.next();
        index2 = scanner.nextInt();
        scanner.next();
        index3 = scanner.nextInt();
        scanner.next();
        index4 = scanner.nextInt();
        scanner.next();
        index5 = scanner.nextInt();




    }

}


