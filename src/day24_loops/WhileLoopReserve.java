package day24_loops;

public class WhileLoopReserve {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            System.out.println("counter = " + count);
            count--;
        }
        System.out.println("Finished the count");

        int unreadSMS = 10;
        /*
         * read each meassege 1 buy 1 until you have 0 unread sms
         * while unreadSMS is m ore than 0. read one by one
         */
        System.out.println("I have total " + unreadSMS + " unread SMS");

        while (unreadSMS >= 0) { // >=1 olsa work
            --unreadSMS;
            System.out.println("Reading SMS : " + unreadSMS);

        }
        System.out.println("No more unread SMS messages");
    }
}
