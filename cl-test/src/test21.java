public class test21 {
    public static long solution(int n, int m) {
        int k = n + m;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * (k - i + 1) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 1)); // 2
        System.out.println(solution(1, 2)); // 3

    }
}
