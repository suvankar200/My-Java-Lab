class Num {
    int v1;

    Num(int x) {
        v1 = x;
    }
}


class Deno extends Num {

    int v2;

    Deno(int x, int y) {
        super(x);
        v2 = y;
    }

}


class Frac extends Deno {

    Frac(int x, int y) {
        super(x, y);

    }

    void display() {
        System.out.println(v1 + "/" + v2);
    }
}

class Main5 {

    public static void main(String[] args) {
        Frac ob = new Frac(2, 5);
        ob.display();
    }
}
