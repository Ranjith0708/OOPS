package PractiseOops.InheritancePrac.DuplicateMethod;

public interface B {
    void greet();
    default void test(){
        System.out.println("Hello I am from B Test");
    }
}
