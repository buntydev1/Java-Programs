package arithmatic;

import java.io.*;

public class calculator {
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition of two numbers is " + c);
    }

    public void sub(int a, int b) {
        int c = a - b;
        System.out.println("Substaction of two numbers is " + c);
    }

    public void mul(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication of two numbers is " + c);
    }

    public void div(int a, int b) {
        int c = a / b;
        System.out.println("Division of two numbers is " + c);
    }

    /*
     * public void per(int a, int b) { int c = a*b/2; }
     */
    public void si(int p, int r, int n) {
        int si = p * r * n / 100;
        System.out.println("Simple interest is " + si);
    }
}
