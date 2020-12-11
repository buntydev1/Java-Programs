import java.io.*;

class arith {
    int a, b, c;

    arith(int p, int q) {
        a = p;
        b = q;
    }

    void addition() {
        c = a + b;
        System.out.println("Addition is " + c);
    }
}

class add1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Enter number 1  ");
        int p = Integer.parseInt(br.readLine());
        System.out.print("Enter number 2 ");
        int q = Integer.parseInt(br.readLine());
        System.out.println("-------------------------------------------------------------------");
        arith x = new arith(p, q);
        x.addition();
    }
}
