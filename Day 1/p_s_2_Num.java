//Write a java program to define a class Num with a single variable and the following method get() 
// method to initialize the variable,show() method to print the value of the variable ,
// main method to create object of the class Num and call the method get() and show().

class Num{
    int x;
    void get(int x){
        this.x = x;
    }
    void show(){
        System.out.println("Value of x: "+x);
    }
    public static void main(String args[]){
        Num n = new Num();
        n.get(10);
        n.show();
    }
}