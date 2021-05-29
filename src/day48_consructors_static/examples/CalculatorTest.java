package day48_consructors_static.examples;

public class CalculatorTest {
    public static void main(String [] args){
        //add is static method, can be called using Classname.staticMethodNme
        Calculator.add(5,3);

     // calculator.multiply(2,4); ERROR: Multiply is not static. need to object to call it
       // multiply is instance method and we are creating object then calling it
        Calculator calculator = new Calculator();
        calculator.multiply(2,4);
        //static method also be called using an object
        //calObject.add(10,45);
    }

}
