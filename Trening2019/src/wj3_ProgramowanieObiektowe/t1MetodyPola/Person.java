package wj3_ProgramowanieObiektowe.t1MetodyPola;

public class Person {
    public String forname;
    public String surname;
    public int age;

    public void introduceYourself(){
        System.out.println("Nazywam się " + forname + ". Mam " + age + " lat.");
    }

    /**
     *Metoda dorosnij, zwiększająca wiek osoby o wskazaną ilośc lat
     */

    public int growOld(int years){
        age += years;
        return age;
    }

}
