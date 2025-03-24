interface one{
    float a=10;
    public void display();
}

class Two implements one{
    float b,sum;
    Two(float x){
        b=x;
    }
    public void display()
    {
        sum=a+b;
        System.out.println("Sum is: "+sum);
    }
}

class Main1{
    public static void main(String agrs[]){
        Two ob=new Two(20);
        ob.display();
    }
}