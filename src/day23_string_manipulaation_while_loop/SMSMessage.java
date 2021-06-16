package day23_string_manipulaation_while_loop;
import java.util.Scanner;
public class SMSMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

        int o1, c1, o2, c2, o3, c3;
        o1 = message.indexOf("<");
        c1 = message.indexOf(">");
        o2 = message.indexOf("[");
        c2 = message.indexOf("]");
        o3 = message.indexOf("{");
        c3 = message.indexOf("}");
        sender = message.substring(o1+1, c1);
        phoneNumber= message.substring(o2+1, c2);
        messageBody = message.substring(o3+1, c3);

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);


    }
}
