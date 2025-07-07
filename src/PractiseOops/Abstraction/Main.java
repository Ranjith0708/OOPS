package PractiseOops.Abstraction;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Son();
        parent.career(); //here i cannot access the childcarrer of son because during that method is not present in parent.If i add it in parent during run time it will decide which one to be get called

    }
}
