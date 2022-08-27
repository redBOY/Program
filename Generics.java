package main.main.Program;

class est {
    static <T> void genrics (T element)
    {

        System.out.println(element.getClass().getName()+"="+ element);
    }
    public static void main(String[] args) {
        genrics(3466);
        genrics("xyz");
        genrics(2.9);
    }
}

