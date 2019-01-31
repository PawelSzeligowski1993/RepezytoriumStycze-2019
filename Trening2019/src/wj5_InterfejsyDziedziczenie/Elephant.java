package wj5_InterfejsyDziedziczenie;

public class Elephant extends Animal implements Herbivore {
    @Override
    public void eat(double weight) {
        this.weight += 1/4*weight;
    }


    @Override
    public void force(double f){
        super.force(1/3 * f);
    }

    @Override
    public void eatPlant(double weight) {
        eat(weight);
    }
}
