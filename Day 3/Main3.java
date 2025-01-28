

// P.S:5 Define a base class Animal


//  , with type as member variable that imply domestic or wild animal. Initialize the variable with get() method. Define a derived class Cat 


// which has two member variables breed and colour. Initialize the variables with set() method. Define show() method in Cat class that 


// show the attributes of a Cat. Define a Main class and 


// create two objects of the Cat class



class Animal {

    String type;

    void get(String t) {
        type = t;
    }
}

class Cat extends Animal {

    String breed;
    String color;

    void set( String b, String c) {
       
        breed = b;
        color = c;
    }

    void show() {
        System.out.println("Type of the animal: " + type);
        System.out.println("Breed of the cat: " + breed);
        System.out.println("Color of the cat: " + color);
    }
}
public class Main3 {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.get("domestic");
        c.set("Persian", "White");
        c.show();
        Cat c1 = new Cat();
        c1.get("domestic");
        c1.set("Ragdool", "Yellow");
        c1.show();
    }
}
