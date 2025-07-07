package PractiseOops.InheritancePrac;

public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        Box box = new Box(1,2,3); //Creating box as refernce and Box() as object
        BoxWeight boxWeight = new BoxWeight(1,2,3,4); //Creating boxweight as reference and boxweight as object
        System.out.println(boxWeight.b); //Can access both parent fields and child fields
        Box box1 = new BoxWeight(1,2,3,4); //Creating box1 (Box as reference) and box weight(BoxWeight()) as instance;
        //System.out.println(box1.weight); // Cant access the weight variable of BoxWeight.
         /** So it's important to understand that  we have access to fields which are type of reference (Box is type of reference Box).We cant access
         * child instance fields if its reference is type of Parent.
         * Because Java uses the reference type to decide what members (fields and methods) can be accessed at compile time.
         * Note :Declaration part happens at compile time ,initialization happens at run time.
         **/
//         BoxWeight boxWeight1 = new Box(1,2,3); cant do because parent class dont know what is in child this missess the fields weight to initialize
    }
}
