package PractiseOops.AccessModifiersPrac.test;

public class C extends A{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.l+" "+a.s+" "+a.m);
    }

    public void message(){
        System.out.println("Hi from class C");
    }
}
