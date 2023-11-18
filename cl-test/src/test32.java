public class test32 {
    private static final int MOD = 1_000_000_007;

    public int solution(int n, int k) {
        int[][][] dp = new int[k + 1][n + 1][n + 1];

        // 첫 번째 점프는 어떤 거리든지 점프할 수 있음
        for (int i = 1; i <= n; i++) {
            dp[1][i][i] = 1;
        }

        for (int jump = 2; jump <= k; jump++) {
            for (int pos = 1; pos <= n; pos++) {
                for (int prevJump = 1; prevJump < pos; prevJump++) {
                    for (int j = 0; j < prevJump; j++) {
                        dp[jump][pos][prevJump] += dp[jump - 1][pos - prevJump][j];
                        dp[jump][pos][prevJump] %= MOD;
                    }
                }
            }
        }

        // 마지막 위치 n에서 k번 점프한 경우의 수를 모두 더한다.
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += dp[k][n][i];
            result %= MOD;
        }
        return result;
    }

    public static void main(String[] args) {
        test32 sol = new test32();
        System.out.println(sol.solution(9, 3));  // 3
        System.out.println(sol.solution(10, 2));  // 4
        System.out.println(sol.solution(9, 4));  // 0
    }
}

