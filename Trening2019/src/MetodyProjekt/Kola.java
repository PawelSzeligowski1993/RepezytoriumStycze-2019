package MetodyProjekt;

public class Kola {
    String kolor;
    double r;

    public Kola(String kolor, double r) {
        this.kolor = kolor;
        this.r = r;
    }

    public double getPromien() {
        return r;
    }

    public void setPromien(double promien) {
        this.r = promien;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }




    double polaKola(){
        double pole;
        pole = r*r*Math.PI;
        return pole;
    }

    double powierzchniaKola (){
        double powKo;
        powKo = 2*Math.PI*r;
        return powKo;
    }
}
