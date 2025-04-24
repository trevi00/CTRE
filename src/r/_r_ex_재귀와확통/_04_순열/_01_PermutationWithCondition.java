package r._r_ex_재귀와확통._04_순열;

public class _01_PermutationWithCondition {
    static int n;
    static int r;
    static int[] nums;
    static boolean[] visited;
    static int x;
    static int k;

    static void perm(int depth, int sum, int xCnt){
        if (depth == r) {
            if (sum == k && xCnt > 0) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < r; i++) {
                    sb.append(nums[i]).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
            return; // ✅ 이거 꼭 필요
        }

        for (int i = 0; i <= n; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            nums[depth] = i; // ✅ 선택한 숫자 저장
            perm(depth + 1, sum + i, x == i ? xCnt + 1 : xCnt);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        n = 5;
        r = 3;
        x = 3;
        k = 9;

        nums = new int[r];
        visited = new boolean[n + 1];
        perm(0, 0, 0);
    }
}

