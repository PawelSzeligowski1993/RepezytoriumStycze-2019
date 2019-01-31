package wj4_AlgorytmyiStrukturyDanych;

import java.util.Scanner;

public class Tablica {
    public static void main(String[] args) {

        int[] a;
        long[] b;
        String[] c;

        a = new int[100];
        b = new long[10];
        c = new String[5];


        a[0] = 10;
        a[10] = 245;
        a[34] = -27;


        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj [0]");

        c[0] = "ALA";
        c[2] = "MA";
        c[4] = "KOTA";

        for(String element:c) {
            if (element==null){
                System.out.println("_");
            }else
            System.out.println(element);
        }

        char[] d = new char[10];

        for (int i =0; i<d.length; i++){
            d[i] ='x';
            if (i==d.length-1){
                for (int j = 0; j<d.length; j++){
                    System.out.println(d);
                }
            }
        }




    }
}
