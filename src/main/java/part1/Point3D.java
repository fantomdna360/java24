package part1;

import java.awt.Point;

public class Point3D extends Point{
    public int z;

    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    public void move(int x, int y, int z) {
        this.z = z;
        super.move(x,y);
    }

    public void translate(int x, int y, int z) {
        this.z += z;
        super.translate(x,y);
    }

    public void printPoint3D(int x, int y, int z) {
        System.out.println("Трехмерная точка находится в "
                + this.x + "."
                + this.y + "."
                + this.z);
    }
}
