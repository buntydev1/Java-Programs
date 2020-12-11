
class cons {
    cons() {
        System.out.println("This is constructor");
    }
}

class constructor extends cons {
    public static void main(String[] args) {
        cons x = new cons();
    }
}