import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Charactercount {
    /**
     * This method takes filename as command line arguments
     * and counts the occurrence of all the different characters
     * then Saves the results in a text file.
     * @param args
     * @throws IOException
     */
    public static void main(String args[]) throws IOException {
        int i;
        Map<Character,Integer> charCount=new HashMap<>();
        String filename="src/"+args[0];
        BufferedReader br = new BufferedReader(new FileReader(filename));

        while( (i=br.read())!=-1){
            char ch=(char)i;
            if(charCount.containsKey(ch))
                charCount.put(ch,charCount.get(ch)+1);
            else
                charCount.put(ch,1);
        }
        // creating a output file to store the data
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/output.txt"));

        for(Character c:charCount.keySet()){
            if(Character.isLetter(c)){
              writer.append(c+" "+charCount.get(c)+"\n");
          }
        }
        writer.close();

      }
    }
