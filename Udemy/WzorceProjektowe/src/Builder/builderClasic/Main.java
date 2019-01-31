package Builder.builderClasic;

import Builder.builderClasic.house.*;

public class Main {
    public static void main(String[] args) {

        //instancja konkretnych Builderow
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector houseDirector = new HouseDirector(bigHouseBuilder);
        houseDirector.buildHouse();
        

        // tworzymy naszego Directora (derektor budowy domu)
        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);
        System.out.println("\n"+houseDirector);
    }
}
