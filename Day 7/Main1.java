class FirstThread extends Thread {

    FirstThread() {
        super("First Thread");
        System.out.println("First Thread Created");
    }

    public void run() {
        System.out.println("First Thread starts:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("First Thread: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("First Thread interrupted");
            }
        }
        System.out.println("First Thread ends");
    }
}

class SecondThread extends Thread {

    SecondThread() {
        super("Second Thread");
        System.out.println("Second Thread Created");
    }

    public void run() {
        System.out.println("Second Thread starts:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Second Thread: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Second Thread interrupted");
            }
        }
        System.out.println("Second Thread ends");
    }
}

class Main1 {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread();
        ft.start();
        st.start();
    }
}
