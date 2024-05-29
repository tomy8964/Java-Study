package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("now = " + now);
        System.out.println("of = " + of);

        // 날짜와 시간 분리
        LocalDate localDate = of.toLocalDate();
        LocalTime localTime = of.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산 (불변)
        LocalDateTime ofPlus = of.plusDays(1000);
        System.out.println("ofPlus = " + ofPlus);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + now.isBefore(of));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + now.isAfter(of));
        System.out.println("현재 날짜시간이 지정 날짜시간이 같은가? " + now.isEqual(of));
    }
}
