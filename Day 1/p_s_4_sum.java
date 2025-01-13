/*Write a Java program to define a class Arithmetic with two member variable and following methods. 
#1 add() to do sum of to numbers and 
#2 sub() to do subtraction of two numbers
#3 mult() to multiply 2 numbers and 
#4 division two divide  two numbers.
and print the result
get() method to initialize two variable, create two objects of Arithmetic class and perform all operations*/

class Arithmetic {
    int x;
    int y;

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void add() {
        System.out.println("Sum: of "+ x+" and "+ y  +" = " + (x + y));
    }

    void sub() {
        System.out.println("Sub: of "+x+" and "+y+" = " + (x - y));
    }

    void multiply() {
        System.out.println("Multiply: of "+x+" and "+y+" = " + (x * y));
    }

    void division() {
        System.out.println("Division: of " +x+" and "+y +" = "+ (x / y));
    }

    public static void main(String args[]) {
        Arithmetic a = new Arithmetic();
        Arithmetic b = new Arithmetic();
        a.get(10, 5);
        a.add();
        a.sub();
        a.multiply();
        a.division();
        b.get(20, 5);
        b.add();
        b.sub();
        b.multiply();
        b.division();
    }
}
