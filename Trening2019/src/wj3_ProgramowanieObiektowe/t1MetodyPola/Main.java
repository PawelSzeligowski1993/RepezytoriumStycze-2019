package wj3_ProgramowanieObiektowe.t1MetodyPola;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(); // tworzymy obiekt
        person1.forname = "Jan"; // przypisujemy polu imię  wartość
        person1.surname = "Kowalski";
        person1.age = 35;
        person1.introduceYourself(); // metoda
        person1.growOld(5); // metoda z parametrami
        person1.introduceYourself();// metoda

        Person1 person2 = new Person1("Tomasz", "Nowak", 56);// konstruktor z parametrami
        person2.introdouceYourself();


        Person2 person3 = new Person2("Jacek","Placek", 38);
        person3.introduceYourself();

    }
}
