package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        System.out.println(technologies.indexOf(",")); //first comma//4
        System.out.println(technologies.lastIndexOf(","));//last comma/41

        //for middle one,we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("ccs is at index " + idxOfCss);

        int indexOfcucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfcucumber);

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("sql is at index " + indexOfSql);//sql is at index -1
        //technologies contains "maven" ?

        if(technologies.contains("maven")) {
            System.out.println("maven is present");

        } else {
            System.out.println("maven is not present");
        }

        if(technologies.indexOf("maven") >= -1 ) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }

    }
}
