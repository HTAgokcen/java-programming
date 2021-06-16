package day32_arrays_split;

public class MyOwn_Reversed {
    public static void main(String[] args) {
        String sentence = "Finally winter is over, spring is here!;";
        String[] words = sentence.split(" ");
        String reversed = "";
        for(int i = words.length -1; i >= 0; i--){
            //System.out.print(words[i] + " ");
            reversed += words[i] + " ";
        }
        System.out.println(sentence);
        System.out.println(reversed);
    }
}
