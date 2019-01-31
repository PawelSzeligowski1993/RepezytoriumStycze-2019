//Small house bilder i BigHouseBilder = klasy typu builder

package Builder.builderClasic.house;

public class SmallHouseBuilder implements HouseBuilder {

    private House house;

    public SmallHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildWalls() {
       this.house.setWalls("small walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("small floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("small Rooms");
    }

    @Override
    public void builroof() {
        this.house.setRoof("small Roof");
    }

    @Override
    public void buildwindows() {
        this.house.setWindows("small windows");
    }

    @Override
    public void builddoors() {
        this.house.setDoors("small doors");
    }

    @Override
    public void buildgarage() {
        this.house.setGarage("small garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
//Ctrl+alt+l = formatowanie kodu