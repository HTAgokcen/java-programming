package day57_abstraction_polymorhism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }
    /**
     * class can extend one abstract class. class can implement multiple interface class
     */
    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }

    //overirde-> static method is hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");

    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overriden version is called- " + num);
    }
}
