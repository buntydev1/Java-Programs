import java.io.*;
 class abc
 {
     int a,b,c;
     abc()
    {
        System.out.println("This is Default constructor");
    }
    abc(int p, int q)
    {
        System.out.println("This is Parameterize constructor");
        p = a ;
        q = b;
        System.out.println("this is value of a " + p);
        System.out.println("this is value of b = " q);
    }
    void disp()
    {
        c = a + b;
        System.out.println("Addition of two numbers is " + c);
    }
 }
 class cons_demo
 {
     public static void main(String [] args)
     {
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);
         abc x = new abc();
         abc y = new abc(a,b);
         y.disp();
     }
 }