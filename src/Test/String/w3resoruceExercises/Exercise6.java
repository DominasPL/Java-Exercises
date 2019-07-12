package Test.String.w3resoruceExercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise6 {

    public static void main(String[] args) {

        //Write a java program to print current date and time in the specified format.
        LocalDateTime now = LocalDateTime.now();

        String currentDateAndTime = getCurrentDateAndTime(now);
        System.out.println(currentDateAndTime);

        //String do LocalDateTime
        LocalDateTime localDateTime = formatStringToLocalDateTime(currentDateAndTime);
        System.out.println(localDateTime);


    }

    private static String getCurrentDateAndTime(LocalDateTime now) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return formatter.format(now);

    }

    private static LocalDateTime formatStringToLocalDateTime(String strDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.parse(strDate, formatter);

        return localDateTime;

    }




}
