package Test;

import java.time.Duration;

public class PeriodAndDuration {

    public static void main(String[] args) {

//        LocalDate startDate = LocalDate.of(2015, 2, 20);
//        LocalDate endDate = LocalDate.of(2017, 1, 15);
//
//        Period period = Period.between(startDate, endDate);
//
//        System.out.println("DIFFERENCE: ");
//        System.out.println("Years: " + period.getYears());
//        System.out.println("Months: " + period.getMonths());
//        System.out.println("Days: " + period.getDays());
//
//
//        System.out.println(period.isNegative());
//
//        Period fromUnits = Period.of(3, 10, 10);
//        Period fromDays = Period.ofDays(50);
//        Period fromMonths = Period.ofMonths(5);
//        Period fromYears = Period.ofYears(10);
//        Period fromWeeks = Period.ofWeeks(40);
//
//        System.out.println(fromWeeks.getYears());

//
//        Period fromCharUnits = Period.parse("P2Y3M5D");
//        fromCharUnits = fromCharUnits.plusDays(50);
//        System.out.println(fromCharUnits.getYears());
//
//        Instant start = Instant.parse("2017-10-03T10:15:30.00Z");
//        Instant end = Instant.parse("2017-10-03T10:16:30.12Z");
//
//        Duration duration = Duration.between(start, end);
//        System.out.println(duration.getNano());

//        LocalTime start = LocalTime.of(1, 20, 25, 1024);
//        LocalTime end = LocalTime.of(3, 22, 27, 1544);
//
//        System.out.println(Duration.between(start, end).getSeconds());


//        Duration fromHours = Duration.ofHours(10);
//        Duration fromMinutes = Duration.ofMinutes(12);
//
//        System.out.println(fromHours.getSeconds());
//        System.out.println(fromMinutes.getSeconds());


        Duration fromChar1 = Duration.parse("P1DT1H10M10.5S");

        System.out.println(fromChar1.toDays());

    }

}
