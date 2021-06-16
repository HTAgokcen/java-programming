package day_14_multi_Branch_if_statements;

public class DayActivitiy {
    public static void main(String[] args) {
        String weather = "windy";
        if (weather.equals("sunny")) {
            System.out.println(weather + " - go to park, hiking, and code java");
        } else if (weather.equals("rainy")) {
            System.out.println(weather + " - stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather + " -clean the car then build snow man, drink salep");
        } else if (weather.equals("windy")) {
            System.out.println(weather + "- Get ready for power loss, code java");
        } else {
            System.out.println("just keep coding java");
        }
    }
}