class A
{
    int x;
    void getx()
    {
        x=5;
    }
}

 class B {

    int y;
    void gety()
    {
        y=10;
    }
}

class C 
{
    int s;
    void add(A a, B b)
    {
        s=a.x+b.y;
    }
    void show()
    {
        System.out.println("Sum is: "+s);
    }
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        a.getx();
        b.gety();
        c.add(a, b);
        c.show();
    }
}



