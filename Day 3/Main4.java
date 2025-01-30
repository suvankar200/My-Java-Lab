
class Animal1 {

    String type;

    Animal1(String t) {
        type = t;
    }
}

class Dog extends Animal1 {

    String name;
    String breed;

    Dog(String x, String n,String b) {
        super(x);
        name = n;
        breed=b;
    }

    void display() {
        System.out.println(type + ":" +breed+":"+ name);
    }
}
class Main4 {

    public static void main(String[] args) {
        Dog ob = new Dog("Domastic", "Tommy","Pug");
        ob.display();
    }
}
