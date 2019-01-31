package wj3_ProgramowanieObiektowe.t1MetodyPola;

public class Person1 {
    public String forname;
    public String surname;
    public int age;

    /**
     * Konstruktor domyślny
     */
    public Person1() {

    }
    /**
     * Konstruktor z 3 parametrami
     */

    public Person1(String initForname, String initSurname, int initAge){
        forname = initForname;
        surname = initSurname;
        age = initAge;
    }

    public void introdouceYourself(){
        System.out.println("Nazywam się " + forname + " " + surname + ". Mam "+age+ "lat.");
    }

    public int growOld(int years) {
        age += years;
        return age;
    }
}
