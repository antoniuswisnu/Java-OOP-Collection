package PBOpraktek.TugasAbstractStaticFinal.No3;

public class Person {
    static int instanceCount;
    int localCount;

    Person(){
        this.instanceCount++;
        this.localCount++;
    }
}
