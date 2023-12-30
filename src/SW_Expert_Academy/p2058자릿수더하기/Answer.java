package SW_Expert_Academy.p2058자릿수더하기;

import java.util.Scanner;

public class Answer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자연수 N 입력 받기
        int N = sc.nextInt();

        // 각 자릿수의 합을 저장할 변수 초기화
        int sum = 0;

        // N이 0이 될 때까지 반복
        while (N != 0) {
            // N의 1의 자릿수를 sum에 더함
            sum += N % 10;

            // N을 10으로 나누어 1의 자릿수를 제거
            N /= 10;
        }

        // 결과 출력
        System.out.println(sum);
    }
}

