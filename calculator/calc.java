import java.io.*;
import arithmatic.*;

class calc {
    public static void main(String[] args) {
        calculator x = new calculator();
        x.add(10, 20);
        x.sub(20, 10);
        x.mul(5, 4);
        x.div(50, 5);
        x.si(10000, 10, 2);
    }
}