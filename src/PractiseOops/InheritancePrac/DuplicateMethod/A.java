package PractiseOops.InheritancePrac.DuplicateMethod;

public interface A {
    void greet();
    default void test(){
        System.out.println("Hello I am from A Test");
    }
    private void sample(){
        System.out.println("Hello I am private");
    }
}
