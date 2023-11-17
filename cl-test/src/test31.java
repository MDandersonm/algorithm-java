import java.util.HashMap;

public class test31 {
    private static final int MOD = 1_000_000_007;
    private static HashMap<String, Integer> memo = new HashMap<>();

    public static int findWays(int pos, int k, int lastJump) {
        if (k == 0) {
            return pos == 0 ? 1 : 0;
        }

        String key = pos + "," + k + "," + lastJump;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int ways = 0;
        for (int jump = 1; jump < lastJump; jump++) {
            if (pos - jump >= 0) {
                ways += findWays(pos - jump, k - 1, jump);
                ways %= MOD;
            }
        }

        memo.put(key, ways);
        return ways;
    }

    public static int solution(int n, int k) {
        int totalWays = 0;
        for (int firstJump = 1; firstJump <= n; firstJump++) {
            totalWays += findWays(n - firstJump, k - 1, firstJump);
            totalWays %= MOD;
        }

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(solution(9, 3)); // 3
        System.out.println(solution(10, 2)); // 4
        System.out.println(solution(9, 4)); // 0
    }
}
