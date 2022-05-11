import part1.Point3D;

import java.awt.*;

public class PointTester {
    public static void main(String[] args) {
        Point location1 = new Point(11,22);
        Point3D location2 = new Point3D(7,6,64);

        System.out.println("Двумерная точка находится в "
                + location1.x + "."
                + location2.y);
        System.out.println("Она перемещается в 4.13");
        location1.move(4,13);

        location2.printPoint3D(location2.x, location2.y, location2.z);
        location2.move(4,13, 67);
        location2.printPoint3D(location2.x, location2.y, location2.z);


    }
}
