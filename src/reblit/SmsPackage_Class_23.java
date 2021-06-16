package reblit;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class SmsPackage_Class_23 {
    public static void main(String[] args) {
        String message = "Sender: [ Saim ] From Number<1112223366> Message:{Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender = message.substring(start+1, end);
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text  = " + text);

        sender = sender.trim();

        if(sender.equalsIgnoreCase("Saim")) {
            System.out.println("Messsage from Saim about homework");
        } else {
            System.out.println("Someone else message");
        }

    }
}
