package main.main.Program;

class Test<T, U> {

     T o1;
     U o2;


         Test(T o1, U o2)
         {
             this.o1 = o1;
             this.o2 = o2;
         }
         public void print()
         {
             System.out.println(o1);
             System.out.println(o2);
         }
     }
     public class Genric2 {
         public static void main(String[] args) {
             Test<String, Integer> obj = new Test<String, Integer>("tree", 20);
             obj.print();
         }
     }

