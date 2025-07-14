package PractiseOops.Staticpractise;

public class Outer {
    static class Inner {
        void display() {
            System.out.println("Static nested class");
        }
    }

    class Sample{
        void check(){
            System.out.println("Sample class");
        }
    }

    public static void main(String[] args) {
        Outer.Inner out = new Outer.Inner(); //When you defined inner class as static u can directly create object like this
        out.display();
//        Outer.Sample sample = new Outer.Sample(); //When its non static class u cant
        Outer outer = new Outer();
        Outer.Sample outerSam = outer.new Sample(); //this is the way of creating object of non static inner class


    }
}
