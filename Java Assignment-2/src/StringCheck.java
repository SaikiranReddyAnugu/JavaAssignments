import java.util.Scanner;

public class StringCheck {
    /**
     * This method checks whether the given string contains all the alphabets
     * @param input
     * @return
     *       The resultant boolean value
     * Time Complexity : O(n)
     * Space complexity: O(n)
     */
    public static boolean checking(String input){
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        int i;
        String str=input.toLowerCase();
        System.out.println();
        for(i=0;i<alphabets.length();i++){
            if(str.contains(String.valueOf(alphabets.charAt(i))))
                continue;
            else
                break;

        }
        if(i==26)
            return true;
                    return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
       if(checking(input)){
           System.out.println("Input String contains all letters from a-z");
       }
       else{
           System.out.println("Input String not contains all letter from a-z");
       }
    }
}


