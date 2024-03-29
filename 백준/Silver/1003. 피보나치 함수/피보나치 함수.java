import java.util.*;

public class Main {
    static int dp[][] = new int[41][2];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp[0][0] = 1; dp[0][1] = 0;
        dp[1][0] = 0; dp[1][1] = 1;
        for(int i = 2; i < 41; ++i){
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }
        for(int i = 0; i < n; ++i){
            int num = sc.nextInt();
            System.out.println(dp[num][0] + " " + dp[num][1]);
        }
    }

}