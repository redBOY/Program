package main.main.Program;

public class covarient {
    Object m1() {
        return new Object();
    }
}
class B extends covarient {

        @Override
String m1() {
    return new String("ram");
}
}
class tst {
    public static void main(String[] args) {
        System.out.println("valid program");
        B obj = new B();
        System.out.println(obj.m1());
    }
    }

