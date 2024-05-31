package time.test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 01, 01, 00, 00);
        System.out.println("기준 시작 = " + dt);
        LocalDateTime plusDt = dt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + plusDt);

        LocalDate localDate = LocalDate.of(2024, 01, 01);
        for (int i = 1; i < 6; i++) {
            System.out.println("날짜 " + i + ": " + localDate);
            localDate = localDate.plusWeeks(2);
        }

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);
        Period between = Period.between(startDate, endDate);
        System.out.println("남은 기간 : "
                + between.getYears() + "년 "
                + between.getMonths() + "개월 "
                + between.getDays() + "일");
        long dDay = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("디데이 : " + dDay + "일 남음");

        int year = 2024;
        int month = 1;

        LocalDate ld1 = LocalDate.of(year, month, 1);
        System.out.println("firstDayofWeek = " + ld1.getDayOfWeek());
        System.out.println("lastDayOfWeek = " + ld1.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());

        ZonedDateTime seoulTime = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("seoulTime = " + seoulTime);
        System.out.println("londonTime = " + londonTime);
        System.out.println("nyTime = " + nyTime);

        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year1 = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month1 = scanner.nextInt();

        printCalendar(year1, month1);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayofMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayofNextMonth = firstDayofMonth.plusMonths(1);

        int offsetWeekDays = firstDayofMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayofMonth;
        while (dayIterator.isBefore(firstDayofNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
