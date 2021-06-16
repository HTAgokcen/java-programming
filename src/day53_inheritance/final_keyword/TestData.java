package day53_inheritance.final_keyword;

public final class TestData {
    /**
     * TestData class that has a list of Constant
     * Values of below variables cannot be change anywhere
     */


    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "password123";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;
}
//class Child extends TestData{ -> ERROR, cannot inherit from final class

//}