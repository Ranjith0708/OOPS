package PractiseOops.Abstraction;

public abstract class Dad extends Parent{
    Dad(){
        super(45,"Father");
    }

    @Override
    void career(){
        System.out.println("Farmer");
    }
    @Override
    abstract void childCareer();


}
