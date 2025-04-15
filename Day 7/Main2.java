// wap in java to define two classs AP and GP which implements runable interface print
//  the sum series in the run methid of AP class and print the multiple series in the run method of GP
//   class create obj of both classes in main method and print the series.




// Class to print Arithmetic Progression (AP)
class AP implements Runnable {
    int a; // First term of AP
    int d; // Common difference
    int n; // Number of terms

    // Constructor to initialize the values
    AP(int a, int d, int n) {
        this.a = a;
        this.d = d;
        this.n = n;
    }

    // Implementing the run method to print the AP series
    @Override
    public void run() {
        System.out.println("Arithmetic Progression (AP) Series:");
        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
        }
        System.out.println(); // for a new line
    }
}

// Class to print Geometric Progression (GP)
class GP implements Runnable {
    int a; // First term of GP
    int r; // Common ratio
    int n; // Number of terms

    // Constructor to initialize the values
    GP(int a, int r, int n) {
        this.a = a;
        this.r = r;
        this.n = n;
    }

    // Implementing the run method to print the GP series
    @Override
    public void run() {
        System.out.println("Geometric Progression (GP) Series:");
        for (int i = 0; i < n; i++) {
            int term = a * (int) Math.pow(r, i); // Using a * r^i
            System.out.print(term + " ");
        }
        System.out.println(); // for a new line
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Creating objects of AP and GP
        AP ap = new AP(1, 3, 10); // AP with first term 1, common difference 3, and 10 terms
        GP gp = new GP(2, 2, 10); // GP with first term 2, common ratio 2, and 10 terms

        // Creating threads for both AP and GP classes
        Thread thread1 = new Thread(ap);
        Thread thread2 = new Thread(gp);

        // Starting both threads
        thread1.start();
        thread2.start();

    }
}
