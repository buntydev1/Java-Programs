import java.io.*;

class demo {
    int a, b, c;

    demo() {
        System.out.println("This is Default constructor");
    }

    demo(int p, int q)
    {
        System.out.println("This is Parameterize constructor");
        p = a ;
        q = b;
        System.out.println("this is value of a " + p);
        System.out.println("this is value of b = " q);
    }

    void disp() {
        c = a + b;
        System.out.println("Addition of two numbers is " + c);
    }
}

class cons_demo {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        demo x = new demo();
        demo y = new demo(a, b);
        y.disp();
    }
}