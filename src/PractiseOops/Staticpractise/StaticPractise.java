package PractiseOops.Staticpractise;


 /*
 - Static is a keyword in java which denotes that those fields are belong to Class not to instances or
 object of that class.It's common to all instances of class. No need to instantiate class to call static fields/methods
 using class name itself we can call those methods/fields
 - You cannot call non-static member inside the static method.But u can call static method inside the non-static
 */

public class StaticPractise {
    /*main is always static because when we are running that class Jvm will automatically look for main to run.Now thing is
    to run main method need to create object of that class.But by making as static no need to create JVM automatically executes that method */
    public static void main(String[] args) {
        greeting(); /***Possible because it's a static method.***/
//        greet(); - Not possible because its not static method but we can call that by using one way.Check next line how we can do that.
        StaticPractise staticPractise = new StaticPractise();
        staticPractise.greet(); /** Here I was able to call non-static method because I have created object of that class and that non-static method is accessible via instance.
        because non-static methods are belongs to instance of that class not belongs to class **/
    }
    void greet(){
        System.out.println("Hi, I am greet");
    }
    static void greeting(){
        System.out.println("Hi I am from static method greeting");
    }


    /***
     * check out how static will behave when it comes as inner class and outer class - Class within the class.
     * Example implemented in OuterClass.Java file.
     ****/
}
