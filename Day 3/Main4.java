
class Animal1 {

    String type;

    Animal1(String t) {
        type = t;
    }
}

class Dog extends Animal1 {

    String name;

    Dog(String x, String n) {
        super(x);
        name = n;
    }

    void display() {
        System.out.println(type + ":" + name);
    }
}

class Main4 {

    public static void main(String[] args) {
        Dog ob = new Dog("Domastic", "Tommy");
        ob.display();
    }
}
