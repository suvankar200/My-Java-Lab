class Fruit {
    String name;
    void getname(String x)
    {
        name=x;
    }
    void showname()
    {
        System.out.println("Name of the fruit is: "+name);
    }
}
class Orange extends Fruit
{
    String season;
    int price;
    void getdata(String s,int x)
    {
        price=x;
        season=s;
    }
    void display()
    {
        System.out.println("Name of the Season: "+season);
        System.out.println("Price of the fruit is: "+price);
    }
}
public class Main
{
    public static void main(String[] args) {
        Orange ob=new Orange();
        ob.getname("Orange");
        ob.getdata("winter", 50);
        ob.showname();
        ob.display();
    }
}
