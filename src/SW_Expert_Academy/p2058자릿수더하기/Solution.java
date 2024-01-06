package SW_Expert_Academy.p2058자릿수더하기;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String T = sc.nextLine();
        int sum=0;
        for(int i=0; i<T.length(); i++){
            char c= T.charAt(i);
            int k= (int) c - (int)'0';
//            int k= c-'0'; //그냥 이렇게 해도된다.
            sum +=k;
        }
        System.out.println(sum);



    }
}