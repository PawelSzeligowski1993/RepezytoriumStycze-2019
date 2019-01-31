package Builder.builderClasic.house;

public interface HouseBuilder {

    void buildWalls();
    void buildFloors();
    void buildRooms();
    void builroof();
    void buildwindows();
    void builddoors();
    void buildgarage();

    // metoda która po uprzedniej imlementacji zwróci nam gotowy wybudowany obiekt typu hause

    House getHouse();



}
