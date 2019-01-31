package MetodyProjekt;

public class Trójkąty {
    double a;
    double h;
    String kolor;

    public Trójkąty(double a, double h, String kolor) {
        this.a = a;
        this.h = h;
        this.kolor = kolor;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }


    double poleTr(){
        double pole;
        pole = (a/2)*h;
        return pole;
    }

    double obwTrojkata(){
        double c;
        double obwTr;
        c= Math.sqrt((a*a)+(h*h));
        obwTr = a+h+c;

        return obwTr;
    }




}
