class xyz {
    void disp() {
        System.out.println("HELLO");
    }

    void disp(String s) {
        System.out.println("Welcome " + s);
    }

    void disp(int p) {
        System.out.println("number " + p);
    }
}

class methodOver {
    public static void main(String[] args) {
        xyz p = new xyz();
        p.disp();
        int a = 234454;
        p.disp(a);
        p.disp("Yasin");
    }
}
