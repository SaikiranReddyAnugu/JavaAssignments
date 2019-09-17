import java.awt.*;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Files {
    /**
     *This method used to search througj the home directory and look
     * for a files that matches the given regular expression
     * @param dir
     * @param input
     */
        public static void searchDirForFile (String dir,Pattern input){
            File[] files = new File(dir).listFiles();

            for (File f : files) {
                if (f.isDirectory()) {
                     searchDirForFile(f.getPath(), input);
                }
                if(f.isFile()){
                    Matcher m=input.matcher(f.getName());
                if (m.find())
                    System.out.println(f.getPath());
               }
            }

        }
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            while(true) {
               System.out.println("Enter regular expression:");
               String regex = sc.next();
               String home = System.getProperty("user.home");
               Pattern p = Pattern.compile(regex);
               searchDirForFile(home, p);
            }
        }

}
