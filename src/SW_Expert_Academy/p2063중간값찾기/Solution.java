package SW_Expert_Academy.p2063중간값찾기;
// 정렬과 리스트
//re


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        List<Integer> list1= new ArrayList<>();
        for (int test_case = 1; test_case <= T; test_case++) {
            int num =sc.nextInt();
            list1.add(num);
        }
        Collections.sort(list1);
        System.out.println(list1.get(T/ 2));

    }
}