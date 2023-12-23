package SW_Expert_Academy.p2050알파벳을숫자로변환;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t=sc.nextLine();
        for(int i=0; i<t.length();i++){
            char c = t.charAt(i);
            int k=c-'A';
            System.out.print(k+1+" ");

        }


    }
}
