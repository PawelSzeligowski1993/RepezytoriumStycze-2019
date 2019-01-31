package Builder.builderClass.house;

public class House {
    private String walls;
    private String floors;
    private String rooms;
    private String roof; //dach
    private String windows;
    private String doors;
    private String garage;
// Dodajemy jedyny prywatny konstruktor:
// w jego wnetrzu beda ustawione wartosci wszystkich pol w naszej orginalnej klasie
    private House(HouseBuilder houseBuilder){
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;

    }

// ------------------ KONSTRUKTORY NIE BEDA POTRZEBNE W WZORCU BUILDER --------------------------------------
//    //konstruktor1 - wszystkie opcje
//
//    public House() {
//        this.walls = walls;
//        this.floors = floors;
//        this.rooms = rooms;
//        this.roof = roof;
//        this.windows = windows;
//        this.doors = doors;
//        this.garage = garage;
//    }
//
//    //konstruktor2 - opcje wyszczuplone 1
//
//    public House(String walls, String floors, String roof, String windows, String doors, String garage) {
//        this.walls = walls;
//        this.floors = floors;
//        this.roof = roof;
//    }
//
//    //konstruktor3 - opcje wyszczuplone 2
//
//    public House(String walls, String floors, String rooms, String roof, String windows) {
//        this.walls = walls;
//        this.floors = floors;
//        this.rooms = rooms;
//        this.roof = roof;
//        this.windows = windows;
//        this.doors = doors;
//    }

   // Setery też muszą zniknąć

    public String getWalls() {
        return walls;
    }

//    public void setWalls(String walls) {
//        this.walls = walls;
//    }

    public String getFloors() {
        return floors;
    }

//    public void setFloors(String floors) {
//        this.floors = floors;
//    }

    public String getRooms() {
        return rooms;
    }

//    public void setRooms(String rooms) {
//        this.rooms = rooms;
//    }

    public String getRoof() {
        return roof;
    }

//    public void setRoof(String roof) {
//        this.roof = roof;
//    }

    public String getWindows() {
        return windows;
    }

//    public void setWindows(String windows) {
//        this.windows = windows;
//    }

    public String getGarage() {
        return garage;
    }

//    public void setGarage(String garage) {
//        this.garage = garage;
//    }


    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }

    // teraz implementujemy nasza klase wenetrzną HouseBuilder ktora jest kwintesencja wzorca

    public static class HouseBuilder{
        private String walls;
        private String floors;
        private String rooms;
        private String roof; //dach
        private String windows;
        private String doors;
        private String garage;

        // implementacja metod poszczególnych pól w naszym housebuilderze
        //beda to metody publiczne tak by mozna sie do nich dostac z zewnatrz, beda zwracaly naszego housebuildera, tak
        // by mozna chainowac poszczegolne metody ze soba

        public HouseBuilder buildWalls (String walls){
            this.walls = walls;
            return this;
        }

        public HouseBuilder buildfloors (String floors){
            this.floors = floors;
            return this;
        }

        public HouseBuilder buildrooms (String rooms){
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder buildroof (String roof){
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildwindows (String windows){
            this.windows = windows;
            return this;
        }

        public HouseBuilder builddoors(){
            this.doors = doors;
            return this;
        }

        public HouseBuilder buildgarage(){
            this.garage = garage;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
