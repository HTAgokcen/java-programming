package day_14_multi_Branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        System.out.println("Choose your language");
        int selection = 5;
        if (selection ==1) {
            System.out.println("hello, thank for your call");
        }
        else if (selection ==2) {
            System.out.println("hola, gracias para llamar");
        } else if (selection ==3) {
            System.out.println("merhaba, aradiginiz icin tesekkurler");

        } else if (selection ==4) {
            System.out.println("privet, spasiko za vash zvonok");
        } else if (selection==5) {
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("Lets talk java and english, hello");
        }


    }

}
