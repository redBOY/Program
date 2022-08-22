package main.main.Program;

public class general {
    int square(int i)
    {
        return i*i;
    }
}
class Cir {
    general gen;
    double d = 3.14;
    double area(int radius)
    {
        gen = new general();
        int sqr = gen.square(radius);
        return d*sqr;
    }
}
class test {
    public static void main(String args[]) {
        Cir C = new Cir();
        double res = C.area(5);
        System.out.println("area of circle"+res);
    }
}
