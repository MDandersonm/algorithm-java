package SW_Expert_Academy.p2072홀수만더하기;
//스캐너와 반복문
import java.util.Scanner;
//re
public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++){
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if (num % 2 != 0) {
                    sum += num;
                }
            }

            System.out.println("#" + test_case + " " + sum);


        }

    }
}