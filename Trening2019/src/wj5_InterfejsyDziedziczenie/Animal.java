package wj5_InterfejsyDziedziczenie;

public abstract class Animal {

    public String name;
    public String age;
    public String weight;
    public String f;

    /**
     * Nazwa zwierzaka
     */

    public  void setName(String name){
        this.name = name;
    }

    /**
     *  Starzeje się wiec moj wiek wzrasta...
     */
    public void growOld(int age) {
        this.age += age;
    }

    /**
     * Jem wiec staje się cięższy
     */
    public abstract void eat(double weight);
//    {
//        this.weight += weight;
//    }

    /**
     * mam masę wiec dysponuje siłą
     * @param f
     */
    public void force(double f){
        this.f += 1/2*f;
    }
}
