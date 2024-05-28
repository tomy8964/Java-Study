package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String input = scanner.nextLine();
        AuthGrade grade = AuthGrade.valueOf(input);
        System.out.println("당신의 등급은 " + grade.getDescription() + "입니다.");
        grade.printMenu();
    }
}
