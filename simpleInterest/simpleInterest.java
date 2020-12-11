import java.io.*;

class interest {
    void si(int p, int r, int n) {
        int s = p * r * n / 100;
        System.out.println("Simple interest is " + s);
    }

    void disp() {
        System.out.println("Demo example of si ");
    }
}

class simpleInterest {
    public static void main(String[] args) {
        interest x = new interest();
        x.disp();
        x.si(10000, 10, 2);
    }
}
