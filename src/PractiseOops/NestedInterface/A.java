package PractiseOops.NestedInterface;

public interface A {
        interface Inner extends A {  // implicitly public static
            void show();
        }
        void check();
}
class C {

}

class B implements A.Inner{
    @Override
    public void show(){
        System.out.println("Inner show");
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }

    @Override
    public void check() {
        System.out.println("Check");
    }
}
