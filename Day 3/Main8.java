
class Transport {

    String tr_id;
    String tr_name;

    Transport(String id, String name) {
        tr_id = id;
        tr_name = name;
    }
}

class RoadTransport extends Transport {

    String type;

    RoadTransport(String id, String name, String type) {
        super(id, name);
        this.type = type;
    }

    void display() {
        System.out.println(tr_id + " " + tr_name + " " + type);
    }
}

class WaterTransport extends Transport {

    String speed;

    WaterTransport(String id, String name, String speed) {
        super(id, name);
        this.speed = speed;
    }

    void display() {
        System.out.println(tr_id + " " + tr_name + " " + speed);
    }
}

class AirTransport extends Transport {

    String cl;

    AirTransport(String id, String name, String cl) {
        super(id, name);
        this.cl = cl;
    }

    void display() {
        System.out.println(tr_id + " " + tr_name + " " + cl);
    }
}

class Main8 {

    public static void main(String[] args) {
        RoadTransport ob1 = new RoadTransport("R101", "car", "Private");
        WaterTransport ob2 = new WaterTransport("W101", "Ship", "Fast");
        AirTransport ob3 = new AirTransport("A101", "Aeroplane", "Business");
        ob1.display();
        ob2.display();
        ob3.display();
    }
}
