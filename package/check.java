
package Yasin;

import java.io.*;

public class check {
    public void max(int a, int b) {
        if (a > b) {
            System.out.println("Maximum number is " + a);
        } else {
            System.out.println("Maximum number is " + b);
        }
    }

    public void min(int a, int b) {
        if (b > a) {
            System.out.println("Minimum number is " + b);
        } else {
            System.out.println("Minimum number is " + a);
        }
    }

    public void possitive(int a) {
        if (a > 0) {
            System.out.println(a + "is Possitive ");
        } else if (a < 0) {
            System.out.println(a + "is Nagative");
        } else {
            System.out.println(a + "is Zero");
        }
    }

    public void add(int a, int b) {
        int c;
        c = a + b;
        System.out.println("Addition ==> " + c);
    }

    public void sub(int a, int b) {
        int c;
        c = a - b;
        System.out.println("Substraction ==> " + c);
    }

    public void mul(int a, int b) {
        int c;
        c = a * b;
        System.out.println("multiplication ==> " + c);
    }

    public void div(int a, int b) {
        int c;
        c = a / b;
        System.out.println("Division ==> " + c);
    }

    public void odd(int a) {
        if (a % 2 == 0) {
            System.out.println(a + "is Even");
        } else {
            System.out.println(a + "is Odd");
        }
    }

    public void perfect(int a) {
        int i;
        int sum = 0;
        for (i = 1; i < a; i++) {
            if (a % 2 == 0) {
                sum = sum + i;
            }
            if (a == sum) {
                System.out.println(a + "is Perfect number");
            } else {
                System.out.println(a + "is not perfect number");
            }
        }
    }

    public void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("1st number is " + a);
        System.out.println("2nd number is " + b);
    }

    public void palindrome(int a) {
        int rev = 0;
        int i;
        int t;
        t = a;
        while (a > 0) {
            i = a % 10;
            a = a / 10;
            rev = (rev * a) + i;
        }
        if (t == rev) {
            System.out.println(a + "is Palindrome number");
        } else {
            System.out.println(a + "is not Palindrome number");
        }
    }

public void armstrong(int a)
{
int sum = 0;
int n = a;
int d;
while(a>0)
{
d = a % 10;
sum = sum + (d d d);
a = a / 10;
}
if(n == sum)
{
System.out.println(a + "is Armstrong");
}
else
{
System.out.println(a + "is not Armstrong");
}
}

    public void prime(int a) {
        int c = 0;
        int i;
        for (i = 2; i < 10; i++) {
            if (a % i == 0) {
                c = 1;
                break;
            }
            if (c == 1) {
                System.out.println(a + "is not Prime number");
            } else {
                System.out.println(a + "is Prime number");
            }
        }
    }

    public void factor(int a) {
        int fact = 1;
        int i;
        for (i = 1; i < a; i++) {
            if (a % i == 0) {
                System.out.println("Factor of number is " + i);
            }
        }
    }
}
