package PractiseOops.InheritancePrac;

public class Box {
    int l;
    int b;
    int w;
    private int h;

    Box() {
        System.out.println("Inside parent constructor");
        this.l=-1;
        this.b=-1;
        this.w=-1;
    }
    Box(Box box){
        this.l=box.l;
        this.w=box.w;
        this.h=box.h;
    }

    Box(int l,int w,int b){
        this.l=l;
        this.w=w;
        this.b=b;
    }
}
