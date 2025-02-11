/* define a class animal with a single TYPE and the constructor to initialize the veriable difine two child classes of animal class
called mammel and reptile with the single veriable  livein.constructor to initialize the veriable of both the classes and display methode to show 
the veriable. 
create two child classes mammel named cat and tiger with single veriable food.initialize the veriable with coonstructor .
write the display methode to show the food type of each classes .create 2 child classes of reptile lizerd and crocodile with the veriable length 
initialize the veriable with constructor.
*/

class Animal
{
    String type;
    Animal(String t)
    {
        type=t;
    }
}

class Mammal extends Animal
{
    String liveIn;
    Mammal(String t, String l)
    {
        super(t);
        liveIn=l;
    }
    void display()
    {
        System.out.println(type+" "+liveIn);
    }
}

class Reptile extends Animal
{
    String liveIn;
    Reptile(String t, String l)
    {
        super(t);
        liveIn=l;
    }
    void display()
    {
        System.out.println(type+" "+liveIn);
    }
}

class Cat extends Mammal
{
    String food;
    Cat(String t, String l, String f)
    {
        super(t,l);
        food=f;
    }
    void display()
    {
        System.out.println(type+" "+liveIn+" "+food);
    }
}

class Tiger extends Mammal
{
    String food;
    Tiger(String t, String l, String f)
    {
        super(t,l);
        food=f;
    }
    void display()
    {
        System.out.println(type+" "+liveIn+" "+food);
    }
}

class Lizard extends Reptile
{
    int length;
    Lizard(String t, String l, int len)
    {
        super(t,l);
        length=len;
    }
    void display()
    {
        System.out.println(type+" "+liveIn+" "+length);
    }
}

class Crocodile extends Reptile
{
    int length;
    Crocodile(String t, String l, int len)
    {
        super(t,l);
        length=len;
    }
    void display()
    {
        System.out.println(type+" "+liveIn+" "+length);
    }
}

public class Main12
{
    public static void main(String args[])
    {
        Cat ob1=new Cat("Mammal","Land","Milk");
        Tiger ob2=new Tiger("Mammal","Land","Meat");
        Lizard ob3=new Lizard("Reptile","Water",12);
        Crocodile ob4=new Crocodile("Reptile","Water",15);
        ob1.display();
        ob2.display();
        ob3.display();
        ob4.display();
    }
}
