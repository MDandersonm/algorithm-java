package SW_Expert_Academy.p2056연월일달력;

import java.util.Scanner;
//re
public class Solution {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();  // 이 부분을 추가하여 줄 바꿈 문자를 제거합니다.
        for(int test_case = 1; test_case <= T; test_case++){
                String str = sc.nextLine();
//sc.nextInt()는 정수만 읽기 때문에 줄 바꿈 문자(\n)는 입력 버퍼에 남아있습니다.
 //따라서 바로 다음에 sc.nextLine()을 호출하면 줄 바꿈 문자만 읽어 오기 때문에 str 변수에 빈 문자열이 저장됩니다.
                String year=str.substring(0,4);
                String month= str.substring(4,6);
                String day = str.substring(6,8);
                Integer integer_month= Integer.valueOf(month);
                Integer integer_day=Integer.valueOf(day);
//            System.out.println(month);
  //          System.out.println(integer_month);;

                if (integer_month<1 || integer_month>12){
                    System.out.println(String.format("#%s -1",test_case));
                } else if (( (integer_month ==1)||(integer_month ==3)||(integer_month ==5)||(integer_month ==7) ||
                        (integer_month ==8)||(integer_month ==10)||(integer_month ==12)) && (integer_day>=1 &&integer_day <=31) ) {
                    System.out.println(String.format("#%s %s/%s/%s",test_case,year,month,day));

                }else if (( (integer_month ==4)||(integer_month ==6)||(integer_month ==9)||(integer_month ==11)) && (integer_day>=1 &&integer_day <=30) ) {
                    System.out.println(String.format("#%s %s/%s/%s",test_case,year,month,day));
                }else if (( (integer_month ==2)) && (integer_day>=1 &&integer_day <=28) ) {
                    System.out.println(String.format("#%s %s/%s/%s",test_case,year,month,day));
                }else{
                    System.out.println(String.format("#%s -1",test_case));
                }
        }

    }
}