import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KYC {
    /**
     * This method takes signUp date and Current date as String and determines
     * the range of dates for form Dates
     * @param dateInputs
     * @return Range of dates for KYC form
     * @throws ParseException
     */
    public static String anniversarySignUp(String dateInputs) throws ParseException {
        String[] dates = dateInputs.split(" ");
        DateTimeFormatter dtFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signUpDate = LocalDate.parse(dates[0],dtFormat);
        LocalDate currDate=LocalDate.parse(dates[1],dtFormat);
        String rangeofDates="";
       if(signUpDate.isBefore(currDate)){
         LocalDate AnniversaryDate=LocalDate.of(currDate.getYear(),signUpDate.getMonth(),signUpDate.getDayOfMonth());
         LocalDate startingRange=AnniversaryDate.minusDays(30);
         LocalDate endingRange=AnniversaryDate.plusDays(30);
         if(startingRange.isBefore(currDate)){
                   rangeofDates+=startingRange.format(dtFormat);
                   if(endingRange.isBefore(currDate)){
                       rangeofDates+=" "+endingRange.format(dtFormat);
                   }
                   else
                       rangeofDates+=" "+currDate.format(dtFormat);
             return rangeofDates;
         }

       }

        return "No range";
    }

    public static void main(String args[]) throws ParseException {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        Scanner sc = new Scanner(System.in);
        String[] dateInput = new String[n];
        int i=0;
        for(i=0;i<n;i++) {
            dateInput[i] = sc.nextLine();
        }
        for (i = 0; i < n; i++) {
                System.out.println(anniversarySignUp(dateInput[i]));
        }
    }

}