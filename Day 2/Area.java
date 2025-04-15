
import java.util.Scanner;

public class Area {

    double area;

    void calarea(int radius) {
        area = 3.14 * radius * radius;
    }

    void calarea(float side) {
        area = side * side;
    }

    void show(String val) {
        System.out.println("The area of" + val + " is " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side ");
        float side = sc.nextFloat();;
        System.out.println("Enter the radius ");
        int radius = sc.nextInt();
        Area obj = new Area();
        obj.calarea(radius);
        obj.show("Circle");
        obj.calarea(side);
        obj.show("Square");

    }
}
