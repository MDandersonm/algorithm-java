package SW_Expert_Academy.p2056연월일달력;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();  // 줄 바꿈 문자 제거

        for (int t = 1; t <= T; t++) {
            String dateStr = scanner.nextLine();
            String result = validateDate(dateStr);
            System.out.println("#" + t + " " + result);
        }

        scanner.close();
    }

    private static String validateDate(String dateStr) {
        if (dateStr.length() != 8) {
            return "-1";
        }

        int year = Integer.parseInt(dateStr.substring(0, 4));
        int month = Integer.parseInt(dateStr.substring(4, 6));
        int day = Integer.parseInt(dateStr.substring(6, 8));

        if (month < 1 || month > 12) {
            return "-1";
        }

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (day < 1 || day > daysInMonth[month - 1]) {
            return "-1";
        }

        return String.format("%04d/%02d/%02d", year, month, day);
    }
}
