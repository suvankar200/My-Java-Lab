// Q3.
// Write a Java program to define the classes Add, Sub, Div, and Mod, which are the child classes of the Thread class.
// All the classes have two member variables which are initialized using the constructor of the respective classes.
// The priority of each class has to be set based on user choice.
// Depending on the priority, the run() method in each class will be invoked, and print the respective result of operation classes.





import java.util.Scanner;

class Add extends Thread {
    int a, b;

    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Addition: " + (a + b));
    }
}

class Sub extends Thread {
    int a, b;

    Sub(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Subtraction: " + (a - b));
    }
}

class Div extends Thread {
    int a, b;

    Div(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Division: Cannot divide by zero");
    }
}

class Mod extends Thread {
    int a, b;

    Mod(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        if (b != 0)
            System.out.println("Modulus: " + (a % b));
        else
            System.out.println("Modulus: Cannot perform modulus with zero");
    }
}

class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get two numbers from user
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Creating threads
        Add t1 = new Add(x, y);
        Sub t2 = new Sub(x, y);
        Div t3 = new Div(x, y);
        Mod t4 = new Mod(x, y);

        // Set priority based on user choice (1 to 10)
        System.out.println("\nSet priority for each operation (1 to 10):");

        System.out.print("Priority for Addition: ");
        t1.setPriority(sc.nextInt());

        System.out.print("Priority for Subtraction: ");
        t2.setPriority(sc.nextInt());

        System.out.print("Priority for Division: ");
        t3.setPriority(sc.nextInt());

        System.out.print("Priority for Modulus: ");
        t4.setPriority(sc.nextInt());

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
