import java.io.*;

class marksheet {
    int rno, m1, m2, m3, total;
    float per;
    String name, cls;

    marksheet() {
        System.out.println("Example of marksheet");
        System.out.println("-----------------------");
    }

    marksheet(int no, String nm, int s1, int s2, int s3) {
        no = rno;
        nm = name;
        s1 = m1;
        s2 = m2;
        s3 = m3;
    }

    void process() {
        if (m1 >= 33 && m2 >= 33 && m3 >= 33) {
            total = m1 + m2 + m3;
            per = total / 3;
            if (per > 70) {
                cls = "Distintion";
            } else if (per > 60) {
                cls = "First class";
            } else if (per > 50) {
                cls = "Second class";
            } else {
                cls = "pass class";
            }
            System.out.println("-----------------------------------------");
            System.out.println("Name " + name);
            System.out.println("Roll no " + rno);
            System.out.println("Mark 1 " + m1);
            System.out.println("Mark 2 " + m2);
            System.out.println("Mark 3 " + m3);
            System.out.println("Total " + total);
            System.out.println("Percentage " + per);
            System.out.println("Class " + cls);
            System.out.println("------------------------------------------");
        } else {
            System.out.println("You are  failed");
        }
    }
}

class mark_sheet {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter your roll no ");
        int rno = Integer.parseInt(br.readLine());
        System.out.println("Enter your name ");
        String nm = br.readLine();
        System.out.println("Enter mark 1 ");
        int m1 = Integer.parseInt(br.readLine());
        System.out.println("Enter mark 2 ");
        int m2 = Integer.parseInt(br.readLine());
        System.out.println("Enter mark 3 ");
        int m3 = Integer.parseInt(br.readLine());
        marksheet x = new marksheet();
        marksheet z = new marksheet(rno, nm, m1, m2, m3);
        z.process();
    }
}
