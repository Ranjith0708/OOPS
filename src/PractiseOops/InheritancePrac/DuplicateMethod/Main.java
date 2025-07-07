package PractiseOops.InheritancePrac.DuplicateMethod;

public class Main {
    public static void main(String[] args) {
        A c = new C(); //Method dispatching - while compiling it just checked that A has test method or not but while running it ran C's test method
        c.test();
    }

     void name(){
        System.out.println("Hi");
    }
}
