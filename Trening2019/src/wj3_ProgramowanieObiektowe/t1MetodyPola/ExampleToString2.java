package wj3_ProgramowanieObiektowe.t1MetodyPola;

public class ExampleToString2 {
    private int month;
    private int day;
    private int year;

    //konstruktor
    public ExampleToString2(int m, int d, int y){
        month = m;
        year = y;
        day = d;

        System.out.printf("The constructor fot this is %s\n",this);
    }

    public String toString(){
        return String.format("%d/%d/%d",month,day,year);
    }
}
