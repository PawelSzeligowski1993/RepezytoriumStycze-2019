package Builder.builderClass;

import Builder.builderClass.house.House;

public class Main {
    public static void main(String[] args) {
//        House house1 = new House("walls","floors","rooms","windows","doors","garage");
//        House hause2 = new House()

        //ponizej utowrzony zostal gotowy obiekt typu house, na koncu stawiamy build
        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildfloors("floors")
                .buildroof("roof")
                .buildrooms("room")
                .build();

        System.out.println(house);
    }
}
