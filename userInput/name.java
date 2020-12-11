
import java.io.*;

class demo {
    void disp(String nm) {
        System.out.println("Your name is " + nm);
    }
}

class In_demo {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter your name ");
        String r = br.readLine();

        demo x = new demo();
        x.disp(r);
    }
}