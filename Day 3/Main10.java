/*
 Define a class Transport with child RoadT both the classes have single variable and constructor to initialize the variable.
 RoadT class has two child class Bus and Car both the classes have single variable and constructor to initialize the variable and 
 show method to display the reocords of the Bus and Car.

 */
class Transport
{
    String type;
    Transport(String s)
    {
        type=s;
    }
    
}

class RoadT extends Transport
{
    String v_type;
    RoadT(String s,String v)
    {
        super(s);
        v_type=v;
    }
}

class Bus extends RoadT{
    String v_no;
    Bus(String s, String v, String n)
    {
        super(s,v);
        v_no=n;
    }

    void show()
    {
        System.out.println(type+" "+v_type+" "+v_no);
    }
}
class Car extends  RoadT{
    String c_no;
    Car(String s, String v, String c)
    {
        super(s,v);
        c_no=c;
    }
    void show()
{
    System.out.println(type+ " "+v_type+" "+c_no);
}

}

public class Main10
{
    public static void main(String args[])
    {
        Bus ob1=new Bus("Public","Volvo","WB 3421");
        Car ob2=new Car("Private","Suzuki","WB 1625");
        ob1.show();
        ob2.show();
        
    }
}