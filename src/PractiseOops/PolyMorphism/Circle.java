package PractiseOops.PolyMorphism;

public class Circle extends Shapes{
    int num=10;
    void area(){
        System.out.println("Area of shape circle is calculated by pie*r*r");
    }
    static void show(){
        System.out.println("Static from child circle");
    }

//    static final void calculate(){
//        System.out.println("final");
//    }
}
