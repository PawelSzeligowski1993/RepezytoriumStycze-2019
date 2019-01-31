package wj3_ProgramowanieObiektowe.t1MetodyPola;

public class Person2 {
    public String forname;
    public String surname;
    public int age;

    /**
     * Konstruktor domyślny
     */

    public Person2 (String forname, String surname, int age) {
        this.forname = forname;
        this.surname = surname;
        this.age = age;
    }

    public void introduceYourself(){
        System.out.println("Nazywam się" + forname + " " + surname + ".Mam " + age + " lat.");
    }

    public int growOld(int age){
        this.age += age;
        return this.age;
    }
}
