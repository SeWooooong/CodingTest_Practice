import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 1;
        Arrays.sort(targets, (t1, t2) -> {
            if(t1[1] == t2[1]) return t1[0] - t2[0];
            return t1[1] - t2[1];
        });
        int now = targets[0][1];
        for(int i = 1; i < targets.length; ++i){
            if(now <= targets[i][0]) {
                now = targets[i][1];
                answer++;
            }
        }
        return answer;
    }
}