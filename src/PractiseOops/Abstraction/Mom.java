package PractiseOops.Abstraction;

public abstract class Mom extends Parent{
    Mom(){
        super(40,"Mom");
    }

    @Override
    void career(){
        System.out.println("Tailor");
    }

    abstract void childCareer(String profession);
}
