package PractiseOops.Staticpractise;

/***static class OuterClass2{
} -> Here static class is not allowed because if its static it should belongs to some class directly outer class cannot be static
inner class depends on outerclass so it can be static.***/

class OuterClass2{
    static String commonField;
    String instanceField;

    OuterClass2(String commonField,String instanceField){
        OuterClass2.commonField=commonField;
        this.instanceField=instanceField;

    }

}
public class OuterClass {
    /***
     * Static blocks are blocks used to instantiate predefined values if that class needed means.
     * It will execute before constructor and only one time it will execute.
     * Eg.If you create 10 objects but one time only this static will execute.
     * Inside a static block, you can:
     * Declare and use local (non-static) variables.
     * Create objects of the class.
     * Call static and non-static methods via object references.
     * Initialize static variables.
     ***/
    static {
        System.out.println("Hi I am static block of outerclass");
    }
    static class InnerClass{
        String name;
        static String company;
        InnerClass(String name,String companyName){
            this.name = name;
            InnerClass.company=companyName;
        }

        public static void main(String[] args) {
            System.out.println("I am from inner class");
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass("Ranjith","ABC");
        InnerClass innerClass2 = new InnerClass("Lavanya","DEF");
        System.out.println(innerClass.name);
        System.out.println(InnerClass.company);
        System.out.println(innerClass2.name);
        System.out.println(InnerClass.company);
        /***
         * For above example output will be Ranjith,DEF,Lavanya,DEF.Analyse why value of innerClass.name changed for static class.It should be common for all instance right?
         * Because that innerclass is static means it should common for all instances of outerclass not for inner class.
         * Since company is comman for all instances of the class it changed the company name of Ranjith also.Lets see how it behaves when its a outer class.
         ***/
        OuterClass2 outerClass21 = new OuterClass2("ABC","instance 1");
        System.out.println(OuterClass2.commonField);
        OuterClass2 outerClass22 = new OuterClass2("CDE","instance 2");
        System.out.println(OuterClass2.commonField);
        /***
         *One more thing you need to observe check static block outer class.
         ***/

    }
}
