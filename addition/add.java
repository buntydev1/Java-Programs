
class add {
    void disp() {
        int a, b, c;
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Addtion of two numbers is " + c);
    }
}

class Addition extends Add {
    public static void main(String[] args) {
        Add x = new Add();
        x.disp();
    }
}