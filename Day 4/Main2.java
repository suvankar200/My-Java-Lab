interface doadd{
    public void add();
}
interface dosub{
    public void sub();

}

interface dodiv{
    public void div();
}

class Calculator implements doadd,dosub,dodiv{
    int a,b,result;
    Calculator(int x, int y)
    {
        a=x;
        b=y;
    }
    public void add()
    {
        result=a+b;
        System.out.println("Sum is: "+result);
    }
    public void sub()
    {
        result=a-b;
        System.out.println("Difference is: "+result);
    }

    public void div()
    {
        result=a/b;
        System.out.println("Division is: "+result); 
    }

    
}

class Main2{
    public static void main(String srgs[])
    {
        Calculator ob=new Calculator(5,8);
        ob.add();
        ob.sub();
        ob.div();
    

    }
}