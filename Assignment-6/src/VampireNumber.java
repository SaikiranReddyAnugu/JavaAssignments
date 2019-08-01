import javax.swing.text.html.ListView;
import java.awt.*;
import java.util.Arrays;

public class VampireNumber {
    static int count=0;
    long firstFactor;
    long secondFactor;

    /**
     * prints the vampire numbers
     */
    public void isVampire() {
       for (long num = 1000; count <= 100; num++) {
            int numLength=(String.valueOf(num)).length();
            if (numLength % 2 == 0) {
                int firstFactorLength = ((numLength) / 2) - 1;
                for (firstFactor = (long) (Math.pow(10, firstFactorLength)); firstFactor <= Math.sqrt(num); firstFactor++) {
                    if (num % firstFactor == 0) {
                        secondFactor = num / firstFactor;
                        if (String.valueOf(firstFactor).length() == firstFactorLength + 1 && String.valueOf(secondFactor).length() == firstFactorLength + 1) {
                            if (validateFactors(firstFactor, secondFactor, num)) {
                                System.out.println(num);
                                count++;
                            }

                        }
                    }
                }
            }
            }
    }

    /**
     * This method takes two Factors of a number and that number as inputs
     * then determines whether the two numbers are valid Vampire numbers to it.
     * @param firstNum
     * @param secondNum
     * @param number
     * @return boolean value
     */

    public boolean validateFactors(long firstNum,long secondNum,long number){
        char[] firstFactorString=String.valueOf(firstNum).toCharArray();
        char[] secondFactorString=String.valueOf(secondNum).toCharArray();
        char[] FactorString=String.valueOf(""+firstNum+secondNum).toCharArray();
        char[] numberString=String.valueOf(number).toCharArray();
        if(firstNum%10==0&& secondNum%10==0){
            return false;
        }
            Arrays.sort(FactorString);
            Arrays.sort(numberString);
            if (Arrays.equals(numberString, FactorString))
                return true;
      return false;
    }
public static void main(String args[]){
        VampireNumber v=new VampireNumber();
         v.isVampire();
}
}
