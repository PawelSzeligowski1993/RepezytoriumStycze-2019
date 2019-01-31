package wj5_InterfejsyDziedziczenie;

public class  Eagle extends Animal {
    @Override
    public void eat(double weight) {
        this.weight += 1/2 * weight;
    }
}
