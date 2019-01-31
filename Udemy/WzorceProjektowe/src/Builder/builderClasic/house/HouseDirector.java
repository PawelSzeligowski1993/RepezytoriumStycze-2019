package Builder.builderClasic.house;

public class HouseDirector {

    // prywatne pole HauseBuilder bedzie przechowywać obiekt który bedzie implementował interface HouseBuilder
    private HouseBuilder houseBuilder;

    //tworzymy konstruktor dla obiektu houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }


    // w tej metodzie za pomoca houseBuildera bedziemy budować poszczególne lemementy naszego domu
    public void buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.builroof();
        houseBuilder.buildwindows();
        houseBuilder.builddoors();
        houseBuilder.buildgarage();
    }

    //metoda ma zwracac gotowy wybudowany dom
    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
