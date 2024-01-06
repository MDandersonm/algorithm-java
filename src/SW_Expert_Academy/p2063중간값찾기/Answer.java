package SW_Expert_Academy.p2063중간값찾기;
//re

import java.util.*;

public class Answer {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int[] scores = new int[T];
        for (int test_case = 0; test_case < T; test_case++) {
            int num =sc.nextInt();
            scores[test_case]=num;
        }

        Arrays.sort(scores);
        System.out.println(scores[T/ 2]);

    }
}