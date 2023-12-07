package SW_Expert_Academy.p2025N줄덧셈;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int r=func(a);
        System.out.println(r);

    }
    public static int func(int num){
        if(num==0){
            return 0;
        }else{
            return num+func(num-1);
        }
    }
}
/*
재귀 함수를 사용하여 1부터 n까지의 합을 구하는 것과 위에서 제시한 for문을 사용하는 방법의 시간 복잡도와 공간 복잡도 측면에서의 차이를 살펴보겠습니다.

For문을 사용한 방법:

시간 복잡도: O(n)
공간 복잡도: O(1)
간단한 루프를 돌면서 n까지의 합을 구합니다. 공간 복잡도 측면에서 추가적인 메모리를 거의 사용하지 않습니다.

재귀 함수를 사용한 방법:

시간 복잡도: O(n)
공간 복잡도: O(n)
각 재귀 호출마다 스택 프레임이 생성되므로 n번의 재귀 호출이 있으면 스택 메모리에 n개의 스택 프레임이 쌓이게 됩니다. 이로 인해 공간 복잡도가 O(n)이 됩니다.

결론:

시간 복잡도 측면에서는 두 방법 모두 O(n)으로 동일합니다.
그러나 공간 복잡도 측면에서 for문을 사용한 방법이 O(1)로 재귀 함수를 사용한 방법의 O(n)에 비해 훨씬 효율적입니다.
또한, 재귀 함수는 스택 오버플로우의 위험이 있습니다. 주어진 문제에서 n이 10,000까지라고 했을 때, 대부분의 환경에서 재귀 함수로 이 값을 처리하면 스택 오버플로우가 발생합니다.
따라서 이러한 문제에서는 for문을 사용하는 것이 재귀함수를 사용하는 것보다 더 좋습니다.
 */