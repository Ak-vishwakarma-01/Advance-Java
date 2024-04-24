import java.util.*;
import java.time.*;
import java.time.format.*;

class ATimeDate {
    static public void main(String[] rk) {
        LocalDate t = LocalDate.now();
        // System.out.println(t);
        // DateTimeFormatter fr = DateTimeFormatter.ofPattern("hh:mm VV");
        // System.out.println(fr.format(t));

        // System.out.print("Enter the DoB in dd-MM-yyyy format: \t");
        // Scanner sc = new Scanner(System.in);
        // String dob = sc.nextLine();
        // DateTimeFormatter fr2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // LocalDate dt = LocalDate.parse(dob, fr2);
        LocalDateTime today=LocalDateTime.now();
        DateTimeFormatter fr3 = DateTimeFormatter.ofPattern("EEEE d-MMM-yyyy");
        // System.out.println(fr3.format(dt) + "\t" + dt.getDayOfWeek());
        System.out.println(today.format(fr3));

    }
}

// Self Study: Day Light Saving 

// All the students must be prepared to explain Day Light Saving in 3 to 5 Minutes which must include:
// 1. what is Day Light Saving?
// 2. Why it is used?
// 3. How it is applied in real life?

/*
Bruce Lee is working in an IT company which is providing the Holidays on all Sundays and
2nd and 4th Saturday.
Bruce Lee wanted to know the Holidays in the Month in which his Birthday Falls so that
he can plan a long weekend Holidays.
Help Bruce Lee to find out the dates and Days of Holiday of that Month.
Read the DoB from Command Line Arguments.

Input Format: 2002-10-05
OutFormat: 2002-10-03 Sunday
2002-10-09 Saturday
2002-10-10 Sunday
2002-10-17 Sunday
2002-10-23 Saturday
2002-10-24 Sunday
2002-10-31 Sunday



*/