package day35_methods_with_param;

public class MehodsWithParams {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        int count = 55;
        displayValue(count);
        greetByName("Saim");
        greetByName("Nadir");
        String name = "Suleyman";
        greetByName(name);
    }

    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }

    /**
     * method name: greetByName
     * @param/input: String name
     * it prints"Hello {name}, how are you today?
     */
    public static void greetByName(String name){
        System.out.println("Hello "+name+" how are you today?");

    }
}
