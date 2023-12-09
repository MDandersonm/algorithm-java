package SW_Expert_Academy.p2029몫과나머지출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0 ;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(String.format("#%s %d %d",i+1,a/b,a%b));



        }


    }
}
