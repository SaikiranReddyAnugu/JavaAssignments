import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PingHost {
    /**
     * This method will ping any host ( given as input ) and computes the median of the time taken to ping
     * @param host
     */
    public static void getPingTime(String host){
       String command="ping -c 7 "+host;
        try {
                Process p = Runtime.getRuntime().exec(command);
                BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
                float[] time=new float[7];
                int i=0;
                String s = "";
                while ((s = inputStream.readLine()) != null && i<7) {
                    if(s.contains("time")){
                    String[] str=s.split("time",0);
                        int x=str[1].indexOf("ms");
                        time[i]=Float.parseFloat(str[1].substring(1,x-1));
                        i++;
                    }
                }
                Arrays.sort(time);
                int median=(time.length+1)/2;
                System.out.println("Median of the time taken to ping "+host+":"+time[median-1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            String ip = "www.google.com";
            getPingTime(ip);


        }
    }


