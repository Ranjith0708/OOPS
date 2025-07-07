package PractiseOops.Abstraction;

public abstract class Parent {
    int age;
    String relation;
    Parent(int age,String relation){
        this.age=age;
        this.relation=relation;
    }
     void ageOfParent(){
         System.out.println(relation+" has age of"+age);
     }


     abstract void career();
    abstract void childCareer();

}
