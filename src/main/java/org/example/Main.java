import org.example.model.*;
import org.example.model.enums.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 5, 1, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 100);
        Wardrobe wardrobe = new Wardrobe(3, 6, 50.5);
        Carpet carpet = new Carpet(2, 3, PaintColor.RED);

        Bedroom bedroom = new Bedroom("Master", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        lamp.turnOn();
        bed.make();
        wardrobe.add();
        carpet.lying();
        ceiling.create();
        wall1.create();
    }
}
