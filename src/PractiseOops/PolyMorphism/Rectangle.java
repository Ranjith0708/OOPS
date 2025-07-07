package PractiseOops.PolyMorphism;

public class Rectangle extends Shapes{
    static void draw(){
        System.out.println("Draw");
    }
    void areaCal(){
        System.out.println("Area calculation of shape rectangle will be l*b");
    }

    int areaCal(int num){
        System.out.println("Area calculation of shape rectangle will be l*b");
        return num;
    }
}
