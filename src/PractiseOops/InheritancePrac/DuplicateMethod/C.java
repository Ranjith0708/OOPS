package PractiseOops.InheritancePrac.DuplicateMethod;

public class C implements A,B{
    @Override
    public void greet(){
        System.out.println("Hello");
    }

    @Override
    public void test() {
        B.super.test();
    }



}
