public class Exp6 {

    public static boolean isSubsetSum(int[] arr, int targetSum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][targetSum + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= targetSum; j++) {
                if (j < arr[i - 1])
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
            }
        }

        return dp[n][targetSum];
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int targetSum = 9;
        System.out.println("Can a subset sum to " + targetSum + "? : " + isSubsetSum(arr, targetSum));
    }
}
