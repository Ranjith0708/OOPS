package PractiseOops.InheritancePrac;


//Extending box-> A parent class using extends keyword
public class BoxWeight extends Box{
    int weight; //Has its own property of weight;

    BoxWeight(int l,int w,int b,int weight){
        super(l,w,b); //Call to parent constructor should be in first line
        this.weight=weight;
        System.out.println("inside child constructor");

    }
    BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(BoxWeight boxWeight){
        super(boxWeight); //Why this did't gave error where parent class accepts param of Box. It works becaz boxweight is actually a box
        this.weight=boxWeight.weight;
    }
}
