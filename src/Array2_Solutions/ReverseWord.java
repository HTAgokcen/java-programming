package Array2_Solutions;

public class ReverseWord {
    public static void main(String[] args) {
        String sentence = "It started to snow in Chicago";
        String [] words = sentence.split(" ");
        String reversed = "";

        for(int i = words.length -1; i >= 0; i--){
            reversed += words[i] + " ";

        }
        System.out.println("Sentences = " + sentence);
        System.out.println("reversed = " + reversed);

        //how to reversed each word also?
    }

}
