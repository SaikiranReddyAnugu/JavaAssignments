import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceChecker {
    /**
     *This method checks a sentence to see that it begins
     * with a capital letter and ends with a period
     * @param sentence
     */
    public static void check(String sentence){
        Pattern p = Pattern.compile("[A-Z](.*)(.)");//. represents single character
        Matcher m = p.matcher(sentence);
        if(m.matches())
            System.out.println("It is a sentence");
        else System.out.println("It is not a sentence");
    }
    public static void main(String args[]){
        check("Hai iuahfjk hhks.");
    }

}
