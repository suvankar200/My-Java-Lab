
public class Box {

    int length;
    int breadth;
    int height;
    int volume;

    Box(int length) {
        this.length = length;
        this.breadth = length;
        this.height = length;
    }

    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void calvolume() {
        if (length == breadth && breadth == height) {
            volume = length * length * length;
        } else {
            volume = length * breadth * height;
        }
    }

    
        void display () {
        if (length == breadth && breadth == height) {
            System.out.println("Volume of cube is: " + volume);
        } else {
            System.out.println("Volume of cuboid is: " + volume);
        }
    }

    public static void main(String[] args) {
        Box ob1 = new Box(3);
        ob1.calvolume();
        ob1.display();
        Box ob2 = new Box(2, 2, 3);
        ob2.calvolume();
        ob2.display();
    }
}
