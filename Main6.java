
class Transport {

    String trid;
    String trname;

    Transport(String id, String name) {
        trid = id;
        trname = name;
    }
}

class RoadTransport extends Transport {

    String type;

    RoadTransport(String id, String name, String type) {
        super(id, name);
        this.type = type;
    }

    void display() {
        System.out.println(trid + " " + trname + " " + type);
    }
}

class WaterTransport extends Transport {

    String speed;

    WaterTransport(String id, String name, String speed) {
        super(id, name);
        this.speed = speed;
    }

    void display() {
        System.out.println(trid + " " + trname + " " + speed);
    }
}

class AirTransport extends Transport {

    String cl;

    AirTransport(String id, String name, String cl) {
        super(id, name);
        this.cl = cl;
    }

    void display() {
        System.out.println(trid + " " + trname + " " + cl);
    }
}

class Main6 {

    public static void main(String[] args) {
        RoadTransport ob1 = new RoadTransport("R101", "car", "Private");
        WaterTransport ob2 = new WaterTransport("W101", "Ship", "Fast");
        AirTransport ob3 = new AirTransport("A101", "Aeroplane", "Business");
        ob1.display();
        ob2.display();
        ob3.display();
    }
}
