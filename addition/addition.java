
class add {
    void disp() {
        int a, b, c;
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Addtion of two numbers is " + c);
    }
}

class addition extends add {
    public static void main(String[] args) {
        add x = new add();
        x.disp();
    }
}