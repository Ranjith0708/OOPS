package PractiseOops.PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.area();
        shapes = new Circle();
        shapes.area();
        System.out.println(shapes.num);
        Shapes s = new Rectangle();
        s.area();
        Rectangle c = null;
        c.draw();
        System.out.println(shapes.toString());

        //Method overloading - compile time polymorphism or static polymorphism
        Numbers num = new Numbers();
        num.sum(1,2);
        num.sum(1,2,3);
        num.sum(1.0,2); // All these three method calls are decided during compile time itself
        // even the same name java resolves which one to be called during compile time itself

        Shapes shapes1 = new Circle();
        shapes1.show();
        Circle circle = new Circle();
        Circle.show();
    }
}
