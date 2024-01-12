package SW_Expert_Academy.p2071평균값구하기;
//나누기과 반올림
//re
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++){
            int sum=0;
            for( int i=0;i<10;i++){
                int num=sc.nextInt();
                sum+=num;
            }
//            int avg = (int) (sum / 10.0 + 0.5);
            double avg = sum/10.0;
            double roundedAvg= Math.round(avg);
            System.out.println("#"+test_case+" "+roundedAvg);


        }

    }
}
/*

int a = 7;
int b = 3;
int quotient = a / b;  // 2 두 수를 나누었을 때의 몫을 구하기 위해선 / 연산자를 사용하면 됩니다.

int a = 7;
int b = 3;
int remainder = a % b;  // 1 % 연산자를 사용하여 두 수의 나머지를 구할 수 있습니다.


int a = 10;
int b = 3;
int result = a / b;  // result 값은 3 정수 나눗셈에서 결과는 소수점을 버리고 정수만을 반환합니다.

double x = 10.0;
double y = 3.0;
double resultDouble = x / y;  // resultDouble 값은 3.333... 또한, 정수와 실수를 함께 나누면 결과는 실수로 반환됩니다.

int a = 10;
double y = 3.0;
double resultMix = a / y;  // resultMix 값은 3.333...
주의할 점은 0으로 나눌 경우 ArithmeticException이 발생한다는 것입니다. 따라서 나누는 수 (나눗셈에서의 분모)가 0인지 확인하는 코드가 필요할 수 있습니다.

 */