


// P.S:4
// Define the 3 classes named Add, Sub, Div with two member variables each and get methods to initialize the  variables and add(), sub() and div() methods in respective classes. All the classes have show() method to display the result of addition, substruction, division respectively. Define Main class that 


// have main() method. In main() method create objects of 3 classes and perform arithmetic operations.
//    The variables are initialized with 12 and 6 respectively. 


class Add {

    int A;
    int B;
    int sum;

    void getdata(int a, int b) {
        A = a;
        B = b;
    }

    void add() {
        sum = A + B;
    }

    void display() {
        System.out.println("The sum of two numbers is: " + sum);
    }
}

class Sub {

    int A;
    int B;
    int sub;

    void getdata(int a, int b) {
        A = a;
        B = b;
    }

    void sub() {
        sub = A - B;
    }

    void display() {
        System.out.println("The difference of two numbers is: " + sub);
    }
}

class Div {

    int A;
    int B;
    float div;

    void getdata(int a, int b) {
        A = a;
        B = b;
    }

    void div() {
        div = A / B;
    }

    void display() {
        System.out.println("The division of two numbers is: " + div);
    }
}

class Main2 {

    public static void main(String[] args) {
        Add a = new Add();
        Sub s = new Sub();
        Div d = new Div();
        a.getdata(12, 6);
        a.add();
        a.display();
        s.getdata(12, 6);
        s.sub();
        s.display();
        d.getdata(12, 6);
        d.div();
        d.display();
    }
}
