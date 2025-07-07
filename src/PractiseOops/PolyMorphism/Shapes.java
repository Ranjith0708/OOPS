package PractiseOops.PolyMorphism;

public class Shapes {
    int num=5;
    void area(){
        System.out.println("Area of shape will be calculated depends on type of the shape");
    }
    static final void calculate(){
        System.out.println("final");
    }
    static final void calculate(String a){
        System.out.println(a);
    }
    static void show(){
        System.out.println("Static from shape");
    }
}
