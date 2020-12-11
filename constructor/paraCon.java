
class para {
    int a = 10;
    int b = 20;

    para(int x, int z) {
        x = a;
        z = b;
        System.out.println(x, z);
    }
}

class paraCon extends para {
    para r = new para();
}