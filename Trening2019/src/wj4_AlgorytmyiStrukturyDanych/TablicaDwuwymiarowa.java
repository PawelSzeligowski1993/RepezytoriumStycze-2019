package wj4_AlgorytmyiStrukturyDanych;

public class TablicaDwuwymiarowa {
    public static void main(String[] args) {
        int[][] tab= new int[3][3];

        for(int i = 0; i<tab.length; i++){
            for(int k = 0; k<tab[i].length;k++){
                tab[i][k] = i+k;
            }
        }

        for (int i = 0; i<tab.length; i++){
            for (int k = 0; k<tab[i].length; k++) {
                System.out.println("tab["+i+"]["+k+"] = " + tab[i][k]);
            }
        }
    }
}
