package day59_polmothism_exceptions.exception_handling;

/**
 * RUNTIMEEXCEPTION happens in below code, code compiles fine and during
 */

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10/2);
        System.out.println(10/0);
        System.out.println(10/3);
    }
}
