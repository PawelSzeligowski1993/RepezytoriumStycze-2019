package MetodyProjekt;

public class Prostokąty {
    double a;
    double b;
    String kolor;

    public Prostokąty(double a, double b, String kolor) {
        this.a = a;
        this.b = b;
        this.kolor = kolor;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    double poleProstokata(){
        double pole;
        pole = a*b;
        return pole;
    }

    double ObwódProstokata (){
        double powKo;
        powKo = (2*a)+(2*b);
        return powKo;
    }

}
