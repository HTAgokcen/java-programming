package reblit;

public class MycodeTest {
    public static void main(String[] args) {
        //switch statement
        int restaurantRating = 8;
        switch(restaurantRating) {
            default:
                System.out.println("I never dine in this restaurant");
                break;
            case 1 :
                System.out.println("This restaurant is not my favourite");
                break;
            case 2 :
                System.out.println("This restaurant is good");
            break;
            case 3:
                System.out.println("This restaurant is fantastic");
                break;


        }
    }
}
