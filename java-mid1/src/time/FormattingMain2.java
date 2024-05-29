package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13,30, 59);
        System.out.println("date = " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDateTime);

        // 파싱 : 문자를 날짜와 시간으로
        String input = "2024-01-01 13:30:59";
        LocalDateTime parsedDateTime = LocalDateTime.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDateTime);
    }
}
