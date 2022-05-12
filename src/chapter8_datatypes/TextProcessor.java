package chapter8_datatypes;

public class TextProcessor {
    public static void main(String[] args){
        countWords("How many words there!");
        reverseString("Reverse this phrase");
        addSpaces("SplitThisTextWithSpaces!");
    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for(int i =0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    public static void reverseString(String text) {
        for(int i = text.length()-1; i>=0; i--) {
        System.out.println(text.charAt(i));}
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words:",numberOfWords);
        System.out.println(message);

        for(int i = 0; i<numberOfWords; i++)
        {
            System.out.println(words[i]);
        }
    }
}
