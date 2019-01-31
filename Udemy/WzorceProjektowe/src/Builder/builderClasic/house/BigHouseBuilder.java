package Builder.builderClasic.house;

public class BigHouseBuilder implements HouseBuilder {

    private House house;

    public BigHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("big walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("big floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("big Rooms");
    }

    @Override
    public void builroof() {
        this.house.setRoof("big roors");
    }

    @Override
    public void buildwindows() {
        this.house.setWindows("big windows");
    }

    @Override
    public void builddoors() {
        this.house.setDoors("big doors");
    }

    @Override
    public void buildgarage() {
        this.house.setGarage("big garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
